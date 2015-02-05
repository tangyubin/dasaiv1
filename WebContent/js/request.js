//获取localstorage或者cookie的信息
var AuthService=function(){
	this.login_page="/login.html";
	var auth=undefined;
	if(window.localStorage && JSON){
		auth=window.localStorage['auth'];
	}else{
		auth=$.cookies.get('auth');

	}
	if (auth == undefined) {
      window.location = this.login_page;
    }
    var expires = auth.token.expires;
    if (new Date(expires) < new Date()) {
      window.location = this.login_page;
    }
    return auth;
}
var APIService = function () {
	//暂时设置为8080；
    this.host = "localhost:8080";

  };

  APIService.prototype.error = function (data, message) {
  	//弹框提醒插件
    $.gritter.add({
      title:"API 调用异常!",
      text: message + '<br><br> 如果此问题反复出现, 请重新登陆再试一下。 <a href="/login.html">重新登陆</a>',
    });
  };

  APIService.prototype.call = function (options) {
    options['done'] = options['done'] || function (data) {
    };
    options['error'] = options['error'] || this.error;
    options['always'] = options['always'] || function () {
    };

    var action = options['action'];
    var api = this.host + action;

    var method = options['method'] || 'post';
    var data = options['data'] || {};
    var self = this;

    $.ajax({
      type: method,
      url: api,
      contentType: "application/json",
      data: data,
      beforeSend: function (request, settings) {
        var token = AuthService.token;
        request.setRequestHeader("X-Token", token);
        
      }
    })
    .done(function (data, statue, jqXHR) {
      if (typeof data == 'string') {
        try {
          data = $.parseJSON(data);
        } catch(err) {
          console.log('parse response failed. ' + data);
        }
      }

      if (data.code == 0) {
        console.log('[api:done]' + action);
        console.log(data.data);
        options['done'](data.data);
      // } else if (data.code == 403) {
      //   AuthService.clear();
      } else {
        console.log('[api:error]' + action);
        console.log(data);
        options['error'](data, data.message);
      }

      return data;
    })
    .fail(function (data) {
      console.log('[api:fail]' + action);
      console.log(data);

      var message = data;
      if (data.responseJSON && data.responseJSON.error) {
        message = data.responseJSON.error.message;
      }

    })
    
  };

  APIService.prototype.post = function (options) {
    options['method'] = 'post';
    return this.call(options);
  };

  APIService.prototype.get = function (options) {
    options['method'] = 'get';
    return this.call(options);
  };




  //登录请求示例
  $('#loginbtn').click(function(){
  	var data=new APIService().post({
  	action:'登录请求的action地址',
  	data:{username:'username',password:'pass'}
  };
  if(data.status=='success'){
  	console.log('登录成功');
  	$.gritter.add({
      title:"登录提示!",
      text:  '<br><br> 登录成功',
    });
  }

  }

  	));


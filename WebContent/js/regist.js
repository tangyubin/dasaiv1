/**
 * Created by tangyubin-pc on 2015/2/9.
 */
var usernameValidity = false,
    passwordValidity = false;
passwordConfirmValidity = false;
emailValidity = false;
roleValidity = false;
function role_choose_tips(){
    $(this).parent().next().find('.reg-tips').detach();
    if (typeof $(this).attr('tips') != 'undefined' && $(this).attr('tips') != '')
    {
        $(this).parent().next().append('<span class="reg-tips">' + $(this).attr('tips') + '</span>');
    }
}
$(document).ready(function ()
{

    $('#regist-submit').click(
        function(){
            return usernameValidity && passwordValidity && passwordConfirmValidity && emailValidity && roleValidity;
        }
    );

    verify_register_form('#register_form');

    /* 注册页面验证 */
    function verify_register_form(element)
    {
        $(element).find('[type=text], [type=password],select[name="userType"]').on({
            focus : function()
            {
                $(this).parent().next().find('.reg-tips').detach();
                if (typeof $(this).attr('tips') != 'undefined' && $(this).attr('tips') != '')
                {
                    $(this).parent().next().append('<span class="reg-tips">' + $(this).attr('tips') + '</span>');
                }
            },
            blur : function()
            {
                if ($(this).attr('tips') != '')
                {
                    switch ($(this).attr('name'))
                    {
                        case 'username' :
                            var _this = $(this);
                            $(this).parent().next().find('.reg-tips').detach();
                            if ($(this).val().length >= 0 && $(this).val().length < 2)
                            {
                                $(this).parent().next().find('.reg-tips').detach();
                                $(this).parent().next().append('<span class="reg-tips reg-err">' + $(this).attr('errortips') + '</span>');
                                usernameValidity = false;
                                return;
                            }
                            else if ($(this).val().length > 17)
                            {
                                $(this).parent().next().find('.reg-tips').detach();
                                $(this).parent().next().append('<span class="reg-tips reg-err">' + $(this).attr('errortips') + '</span>');
                                usernameValidity = false;
                                return;
                            }
                            else
                            {
                                var url = 'validUsername';
                                //var params = $('#form1').serialize();
                                var params =  {username:$(this).val()};
                                $.post(	url,
                                    params,
                                    function(result){

                                        var res = result.status;

                                        if(res != '20000'){

                                            _this.parent().next().find('.reg-tips').detach();
                                            _this.parent().next().append('<span class="reg-tips reg-err">' + '用户名已存在 ' + '</span>');
                                            usernameValidity = false;
                                        }else{
                                            usernameValidity = true;
                                            _this.parent().next().find('.reg-tips').detach();
                                            _this.parent().next().append('<span class="reg-tips reg-right"></span>');
                                        }
                                    }
                                );
                            }
                            return;

                        case 'email' :
                            var _this = $(this);
                            $(this).parent().next().find('.reg-tips').detach();
                            var emailreg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
                            if (!emailreg.test($(this).val()))
                            {
                                $(this).parent().next().find('.reg-tips').detach();
                                $(this).parent().next().append('<span class="reg-tips reg-err">' + $(this).attr('errortips') + '</span>');
                                emailValidity = false;
                                return;
                            }
                            else
                            {
                                var url = 'validEmail';
                                var params =  {email:$(this).val()};
                                $.post(	url,
                                    params,
                                    function(result){
                                        var res = result.status;
                                        if(res != '20000'){
                                            _this.parent().next().find('.reg-tips').detach();
                                            _this.parent().next().append('<span class="reg-tips reg-err">' + '该email已被注册' + '</span>');
                                            emailValidity = false;
                                        }else{
                                            emailValidity = true;
                                            _this.parent().next().find('.reg-tips').detach();
                                            _this.parent().next().append('<span class="reg-tips reg-right"></span>');
                                        }
                                    }
                                );
                            }
                            return;

                        case 'password' :
                            $(this).parent().next().find('.reg-tips').detach();
                            if ($(this).val().length >= 0 && $(this).val().length < 6)
                            {
                                $(this).parent().next().find('.reg-tips').detach();
                                $(this).parent().next().append('<span class="reg-tips reg-err">' + $(this).attr('errortips') + '</span>');
                                passwordValidity = false;
                                return;
                            }
                            if ($(this).val().length > 17)
                            {
                                $(this).parent().next().find('.reg-tips').detach();
                                $(this).parent().next().append('<span class="reg-tips reg-err">' + $(this).attr('errortips') + '</span>');
                                passwordValidity = false;
                                return;
                            }
                            else
                            {
                                passwordValidity = true;
                                $(this).parent().next().find('.reg-tips').detach();
                                $(this).parent().next().append('<span class="reg-tips reg-right"></span>');
                            }
                            return;
                        case 'passwordConfirm' :
                            $(this).parent().next().find('.reg-tips').detach();
                            if($(this).val() != $("input[name='password']").val()){
                                $(this).parent().next().append('<span class="reg-tips reg-err">' + $(this).attr('errortips') + '</span>');
                                passwordConfirmValidity = false;
                                return;
                            }else{
                                passwordConfirmValidity = true;
                                return;
                            }
                        case 'userType' :
                            $(this).parent().next().find('.reg-tips').detach();
                            if($(this).val() == "-1"){
                                $(this).parent().next().append('<span class="reg-tips reg-err">' + $(this).attr('errortips') + '</span>');
                                roleValidity = false;
                                return;
                            }else{
                                roleValidity = true;
                                return;
                            }
                    }
                }

            }
        });

    }

});

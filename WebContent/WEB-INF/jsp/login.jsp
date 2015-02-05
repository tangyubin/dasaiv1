<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
	<meta name="keywords" content="">
	<meta name="description" content="">
	<title>注册 - 三大赛</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/common.css">
	<link rel="stylesheet" type="text/css" href="css/link.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<link rel="stylesheet" type="text/css" href="css/user.css">
	<script src="js/jquery.2.js" type="text/javascript"></script>
	<script src="js/jquery.form.js" type="text/javascript"></script>
	<script src="js/plug-in_module.js" type="text/javascript"></script>
	<script src="js/aws.js" type="text/javascript"></script>
	<script src="js/aw_template.js" type="text/javascript"></script>
	<script src="js/app.js" type="text/javascript"></script>
	<script src="js/compatibility.js" type="text/javascript"></script>
    <script src="js/login.js" type="text/javascript"></script>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<style type="text/css">
		.fancybox-margin
		{
			margin-right:17px;
		}
	</style>
	<script type="text/javascript">
		$(document).ready(
				function(){
					$('#login_submit').click(
						function(){
							var url = 'loginCheck.action';
							var params = $('#login_form').serialize();
							$.post(
								url, 
								params,
								function(request){
									var res = eval("(" + request + ")").valid;
									if(res == "true"){
										$('#login_form').submit();
									}else{
										$("#show").empty();
										$('#show').append('<h3 style="color:#F00">用户名或密码错误！<h3>');
									}
								}		
							);
						}		
					);		
				}	
			);
	</script>
</head>
<body>
	<div class="top-bar opacity">
		<div class="col-md-12 logo">
			<span class="name"><i class="icon-leaf"></i><a href="index.html" class="name">三大赛</a>-创新奖</span>
			<a href="" class="pull-right user"><i class="icon-user"></i> 用户</a>
		</div>
	</div>
	<div id="wrapper">
		<div class="aw-login-box">
			<div class="mod-body clearfix">
				<div class="content pull-left">
                    <h1 class="logo"><a href=""></a></h1>
                    <h2>三大赛登录</h2>
                    <div id="show"></div>
                    <form id="login_form" action="login" method="post">
                        <ul>
                            <li>
                                <input type="text" name="usernameOrEmail" class="form-control" placeholder="邮箱 / 用户名" name="user_name" />
                            </li>
                            <li>
                                <input type="password" name="password" class="form-control" placeholder="密码" name="password" />
                            </li>
                            <li class="alert alert-danger hide error_message">
                                <i class="icon icon-delete"></i> <em></em>
                            </li>
                            <li class="last">
                                <button type="submit" class="pull-right btn btn-large btn-primary">登录</button>
                                <!-- <input type="button" id="login_submit" value="提交" class="pull-right btn btn-large btn-primary"/> -->
                                <label>
                                    <input type="checkbox" value="1" name="net_auto_login" />
                                    记住我					</label>
                                <a href="#">&nbsp;&nbsp;忘记密码</a>
                            </li>
                        </ul>
                    </form>
			</div>
			<div class="side-bar pull-left">
				<h3>三大赛介绍</h3>												
			</div>
			</div>
				<div class="mod-footer">
					<span>还没有账号?</span>&nbsp;&nbsp;
					<a href="regist">立即注册</a>&nbsp;&nbsp;&nbsp;&nbsp;
				</div>
			</div>
		</div>
		<div class="aw-footer-wrap">
			<div class="aw-footer">
				Copyright © 2014<span class="hidden-xs"> - 北京邮电大学信息科技中心, All Rights Reserved</span>
			</div>
		</div>
</body>
</html>
    
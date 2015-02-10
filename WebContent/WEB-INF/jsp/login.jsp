<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/regist.css">
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/regist.js"></script>
    <title>登录</title>
</head>
<body>
<nav class="navbar navbar-my" role="navigation" >
    <div class="col-md-12 logo">
        <span class="glyphicon glyphicon-leaf"></span><a href="" class="name">三大赛</a>-创新奖
        <div class="pull-right">
            <span class="glyphicon glyphicon-user"></span><a href="" class="name">用户</a>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-8 col-md-offset-2 registBox">
            <div class="row box-head">
                <div class="col-md-12">欢迎登录</div>
            </div>

            <div class="row">
                <form action="login" method="post" class="form-horizontal" role="form" id="login_form">
                    <div class="form-group">
                        <div class="col-md-6 col-md-offset-3">
                            <input type="text" name="usernameOrEmail" class="form-control opacity" id="username" tips="请输入一个 2-14 位的用户名" errortips="用户名长度不符合" placeholder="用户名">
                        </div>
                        <div id="username-tips" class="col-md-3"></div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-6 col-md-offset-3">
                            <input type="password" name="password" class="form-control opacity" id="password" tips="请输入 6-16 个字符,区分大小写" errortips="密码不符合规则" placeholder="密码">
                        </div>
                        <div id="password-tips" class="col-md-3"></div>
                    </div>
                    <div class="col-md-6 col-md-offset-3">
                        <input type="submit" class="btn btn-info btn-block" id="login-submit"/>
                    </div>
                </form>
            </div>

            <div class="box-footer row">
                <div class="col-md-12">
                    没有用户名？<a href="regist">点此注册</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
    
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
    <title>注册</title>
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
                    <div class="col-md-12">欢迎注册</div>
                </div>

                <div class="row">
                    <form action="regist" method="post" class="form-horizontal" role="form" id="register_form">
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3">
                                <input type="text" name="username" class="form-control opacity" id="username" tips="请输入一个 2-14 位的用户名" errortips="用户名长度不符合" placeholder="用户名">
                            </div>
                            <div id="username-tips" class="col-md-3"></div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3">
                                <input type="password" name="password" class="form-control opacity" id="password" tips="请输入 6-16 个字符,区分大小写" errortips="密码不符合规则" placeholder="密码">
                            </div>
                            <div id="password-tips" class="col-md-3"></div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3">
                                <input type="password" name="passwordConfirm" class="form-control opacity" id="passwordConfirm" tips="请重复输入上面的密码" errortips="两次密码不一致" placeholder="重复密码">
                            </div>
                            <div id="passwordConfirm-tips" class="col-md-3"></div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3">
                                <input type="text" name="email" class="form-control opacity" id="email" tips="请输入你常用的电子邮箱作为你的账号" value="" errortips="邮箱格式不正确" placeholder="邮箱">
                            </div>
                            <div id="email-tips" class="col-md-3"></div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3">
                                <select name="userType" id="userType" class="form-control opacity" tips="请选择一个用户身份" errortips="还未选择用户身份">
                                    <option value="0">选择用户类型</option>
                                    <option value="1">学生</option>
                                    <option value="2">团队</option>
                                </select>
                            </div>
                            <div id="userType-tips" class="col-md-3"></div>
                        </div>
                        <div class="col-md-6 col-md-offset-3">
                            <input type="submit" class="btn btn-info btn-block" id="regist-submit"/>
                        </div>
                    </form>
                </div>

                <div class="box-footer row">
                    <div class="col-md-12">
                        已有用户名？<a href="login">直接登录</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">

    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/index.js"></script>
    <title>首页</title>
</head>
<body id="bd">
    <nav class="navbar navbar-my" role="navigation" >
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#global-navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                </button>
            </div>
            <div class="collapse navbar-collapse" id="global-navbar">
                <ul class="nav navbar-nav">
                    <li><a href="index.html">首页</a> </li>
                    <li><a href="regist">注册</a> </li>
                    <li><a href="login">登录</a> </li>
                    <li><a href="#">关于</a> </li>
                </ul>
            </div>
        </div>
    </nav>

    <main class="container" role="main" style="margin-top: 10%">
        <div class="row">
            <div class="col-md-4 col-sm-4">
                <a href="login" id="dasai1"><img alt="" src="image/bg.jpg" class="img-responsive grow-rotate"/></a>
            </div>
            <div class="col-md-4 col-sm-4">
                <a href="login" id="dasai2"><img alt="" src="image/bg.jpg" class="img-responsive grow-rotate"/></a>
            </div>
            <div class="col-md-4 col-sm-4">
                <a href="login" id="dasai3"><img alt="" src="image/bg.jpg" class="img-responsive grow-rotate"/></a>
            </div>
        </div>
    </main>
    <footer class="container" style="margin-top: 5%">
        <div class="row">
            <div class="col-md-8 col-md-push-2">
                <section>All content copyright <a href="login" target="_blank">北京邮电大学信息科技中心</a> © 2014 • All rights reserved.</section>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 col-md-push-4" id="copyrights">
                <section>Proudly published with <a href="login" target="_blank">北京邮电大学研究生会</a></section>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 col-md-push-4" id="copyrights">
                <section><a href="http://www.miibeian.gov.cn/" target="_blank">京ICP备11008151号</a> | 京公网安备11010802014853</section>
            </div>
        </div>
    </footer>
</body>
</html>
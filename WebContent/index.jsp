<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="HandheldFriendly" content="True">
    <meta name="MobileOptimized" content="320">
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/main.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/user.css">
	<link rel="stylesheet" type="text/css" href="css/hover.css">
	<script type="text/javascript" src="js/user.js"></script>

<script type="text/javascript"> 
    $(function(){ 
		$(".bhover").hover
			(
				function(){ 
					$("#bd").css({"background-image":"url()"});
				}, 
				function(){ 
					$("#bd").css({"background-image":" url(image/bg.jpg)"});
				}
			) 
    })
    </script>
</head>

<body id="bd" class="home-template custom-bg" style="background-image: url(image/bg.jpg)">

    <nav class="navbar navbar-ghost" role="navigation">
    	<div class="container-fluid">
    	    <div class="collapse navbar-collapse" id="global-navbar">
    	    	<ul class="nav navbar-nav">
    	    		<li><a href="index.jsp">首页</a></li>
    	    		<li><a href="regist" target="_blank">注册</a></li>
    	    		<li><a href="login" target="_blank">登录</a></li>
    		        <li><a href="#">关于</a></li>
    			</ul>
    	    </div>
    	</div>
    </nav>

	<main class="container" role="main">
		<div class="row">
        	<div class="col-md-8 col-md-push-2 col-xs-8 col-xs-push-2 ">
                <h1 class="blog-title">
                   北邮三大赛报名网
                </h1>
                <h2 class="blog-desc ">
                    Ghost is a simple, powerful publishing platform that allows you to share your story with the world.
                </h2>    
            </div>
        </div>

		<div class="row">
            <div class="col-md-4 col-xs-4">
                <a href="login" class="bhover"><img alt="admin" src="image/bg.jpg" class="buzz-out"/></a>
            </div>
            <div class="col-md-4 col-xs-4">
                <a href="login" class="bhover"><img alt="user" src="image/bg.jpg" class="wobble-vertical" /></a>
            </div>
            <div class="col-md-4 col-xs-4">
                <a href="login" class="bhover"><img alt="teacher" src="image/bg.jpg" class="grow-rotate" /></a>
            </div>
		</div>
	</main>

    <footer class="container">
        <div class="row">
            <div class="col-xs-12" id="copyrights">
                 <section class="copyright">All content copyright <a href="#" target="_blank">北京邮电大学信息科技中心</a> © 2014 • All rights reserved.</section>
                 <section class="poweredby">Proudly published with <a href="#" target="_blank">北京邮电大学研究生会</a></section>
                 <section class="beian"><a href="http://www.miibeian.gov.cn/" target="_blank">京ICP备11008151号</a> | 京公网安备11010802014853</section>
            </div>
        </div>
    </footer>
    
</body>
</html>
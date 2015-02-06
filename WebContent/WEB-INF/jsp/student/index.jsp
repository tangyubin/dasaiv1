<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>用户</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/user.css">
	<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/user.js"></script>
</head>
<body>
	<div class="top-bar opacity">
		<div class="col-md-12 logo">
				<span class="name"><i class="icon-leaf"></i><a href="index.html" class="name">三大赛</a>-创新奖</span>
				<a href="" class="pull-right user"><i class="icon-user"></i> 用户</a>
			</div>


	</div>
	<div class="container">
		<div class="row">
			
		</div>
		<div class="row">

			<div class="col-md-3">
			
				<ul class="nav">
					<li role="presentation"  class="opacity"><a href="#" id="testInfoBtn">大赛信息</a></li>
				  <li role="presentation"  class="opacity"><a href="#"  id="personInfoBtn">个人信息</a></li>
				  <li role="presentation"  class="opacity"><a href="#" id="workInfoBtn">作品信息</a></li>
				  <li role="presentation"  class="opacity"><a href="#" id="workSubBtn">作品提交</a></li>
				</ul>

			</div>
			<div class="col-md-9 contentArea" id="testInfo">
				<p>大赛信息.........</p>
			</div>
			<div class="col-md-9" id="personInfo">
				<form class="form-horizontal" role="form">
				  <div class="form-group">
				    <label for="inputEmail3" class="col-md-2 control-label">姓名</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control opacity" id="username" placeholder="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-md-2 control-label">学号</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control opacity" id="xuehao" placeholder="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-md-2 control-label">所在学院</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control opacity" id="xueyuan" placeholder="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-md-2 control-label">年龄</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control opacity" id="age" placeholder="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-md-2 control-label">注册邮箱</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control opacity" id="email" placeholder="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-md-2 control-label">联系电话</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control opacity" id="tel" placeholder="">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-md-2 control-label">银行账户</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control opacity" id="bank" placeholder="">
				    </div>
				  </div>
				 </form>
			</div>
			<div class="col-md-9" id="workInfo">
				<table class="table table-bordered opacity">
					<tr>
						<th>作品名称</th>
						<th>作品描述</th>
						<th>得分</th>


					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</table>
			</div>
			<div class="col-md-9" id="workSub">
				<form action="student/submitWork.action" method="post" enctype="multipart/form-data">
				<div class="form-group">
				    <label for="inputEmail3" class="col-md-2 control-label">作品名称</label>
				    <div class="col-md-10">
				      <input type="text" name="title" class="form-control opacity" id="inputEmail3" placeholder=""/>
				    </div>
				  </div>
				  <br>
				  <div class="form-group" style="margin-top:10px;">
				    <label for="inputEmail3" class="col-md-2 control-label">作品类型</label>
				    <div class="col-md-10">
				      	<select name="workType">
				      		<option>==选择作品类型==</option>
				      		<option>A</option>
				      		<option>B</option>
				      		<option>C</option>
				      		<option>D</option>
				      	</select>
				    </div>
				  </div>
				  <br>
				  <div class="form-group"  style="margin-top:60px;">
				    <label for="inputEmail3" class="col-md-2 control-label">文件</label>
				    <div class="col-md-10">
				      <input type="file" name="upload" class="form-control opacity"/>
				    </div>
				  </div>
				  <div class="col-md-6 col-md-offset-2" style="margin-top:10px;">
				  	<input type="submit" class="btn btn-info" value="提交" id="submit"/>
					
				  </div>
				  </form>
			</div>

		</div>

	</div>
</body>
</html>
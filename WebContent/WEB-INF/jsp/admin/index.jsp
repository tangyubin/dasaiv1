<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>管理员</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/user.css">
	<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/admin.js"></script>
</head>
<body>
	<div class="top-bar opacity">
		<div class="col-md-12 logo">
				<a href="" class="name"><i class="icon-leaf"></i> 三大赛-创新奖</a>
				<a href="" class="pull-right user"><i class="icon-user"></i> 管理员</a>
			</div>


	</div>
	<div class="container">
		<div class="row">
			
		</div>
		<div class="row">

			<div class="col-md-3">
		
				<ul class="nav">
					<li role="presentation"  class="opacity"><a href="#" id="studentInfoBtn">学生管理</a></li>
				  <li role="presentation"  class="opacity"><a href="#"  id="teacherInfoBtn">评委老师</a></li>
				  <li role="presentation"  class="opacity"><a href="#" id="postInfoBtn">信息发布</a></li>
				  <li role="presentation"  class="opacity"><a href="#" id="timeSetBtn">时间设定</a></li>
				</ul>

			</div>
			<div class="col-md-9" id="studentInfo">
				<table class="table table-bordered opacity">
					<tr>
						<th>学生姓名</th>
						<th>学号</th>
						<th>作品名称</th>
						<th>作品成绩</th>


					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>



				</table>
			</div>
			<div class="col-md-9" id="teacherInfo">
				<table class="table table-bordered opacity">
					<tr>
						<th>用户名</th>
						<th>密码</th>
						<th>激活</th>
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

			<div class="col-md-9" id="postInfo">
		<div class="col-md-12">
			<form role="form">


   				 <textarea class="form-control opacity" rows="5"></textarea>
 
			</form>
			</div>
				 <div class="col-md-6 col-md-offset-10" style="margin-top:10px;">
				  	<input type="button" class="btn btn-info" value="发布信息" id="postBtn" >
				  </div>
			</div>
			 


			<div class="col-md-9" id="timeSet">
				<div class="form-group">
				    <label for="inputEmail3" class="col-md-3">开始注册时间</label>
				    <div class="col-md-9" >
				      <input type="date" class="form-control opacity" id="inputEmail3" placeholder="">
				    </div>
				  </div>
			
				  <div class="form-group">
				    <label  for="inputEmail3" class="col-md-3">停止注册时间</label>
				    <div class="col-md-9" style="margin-top:10px;">
				      <input type="date" class="form-control opacity" id="inputEmail3" placeholder="">
				    </div>
				  </div>
				
				  <div class="form-group">
				    <label for="inputEmail3" class="col-md-3">开始提交时间时间</label>
				    <div class="col-md-9"style="margin-top:10px;">
				      <input type="date" class="form-control opacity" id="inputEmail3" placeholder="">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label  for="inputEmail3" class="col-md-3">停止提交作品时间</label>
				    <div class="col-md-9"style="margin-top:10px;">
				      <input type="date" class="form-control opacity" id="inputEmail3" placeholder="">
				    </div>
				  </div>
				
				  <div class="col-md-3 col-md-offset-3" style="margin-top:10px;">
				  	<input type="button" class="btn btn-info" value="确认" id="submit">

				  </div>
				  <div class="col-md-3 col-md-offset-3" style="margin-top:10px;">
				  	<input type="button" class="btn btn-info" value="重置" id="submit">

				  </div>
			</div>

		</div>

	</div>
</body>
</html>
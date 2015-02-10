<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>学生管理</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/student.css">
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/student.js"></script>
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
	        <div class="col-md-3">
	            <ul class="nav">
	                <li role="presentation"  class="opacity"><a href="#" id="testInfoBtn">大赛信息</a></li>
	                <li role="presentation"  class="opacity"><a href="#"  id="personInfoBtn">个人信息</a></li>
	                <li role="presentation"  class="opacity"><a href="#" id="workInfoBtn">作品信息</a></li>
	                <li role="presentation"  class="opacity"><a href="#" id="workSubBtn">作品提交</a></li>
	                <li role="presentation"  class="opacity"><a href="#" id="experienceTextBtn">比赛心得</a></li>
	            </ul>
	        </div>
	
	        <div class="col-md-9 contentArea" id="testInfo">
	            <p>大赛信息.........</p>
	        </div>
	
	        <div class="col-md-9" id="personInfo">
	            <div class="col-md-10 col-md-offset-2 tips">提交信息成功，如要更新，只需再次提交！</div>
	            <form class="form-horizontal" role="form">
	                <div class="form-group">
	                    <label for="name" class="col-md-2 control-label">姓名</label>
	                    <div class="col-sm-10">
	                        <input name="name" type="text" class="form-control opacity" id="name" placeholder="">
	                    </div>
	                </div>
	                <div class="form-group">
	                    <label for="studentId" class="col-md-2 control-label">学号</label>
	                    <div class="col-sm-10">
	                        <input name="studentId" type="text" class="form-control opacity" id="studentId" placeholder="">
	                    </div>
	                </div>
	                <div class="form-group">
	                    <label for="college" class="col-md-2 control-label">所在学院</label>
	                    <div class="col-sm-10">
	                        <input name="college" type="text" class="form-control opacity" id="college" placeholder="">
	                    </div>
	                </div>
	                <div class="form-group">
	                    <label for="grade" class="col-md-2 control-label">班级</label>
	                    <div class="col-sm-10">
	                        <input name="grade" type="text" class="form-control opacity" id="grade" placeholder="">
	                    </div>
	                </div>
	                <div class="form-group">
	                    <label for="tel" class="col-md-2 control-label">联系电话</label>
	                    <div class="col-sm-10">
	                        <input name="tel" type="text" class="form-control opacity" id="tel" placeholder="">
	                    </div>
	                </div>
	                <div class="form-group">
	                    <label for="bankCardId" class="col-md-2 control-label">银行账户</label>
	                    <div class="col-md-10">
	                        <input name="bankCardId" type="text" class="form-control opacity" id="bankCardId" placeholder="">
	                    </div>
	                </div>
	                <div class="form-group">
	                    <label for="otherInfo" class="col-md-2 control-label">其他信息</label>
	                    <div class="col-md-10">
	                        <input name="otherInfo" type="text" class="form-control opacity" id="otherInfo" placeholder="">
	                    </div>
	                </div>
	                <div class="col-md-10 col-md-offset-2">
	                    <input type="submit" class="btn btn-block btn-info"/>
	                </div>
	            </form>
	        </div>
	        <div class="col-md-8" id="workInfo">
	            <div class="row">
	                <table class="table table-bordered opacity">
	                    <!--<tr>-->
	                        <!--<th>作品名称</th>-->
	                        <!--<th>作品描述</th>-->
	                        <!--<th>得分</th>-->
	                    <!--</tr>-->
	                    <tr>
	                        <td class="col-md-4">作品名称</td>
	                        <td class="col-md-8"></td>
	                    </tr>
	                    <tr>
	                        <td class="col-md-4">类别</td>
	                        <td class="col-md-8"></td>
	                    </tr>
	                    <tr>
	                        <td class="col-md-4">评论1</td>
	                        <td class="col-md-8"></td>
	                    </tr>
	                    <tr>
	                        <td class="col-md-4">得分1</td>
	                        <td class="col-md-8"></td>
	                    </tr>
	                    <tr>
	                        <td class="col-md-4">评论2</td>
	                        <td class="col-md-8"></td>
	                    </tr>
	                    <tr>
	                        <td class="col-md-4">得分2</td>
	                        <td class="col-md-8"></td>
	                    </tr>
	                    <tr>
	                        <td class="col-md-4">平均得分</td>
	                        <td class="col-md-8"></td>
	                    </tr>
	                </table>
	            </div>
	        </div>
	        <div class="col-md-9" id="workSub">
	            <div class="row">
	                <form action="submitWork" method="post" class="form-horizontal" role="form" id="submitWork_form">
	                    <div class="form-group">
	                        <div class="col-md-6 col-md-offset-3">
	                            <input type="text" name="title" class="form-control opacity" id="title" placeholder="作品名称">
	                        </div>
	                    </div>
	
	                    <div class="form-group">
	                        <div class="col-md-6 col-md-offset-3">
	                            <select name="workType" id="workType" class="form-control opacity">
	                                <option value="-1">选择作品类别</option>
	                                <option value="1">科技发明制作类作品（A类）</option>
	                                <option value="2">自然科学类论文（B类）</option>
	                                <option value="3">人文社会科学类论文（C类）</option>
	                                <option value="4">艺术设计类作品（D类）</option>
	                            </select>
	                        </div>
	                        <div id="userType-tips" class="col-md-3"></div>
	                    </div>
	                    <div class="form-group">
	                        <div class="col-md-6 col-md-offset-3">
	                            <input type="file" class="form-control opacity">
	                        </div>
	                    </div>
	                    <div class="col-md-6 col-md-offset-3">
	                        <input type="submit" class="btn btn-info btn-block" id="work-submit"/>
	                    </div>
	                </form>
	            </div>
	        </div>
	        <div id="experienceText" hidden="hidden" class="col-md-9">
	            <form class="form-horizontal" role="form">
	                <div class="form-group" style="margin-top:10px;">
	                    <div class="col-md-10">
	                        <textarea class="form-control opacity" rows="6" placeholder="请在此处写下你的比赛心得..."></textarea>
	                    </div>
	                </div>
	                <div class="col-md-6" style="margin-top:10px;">
	                    <input type="submit" class="btn btn-info" value="提交">
	                </div>
	            </form>
	        </div>
	    </div>
	</div>
</body>
</html>
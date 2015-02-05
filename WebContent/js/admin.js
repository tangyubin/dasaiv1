window.test="<select id='example-single'><option value='1'>Option 1</option><option value='2'>Option 2</option><option value='3'>Option 3</option><option value='4'>Option 4</option><option value='5'>Option 5</option><option value='6'>Option 61</option></select>";

$(document).ready(function(){
	    
      
	
	$("#studentInfoBtn").click(function(){
		$("#studentInfo").show();
		$("#teacherInfo").hide();
		$("#postInfo").hide();
		$("#timeSet").hide();
		$("#distributework").hide();
		$("#studentCheck").hide();
		$("#studentInfoBtn").addClass("activeclass");
		$("#teacherInfoBtn").removeClass("activeclass");
		$("#postInfoBtn").removeClass("activeclass");
		$("#timeSetBtn").removeClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");
		$("#studentCheckBtn").removeClass("activeclass");
		
		var thing = {"data":[{"username":"kangda","userId":"123","workId":45,"grade":67,"userstate":0},{"username":"kangda","userId":"123","workId":45,"grade":67,"userstate":0}]};    
         $("#studentInfoTable tr:gt(0)").empty(); 
		
		 $.each(thing.data,function(i,item){   
   //输出  
          var trHTML = "<tr><td>"+item.username+"</td><td>"+item.userId+"</td><td>"+item.workId+"</td><td>"+item.grade+"</td></tr>"
         
		  $("#studentInfoTable tr:last").after(trHTML);
      });
		/*$.ajax( {    
              url:'',// 跳转到 action    
              data:{    
                     selRollBack : selRollBack,    
                     selOperatorsCode : selOperatorsCode,    
                     PROVINCECODE : PROVINCECODE,    
                     pass2 : pass2    
                 },    
             type:'post',    
             cache:false,    
             dataType:'json',    
             success:function(data) {    
            if(data.code =="true" ){    
                
               
                }else{    
                  view(data.code);    
               }    
              },    
              error : function() {    
              
              alert("异常！");    
     }   
});  */

	});
	$("#teacherInfoBtn").click(function(){
		$("#studentInfo").hide();
		$("#teacherInfo").show();
		$("#postInfo").hide();
		$("#timeSet").hide();
		$("#distributework").hide();
		$("#studentCheck").hide();
		$("#studentInfoBtn").removeClass("activeclass");
		$("#teacherInfoBtn").addClass("activeclass");
		$("#postInfoBtn").removeClass("activeclass");
		$("#timeSetBtn").removeClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");
		$("#studentCheckBtn").removeClass("activeclass");
		
		
		var thing = {"data":[{"username":"kangda","userId":"123","workId":45,"grade":67,"userstate":0},{"username":"kangda","userId":"123","workId":45,"grade":67,"userstate":0}]};    
         $("#teacherInfoTable tr:gt(0)").empty(); 
		
		 $.each(thing.data,function(i,item){   
   //输出  
           var trHTML = "<tr><td>"+item.username+"</td><td>"+item.userId+"</td><td>未激活 <input type='button' class='activebtn' value='激活' /></td></tr>"
         
		  $("#teacherInfoTable tr:last").after(trHTML);
      });
	  
	});
	$("#postInfoBtn").click(function(){
		$("#studentInfo").hide();
		$("#teacherInfo").hide();
		$("#postInfo").show();
		$("#timeSet").hide();
		$("#distributework").hide();
		$("#studentCheck").hide();
		$("#studentInfoBtn").removeClass("activeclass");
		$("#teacherInfoBtn").removeClass("activeclass");
		$("#postInfoBtn").addClass("activeclass");
		$("#timeSetBtn").removeClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");
		$("#studentCheckBtn").removeClass("activeclass");
	});
	$("#timeSetBtn").click(function(){
		$("#studentInfo").hide();
		$("#teacherInfo").hide();
		$("#postInfo").hide();
		$("#timeSet").show();
		$("#studentCheck").hide();
		$("#distributework").hide();
		$("#studentInfoBtn").removeClass("activeclass");
		$("#teacherInfoBtn").removeClass("activeclass");
		$("#postInfoBtn").removeClass("activeclass");
		$("#timeSetBtn").addClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");
		$("#studentCheckBtn").removeClass("activeclass");
	});
	$("#distributeworkBtn").click(function(){
		$("#studentInfo").hide();
		$("#teacherInfo").hide();
		$("#postInfo").hide();
		$("#timeSet").hide();
		$("#distributework").show();
		$("#studentCheck").hide();
		$("#studentInfoBtn").removeClass("activeclass");
		$("#teacherInfoBtn").removeClass("activeclass");
		$("#postInfoBtn").removeClass("activeclass");
		$("#timeSetBtn").removeClass("activeclass");
		$("#distributeworkBtn").addClass("activeclass");
		$("#studentCheckBtn").removeClass("activeclass");
		
		
		var thing = {"data":[{"username":"kangda","userId":"123","workId":45,"grade":67,"userstate":0},{"username":"kangda","userId":"123","workId":45,"grade":67,"userstate":0}]};    
         $("#distributeworkTable tr:gt(0)").empty(); 
		
		 $.each(thing.data,function(i,item){   
   //输出  
          var trHTML = "<tr><td>"+item.username+"</td><td>"+item.userId+"</td><td>"+item.workId+"</td><td>"+window.test+"</td></tr>"
          $("#distributeworkTable tr:last").after(trHTML);
		  
		  $("#example-single ").multiselect({
      enableFiltering: true
    }).multiselect('refresh');
		 
      });
		
	});
	$("#studentCheckBtn").click(function(){
		$("#studentInfo").hide();
		$("#teacherInfo").hide();
		$("#postInfo").hide();
		$("#timeSet").hide();
		$("#distributework").hide();
		$("#studentCheck").show();
		$("#studentInfoBtn").removeClass("activeclass");
		$("#teacherInfoBtn").removeClass("activeclass");
		$("#postInfoBtn").removeClass("activeclass");
		$("#timeSetBtn").removeClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");
		$("#studentCheckBtn").addClass("activeclass");
		
		var thing = {"data":[{"username":"kangda","userId":"123","userstate":0},{"username":"test","userId":"123","userstate":0}]};    
         $("#studentCheckTable tr:gt(0)").empty(); 
		
		 $.each(thing.data,function(i,item){   
   //输出  
          var trHTML = "<tr><td>"+item.username+"</td><td>"+item.userId+"</td><td>未激活 <input type='button' class='activebtn' value='激活' /></td></tr>"
         
		  $("#studentCheckTable tr:last").after(trHTML);
		  
		
      });
		
	
		
	});
	
	
	
	$("#studentCheckBtn").click();
	
	$('#example-single').multiselect({
            includeSelectAllOption: true,
            enableFiltering: true
        });
		
		


});
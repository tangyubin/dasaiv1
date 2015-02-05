$(document).ready(function(){
	
	
	$("#testInfoBtn").click(function(){
		$("#testInfo").show();
		$("#personInfo").hide();
		$("#workInfo").hide();
		$("#workSub").hide();
		
		$("#testInfoBtn").addClass("activeclass");
		$("#personInfoBtn").removeClass("activeclass");
		$("#workInfoBtn").removeClass("activeclass");
		$("#workSubBtn").removeClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");

	});
	$("#personInfoBtn").click(function(){
		$("#personInfo").show();
		$("#testInfo").hide();
		$("#workInfo").hide();
		$("#workSub").hide();
	
		$("#personInfoBtn" ).addClass("activeclass");
		$("#testInfoBtn").removeClass("activeclass");
		$("#workInfoBtn").removeClass("activeclass");
		$("#workSubBtn").removeClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");
	});
	$("#workInfoBtn").click(function(){
		$("#personInfo").hide();
		$("#testInfo").hide();
		$("#workInfo").show();
		$("#workSub").hide();
	
		$("#personInfoBtn").removeClass("activeclass");
		$("#testInfoBtn").removeClass("activeclass");
		$("#workInfoBtn").addClass("activeclass");
		$("#workSubBtn").removeClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");
	});
	$("#workSubBtn").click(function(){
		$("#personInfo").hide();
		$("#testInfo").hide();
		$("#workInfo").hide();
		$("#workSub").show();
		
		$("#personInfoBtn").removeClass("activeclass");
		$("#testInfoBtn").removeClass("activeclass");
		$("#workInfoBtn").removeClass("activeclass");
		$("#workSubBtn").addClass("activeclass");
		$("#distributeworkBtn").removeClass("activeclass");
	});
	
	
	
	$("#testInfoBtn").click();
});
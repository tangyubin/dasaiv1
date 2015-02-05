
$(document).ready(function(){

$(".table td").click(function(){
	$("#panel").hide();
	$("#workView").show();

});
$("#Taffirm").click(function(){
	$("#panel").show();
	$("#workView").hide();
})
$("#Tcancel").click(function(){
	$("#panel").show();
	$("#workView").hide();
})

$('.pagination a:first').click(function(){

	$('table').filter('.block').removeClass('block').addClass('none').prev().removeClass('none').addClass('block');
	$(this).parent().siblings().filter('.active').removeClass('active').prev().addClass('active');

})
$('.pagination a:last').click(function(){
	$('table').filter('.block').removeClass('block').addClass('none').next().removeClass('none').addClass('block');
	$(this).parent().siblings().filter('.active').removeClass('active').next().addClass('active');
})
$(".pagination a").slice(1,6).click(function(){
	$(this).parent().addClass('active').siblings().removeClass('active');
	var num=$(this).html();
$('table').filter('.block').removeClass('block').addClass('none');
	$('table').eq(num-1).removeClass('none').addClass('block');
})
})



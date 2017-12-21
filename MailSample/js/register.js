var _contextPath;
$(document).ready(function(){
	_contextPath = $("#contextPath").val();
	var aa = "dasdasd";
	
	$("#updateButton").click(function(){
		$.ajax({
			url :_contextPath +"/register.action",
			method : 'post',
			datatype : 'json',
			success : function(response) {
				var data = JSON.parse(response);
				if (data.resultString == 'success') {
					
				var str=data.body;
				var re = /<br *\/?>/gi;
				var someText = str.replace(re, '\n');
				
				}
				$("#mailBody1").append(someText);
				}
			});
		
	});
		

});

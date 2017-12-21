var _contextPath;
$(document).ready(function(){
	_contextPath = $("#contextPath").val();
	
	$("#loginButton").click(function(){
		var UserID = $("#UserId").val();
		var Password = $("#Password").val();
		var mailbody = $('textarea#mailBody').val().replace(/(?:\r\n|\r|\n)/g, '<br />');
		alert(mailbody);
		if(mailbody.length >= 500){
				alert(" please enter text of onl 500 characters");
				return false;
			}else{
		var parms ="userid="+UserID+"&password="+Password+"&mailbody="+mailbody;
		$.ajax({
			url : _contextPath+"/Login.action",
			method : 'post',
			datatype : 'json',
			data : parms,
			success: function (response){
				alert(response);
				window.location=_contextPath+"/jsp/Register.jsp";
				
				}
				
			});
		}
		});
});
$.ajax({
	type : "GET",
	url : "ad.json",
	dataType : "json",
	success : function(data){
		var str = "";
		$.each(data, function(index, obj){
			str += "<li>";
			str += "<a href='" + obj.link + "' target='blank'>";
			str += "<img alt='"+ obj.alt +"' ";
			str += "src='img/" + obj.img + "'>";
			str += "</a></li>";
			
			
		});
		$("#adAdd").append(str);
	},
	error : function(){
		alert('에러발생');
	}
});

function del(){
	result = confirm("삭제 하시겠습니까?");
	if(result == false){
		return;
	}
	
}

function signUpMove(){
	
	window.open('signUp.jsp','회원가입', 'width=500, height=700');
}

function msgEdit(index){
	$('#msgContent'+index).empty();
	$('#msg'+index).attr('type', 'text');
	$('#msgSubmit'+index).attr('type', 'submit');
}

function reEdit(index){
	$('#replyContent'+index).empty();
	$('#rmsg'+index).attr('type', 'text');
	$('#reSubmit'+index).attr('type', 'submit');
}


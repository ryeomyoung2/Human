$(document).ready(function(){
	$("#container").addClass("start");
	$("nav li").click(function(){
		$("#container").css("max-width", "100%")
		var id=$(this).attr("data-rol");    
		$("nav li").removeClass("on");    
		$(this).addClass("on");    
		$(".content").removeClass("prev this next");     
		//클릭 시 가지고 있던 클래스를 모두 지운다    
		$("#" + id).addClass("this").prevAll().addClass("prev");    
		//클릭한 메뉴와 매칭 되는 id에 this 클래스를 지정하고 그 앞의 모든 <section> 태그는 .prev클래스를 지정한다    
		$("#" + id).nextAll().addClass("next");    
		//클릭한 메뉴와 매칭 되는 id의 뒤에 오는 <section> 태그는 .next 클래스를 지정한다     
	});
	//로고 클릭 시
	$(".logo_box").click(function(){
		$("nav li").removeClass("on");
		$(".content").removeClass("prev this next");
		$("#container").css("max-width", "1200px");
	});
	//롤링배너 왼쪽
	$(".roll_left").click(function(){
		$(".book_roll li").eq(0).insertAfter(".book_roll li:last-child");
	});
	//롤링배너 오른쪽
	$(".roll_right").click(function(){
		$(".book_roll li").eq(-1).insertBefore(".book_roll li:first-child");
	});
	//ajax 사용하기
	// 크롬 우클릭. 대상 부분에 --allow-file-access-from-files 이것을 추가로 붙임.
	// 모든 크롬을 다시 시작.
	// 실습에서는 article에 보냈던 것을 notebook에 보내는 것임.
	// TEST : 아래 내용을 지우고, FETCH 스타일로 TEST 할 것.
	$(".book_roll li").click(function(){
		var _this =$(this);
		var liurl =_this.data("url"); //data-url이란 값을 가져와서 liurl이란 변수에 대입한다.
		$(".notebook").html();
		$.ajax({
			type : 'post', //HTTP 요청 방식
			url : liurl, //해당 url
			dataType : 'html', //data 타입
			success : function(data) { //HTTP 요청 성공 후 데이터 전송
				$(".notebook").html(data);
			}
		});
	});
});


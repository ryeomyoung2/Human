$(document).ready(function(){
	$("#container").addClass("start");
	$("nav li").click(function(){
		$("#container").css("max-width", "100%")
		// 선택된 메뉴의 data-rol의 값 회신(menu1)
		var id=$(this).attr("data-rol");    
		console.log(id)
		// li Tag 모두 on class 삭제 (비활성화)
		$("nav li").removeClass("on");    
		// li Tag 중 선택된 것만 on class 추가 (활성화)
		// TEST : addClass("on") 주석처리 후 메뉴버튼 클릭 후 붉은색 유지 안됨 확인.
		$(this).addClass("on");    
		//content 클래스의 prev this next class 삭제
		$(".content").removeClass("prev this next");     
		//클릭한 메뉴와 매칭 되는 id에 this 클래스를 지정하고 그 앞의 모든 <section> 태그는 .prev클래스를 지정한다    
		// TEST : 아래 2개의 addClass 삭제 후 TEST ==> 페이지 이동처리가 안됨.
		$("#" + id).addClass("this").prevAll().addClass("prev");    
		//클릭한 메뉴와 매칭 되는 id의 뒤에 오는 <section> 태그는 .next 클래스를 지정한다     
		$("#" + id).nextAll().addClass("next");    
	});
	//로고 클릭 시
	$(".logo_box").click(function(){
		$("nav li").removeClass("on");
		$(".content").removeClass("prev this next");
		$("#container").css("max-width", "1200px");
	});
});


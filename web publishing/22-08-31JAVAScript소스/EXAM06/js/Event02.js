window.addEventListener("load", function() {
    let section = document.querySelector("#section1");
    let imgList = section.querySelector(".img-list")
    let imgs = section.querySelectorAll(".imgs");
    let currentImg = section.querySelector(".current-img");

    imgList.onclick= function(e) {
        // 상위태그로 버블링의 효과로 인해 상위태그 이벤트를 통해서 처리 가능
        console.log(e);
        // if(e.target.className != 'imgs') {
        //     return;
        // } 
        if(e.target.tagName != 'IMG') {
            return;
        } 
        currentImg.src = e.target.src;
    };
});
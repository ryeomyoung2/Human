window.addEventListener("load", function() {
    let section = document.querySelector("#section1");
    let imgs = section.querySelectorAll(".imgs");
    let currentImg = section.querySelector(".current-img");

    // imgs[0].onclick= function(e){
    //     // console.log(e.target.src);
    //     currentImg.scr=e.target.src;
    // };
    
    // imgs[1].onclick= function(e){
    //     // console.log(e.target.src);
    //     currentImg.scr=e.target.src;
    // };
    // imgs[2].onclick= function(e){
    //     // console.log(e.target.src);s
    //     currentImg.scr=e.target.src;
    // };
    for (let i=0; i<imgs.length; i++) {
        imgs[i].onclick= function(e) {
            currentImg.src=e.target.src;
    }
}

});
window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
    let imgList = section.querySelector(".src-input")
    let changeButton = section.querySelector(".change-button");
    let img = section.querySelector(".img");

    changeButton.onclick = function() {
        img.src="./img/" + imgList.value + ".jpg";
    }; 
});
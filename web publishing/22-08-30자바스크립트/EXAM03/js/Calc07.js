window.addEventListener("load",function(){
    let btnPrint = document.getElementById("add");
    btnPrint.onclick = function(){
        let section = document.querySelector("#section1");
        let box = section.querySelector(".box");
        let input_x = box.children[0];
        let input_y = box.children[1];
        
        let x,y;
        x=parseInt(input_x.value);
        y=parseInt(input_y.value);
        sum.value = x+y;
    };
});
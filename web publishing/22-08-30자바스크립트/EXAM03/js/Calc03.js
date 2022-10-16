window.addEventListener("load",function(){
    let btnPrint = document.getElementById("add");
    btnPrint.onclick = function(){
        let section = document.getElementById("section1");
        let input = section.getElementsByClassName("txt");
        // console.log(input);
        // console.log(input[0]);
        
        let x,y;
        x=parseInt(input[0].value);
        y=parseInt(input[1].value);
        sum.value = x+y;
    };
});
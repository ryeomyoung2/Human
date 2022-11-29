window.addEventListener("load", function(){
    let notices = [
        {"id":5, "title":"가입인사2", "content":"안녕하세요1", "writer":"임여명"},
        {"id":6, "title":"가입인사3", "content":"안녕하세요2", "writer":"임여명2"}
    ];

    let section = document.querySelector("#section1");
    // let cloneButton = section.querySelector(".clone-button");
    // let inputButton = section.querySelector(".input-button");
    let tempButton = section.querySelector(".temp-button");
    let noticeList = section.querySelector(".notice-list");
    let tbodyNode = section.querySelector("tbody");

    tempButton.onclick = function() {
        let tempNode = section.querySelector("template");
        console.log(tempNode);
        let cloneNode = document.importNode(tempNode.content, true);
        // importNode는 tempNode를 활성화하는 역할을 함.
        // tempNode의 content만 활성화므로 첫인자에 tempNode.content가 필요함.
        // true이므로 하위모두 복제
        console.log("clone : " + cloneNode);

        
        let tdsNode = cloneNode.querySelectorAll("td");
        console.log(tdsNode) ;

        tdsNode[0].textContent = notices[0].id;
        tdsNode[1].textContent = notices[0].title;
        tdsNode[2].textContent = notices[0].content;
        tdsNode[3].textContent = notices[0].writer;

        tbodyNode.appendChild(cloneNode);

    };
});

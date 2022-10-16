window.addEventListener("load", function() {
    let section = document.querySelector("#section1");
    let noticeList = section.querySelector(".notice-list");
    let upButton = section.querySelector(".up-button");
    let downButton = section.querySelector(".down-button");

    let tbodyNode = section.querySelector("tbody");
    let currentNode = tbodyNode.firstElementChild; 
    // tr 첫번째가 선택이 됨.

    upButton.onclick = function() {
        let prevNode = currentNode.previousElementSibling; 
        if (prevNode == null) {
            alert("더 이상 이동 불가");
            return;
        }
        tbodyNode.insertBefore(currentNode, prevNode);
    };
    downButton.onclick = function() {
        let nextNode = currentNode.nextElementSibling; 
        // 현재기준의 동생 element를 찾음.
        if (nextNode == null) {
            // 가장 마지막 위치..
            alert("더 이상 이동 불가");
            return;
        }
        tbodyNode.insertBefore(nextNode, currentNode);
        // insertBefore(이동대상, 기준점)
        // 이는 이동대상을 기준점 앞으로 복사하고, 본인 자신은 지움.
        // 이동대상을 기준점 앞으로 이동.. 
    };
});
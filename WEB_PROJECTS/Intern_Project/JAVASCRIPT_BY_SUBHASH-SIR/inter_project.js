let fbtn =document.getElementById("btn3")
fbtn.addEventListener("click",function(){
    // if(fbtn.type=="submit"){
    fbtn.style.backgroundColor= "black"
    fbtn.innerText="Following"

    // }
    //  else{
    //     fbtn.type="submit"
    //     fbtn.style.backgroundColor= "red"
    // }
})
let form1=document.querySelector(".sec8");


let dots=document.getElementById("three_dots");
let extra=document.getElementById("extra")
dots.addEventListener("click",function (){
extra.style.display="block";
})

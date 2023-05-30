let fbtn =document.querySelectorAll("#btn3")
    fbtn.forEach(function(fbtns){
fbtns.addEventListener("click",function(){
            if(fbtns.innerText=="Follow"){
    fbtns.style.backgroundColor= "black"
    fbtns.innerText="Following"
            }      
     else{
        fbtns.innerText="Follow"
        fbtns.style.backgroundColor= "grey"
    }
})
})
let form1=document.querySelector(".sec8");


let dots=document.getElementById("three_dots");
let extra=document.getElementById("extra")
dots.addEventListener("click",function (){
extra.style.display="block";
})
let thum=document.querySelector(".thumb");
thum.addEventListener("click",function(){
    thum.classList.toggle("added")
})
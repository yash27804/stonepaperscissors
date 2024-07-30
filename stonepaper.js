let choices=["stone","paper","scissors"];
let btn1=document.querySelectorAll(".btn");
var selected;
var i;
var btn;
console.log(btn1);
function compselection()
{
    
    i=Math.ceil(Math.random()*2);
    selected=choices[i];
  
}
let count=0;
    let count1=0;
function checkwin()
{
    
    console.log(btn);
    console.log(selected);
    if(btn==selected)
    {
        document.getElementById("result").innerHTML="<b>Draw!!</b>";
    }
    else if((btn=="rock" && selected=="scissors") || (btn=="paper" && selected=="rock") || (btn=="scissors" && selected=="paper"))
    {
        
        count++;
        document.getElementById("result").innerHTML="<b>User Wins</b>";
        document.getElementById("usercount").innerText=count;
    }
    else
    {  
        count1++;
        document.getElementById("result").innerHTML="<b>Computer Wins</b>";
        document.getElementById("computercount").innerText=count1;
    }
    
}
btn1.forEach((butn)=>
{
    butn.addEventListener("click",
        ()=>
        {
            compselection();
            btn=butn.getAttribute("id");
            document.getElementById("msg").innerHTML=`<b>User selected ${btn} and Computer selected ${selected}</b>`
            checkwin();
        });
});
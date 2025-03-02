// function change(){
//     document.getElementById("h1").style.color="blue";
// }
// console.log(this);
// var isEven=(element)=>{
//     return element % 2===0;
// }

// var res=([2,4,6,8].every(isEven))
// console.log(res);
const myStates=["TamilNadu",1947,"Rajasthan"];
for(let i=0;i < myStates.length;i++){
    if(typeof myStates[i] === "string")continue;
        console.log(myStates[i]);
        
}


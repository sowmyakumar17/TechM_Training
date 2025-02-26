import { ReactNode, useState } from "react";

interface ListProps{
    listName:string;
    elements:string[];
    children:ReactNode;
    whenClicked:()=>void;       
}
function Food(props:ListProps){
    let[foodi,setfoodi]=useState(-1);
    // let foodList= [
    //     "Biriyani",
    //     "Parotta",
    //     "FriedRice"
    // ];
    let HandleClick=(i:number)=>{
        setfoodi(i);
        console.log(Food);
        whenClicked();
    }
    let[userName,setuserName]=useState({
        fN:"Sowmya",
        lN:"Kumar",
        dept:{
            name:"cce",
            regno:"129"
        }
    })
        return(
        <>
        <h2>{props.listName}</h2>
        <h1>{props.children}</h1>
        <ul className="list-group">
            {props.elements.map((f,i)=>(
                <li className={foodi == i ? "list-group-item active" : "list-group-item"}
                key={f}
                onClick={()=>
                    {HandleClick(i);
                    }
                    
                }>{f}</li>))}
        </ul>
        </>
    );
}
export default Food;

function whenClicked() {
    throw new Error("Function not implemented.");
}

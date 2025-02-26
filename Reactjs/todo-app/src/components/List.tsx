import { useState } from "react";

function List(){
  //selectedIndex is the state variable
  let[selectedIndex,setselectedIndex]=useState(-1);
  let listName="Movies";
  let student="Meera";
  let moviesList=[
    "Ghilli",
    "Sachin",
    "Leo"
  ];
  return (
    <>
    <h1>{listName}</h1>
  <ul className="list-group">
    {/* <li className="list-group-item">{student}</li> */}
    {moviesList.map((m,index)=>(
      <li className={selectedIndex == index ? "list-group-item active" : "list-group-item"} 
      key={m} 
      onClick={()=>
      {console.log(m +"-"+index);
      setselectedIndex(index);}
    }>{m}</li>))}
    {/* <li className="list-group-item active" aria-current="true">
      This is not an active list</li> 
    <li className="list-group-item">{student}</li>
    <li className="list-group-item">A second item</li>
    <li className="list-group-item">A third item</li>
    <li className="list-group-item">A fourth item</li>
    <li className="list-group-item">And a fifth one</li> */}
    
</ul>
</>
);
}
export default List;
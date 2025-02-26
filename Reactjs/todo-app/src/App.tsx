import { Fragment } from "react/jsx-runtime";
import WelPanimalar from "./components/WelPanimalar";
import List from "./components/List";
import Food from "./components/Food";
import HeartButton from "./components/HeartButton";
import RestConsume from "./components/RestConsume";

function App() {
  let starters= [
    "Soup",
    "FrenchFries",
    "Nuggets"
  ];
  let foodList= [
    "Biriyani",
    "Parotta",
    "FriedRice"
  ];
  let desserts= [
    "RasaMalai",
    "GulabJamun",
    "Brownie"
  ];
  return (
    <>
    <RestConsume/>
    {/* <HeartButton/> */}
    {/* <WelPanimalar/>
    <br></br>
    <Food listName={"Starters"} elements={starters} whenClicked={()=>console.log("These are available here")} ><h5>Available starters!</h5></Food>
    <br></br>
    <Food listName={"South-Indian Cuisine"} elements={foodList} ><h5>Todays special Menu!</h5></Food>
    <br></br>
    <Food listName={"Desserts"} elements={desserts} ><h5>Sweets in Dine!</h5></Food> 
       <WelPanimalar/>
      <br/>
      <List/>
      <br/>
      <List/> */}
    </>
  );
}
export default App;

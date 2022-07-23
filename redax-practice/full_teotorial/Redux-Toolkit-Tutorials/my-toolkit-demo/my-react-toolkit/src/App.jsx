import { useState } from "react";
import logo from "./logo.svg";
import "./App.css";
import { useSelector, useDispatch } from "react-redux";
import { ordered, restocked } from "./features/cake/cakeSlice";
import { orderedIce, restockedIce } from "./features/iceCream/iceCream";

function App() {
  const numOfCake = useSelector((state) => state.cake.numOfCake);
  const numberOfIce = useSelector((state) => state.iceCream.numOfIceCream);
  const dispatch = useDispatch();
  return (
    <div className="App">
      <h1> numOfCake {numOfCake}</h1>
      <button onClick={() => dispatch(ordered())}> order </button>
      <button onClick={() => dispatch(restocked(5))}> stock 5 </button>
      <br />
      <br />
      <br />
      <br />
      <br />
      <br />
      <h1>Number of IceCream {numberOfIce}</h1>
      <button onClick={() => dispatch(orderedIce())}> Order </button>
      <button onClick={() => dispatch(restockedIce(5))}> stock 5 </button>
    </div>
  );
}

export default App;

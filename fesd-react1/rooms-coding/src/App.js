import React, { Component } from "react";
import { NewHouseForm } from "./components/NewHouseForm";
import { HousesList } from "./components/HousesList";
import "./index.css";

class App extends Component {
  render() {
    return (
      <div>
        <NewHouseForm addNewHouse={addNewHouse} />
        <HousesList />
      </div>
    );
  }
}
export default App;

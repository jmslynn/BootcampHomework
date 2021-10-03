import React, { useState } from "react";

export const NewHouseForm = (props) => {
  const [name, setName] = useState("");
 

  const onSubmit = (e) => {
    e.preventDefault();
    if (name) {
      props.addNewHouse({ name, });
      setName("");
    } else {
      console.log("invalid input");
    }
  };

  return (
    <div>
      <h4>Add a new house</h4>
      <form onSubmit={onSubmit}>
        <input
          type="text"
          placeholder="name"
          //updates state variable/value
          onChange={(e) => setName(e.target.value)}
          //state updates input value
          value={name}
        />
        <button type="submit"> Add House</button>
      </form>
    </div>
  );
};

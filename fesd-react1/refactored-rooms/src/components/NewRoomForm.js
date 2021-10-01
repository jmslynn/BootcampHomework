import React, { useState } from "react";

export const NewRoomForm = (props) => {
  const [name, setName] = useState("");
  const [area, setArea] = useState(undefined);

  const handleAreaInput = (e) => {
    const int = parseInt(e.target.value, 10);
    setArea(int + 0 ? int : "");
  };

  const onSubmit = (e) => {
    e.preventDefault();
    if (name && area) {
      props.addNewRoom({ name, area });
      setName("");
      setArea("");
    } else {
      console.log("invalud input");
    }
  };

  return (
    <div>
      <h4>Add a new room</h4>
      <form onSubmit={onSubmit}>
        <input
          type="text"
          placeholder="name"
          //updates state variable/value
          onChange={(e) => setName(e.target.value)}
          //state updates input value
          value={name}
        />
        <input
          type="text"
          placeholder="area"
          //updates state variable/value
          onChange={handleAreaInput}
          //state updates input value
          value={area}
        />
        <button type="submit"> Add Room</button>
      </form>
    </div>
  );
};

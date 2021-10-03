import React from "react";


export const House = (props) => {
  const { house, updateHouse } = props;

  const deleteHouse = (houseId) => {
    const updatedHouse = {
      ...house.filter((x) => x._id !== houseId)
    };
    updateHouse(updatedHouse);
  };

  //short way
  const addNewHouse = (house) =>
    updateHouse({ ...house, house });

  const houses = () => (
    <ul>
      {house.map((house, index) => (
        <li key={index}>
          <label> {`${house.name} Area: ${house.area}`}</label>
          <button onClick={(e) => deleteHouse(house._id)}>Delete</button>
        </li>
      ))}
    </ul>
  );

  return (
    <div>

      <h1>{house.name}</h1>

    </div>
  );
};
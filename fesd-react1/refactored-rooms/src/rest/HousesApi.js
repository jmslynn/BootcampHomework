const HOUSES_ENDPOINT = "https://ancient-taiga-31359.herokuapp.com/api/houses";

class HousesApi {
  get = async () => {
    try {
      const resp = await fetch(HOUSES_ENDPOINT);
      //assigning value to data variable and returning
      const data = await resp.json();
      return data;
    } catch (e) {
      console.log("issue with fetchHouses", e);
    }
  };

  put = async (house) => {
    try {
      const resp = await fetch(`${HOUSES_ENDPOINT}/${house._id}`, {
        method: "PUT",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(house)
      });
      //returning calculated value (compared to above)
      return await resp.json();
    } catch (e) {
      console.log("issue with updating houses", e);
    }
  };
}
export const housesApi = new HousesApi();

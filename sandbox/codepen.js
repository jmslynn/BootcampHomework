// Some transactions to work with
const entities = [{
  id: 'abf3abac-3d22-488d-b208-dc9b1e44008e',
  date: new Date('2021-09-27'),
  payee: 'Ullrich Group',
  categoryId: "914d19bf-75b0-468c-801c-442a7e9e285b",
  notes: 'nullam varius nulla facilisi',
  amount: -240.2,
}, {
  id: '3b2e29b6-d911-4c8b-8e4e-5808f7559418',
  date: new Date('2022-03-24'),
  payee: 'Tromp, Howell and Grant',
  categoryId: '91c33650-6df8-4845-b3e3-2450bed8541c',
  notes: 'nulla neque libero convallis',
  amount: -297.8,
}, {
  id: '0249ab94-b9b2-4890-9fff-09408a9a18d8',
  date: new Date('2022-03-22'),
  payee: 'Macejkovic, Sipes and Swift',
  categoryId: "914d19bf-75b0-468c-801c-442a7e9e285b",
  notes: "",
  amount: -147.97,
}, {
  id: '5ab89d1b-6199-4e3a-bc40-047788dad4cb',
  date: new Date('2022-03-13'),
  payee: 'Bergnaum-Pouros',
  categoryId: "914d19bf-75b0-468c-801c-442a7e9e285b",
  notes: '',
  amount: -295.46,
}, {
  id: '960c3d3f-cf19-4cfb-9dea-488951a83170',
  date: new Date('2021-07-09'),
  payee: 'Windler Inc',
  categoryId: '85bc38b9-4ebe-4639-b82a-789b4918f9e6',
  notes: 'nulla sed accumsan',
  amount: 255.48,
}]
//========================================================================================
// The category - it only has an id because that's all we need for now
const category = {
  id: "914d19bf-75b0-468c-801c-442a7e9e285b"
}

// isolate the transactions in the category

//filter provides the for loop, but will need the comparison if statement
//let catArray = entities.filter((entities.categoryId, category.id) => entity.categoryId == category.id);


let catArray = entities.filter((entity) => 
  entity.categoryId === category.id)
  console.log(catArray);

let startDate = new Date("03-01-2022");
let endDate = new Date("03-31-2022";

let dateArray = entities.filter((entity) => 
  entity.categoryId === entity.categoryId && entity.date >= startDate && entity.date <= endDate);
  console.log(dateArray);



// TODO: get the total spent across all categories, you can just add the positive to the negatives
const totalAll = entities.reduce((accumulator, currentValue) => accumulator + currentValue.amount, 0);

// TODO: Get the total spent for the given category
// need to round
const totalCategory = catArray.reduce((accumulator, currentValue) => accumulator + currentValue.amount, 0).tofixed(2);

// TODO: Get the total spent for the given category in the month of March 2022
const totalCategoryMonth = 0;

document.getElementById("spent").textContent = totalAll;
document.getElementById("categorySpent").textContent = totalCategory;
document.getElementById("categoryMonthSpent").textContent = totalCategoryMonth;
class Product {
  constructor(brand, product, size) {
    this.brand = brand;
    this.product = product;
    this.size = size;
  }

  //is this actually used?
    describe() {
return `product thingy: ${this.brand} ${this.product}, size: ${this.size}`;
    }

  
} //end product class

class Category {
constructor(name, products) {
  this.name = name;
  this.products = [];
}

//just copied and adjusted this from menu demo. how does it work and is it used?.
// addProduct(product) {
//   if (product instanceof Product) {
//     this.products.push(product); 
//   } else {
//     throw new Error('You can only add an instance of Product. Argument is not a product: ${product}');
//   }
// }

describe() {
return `category: ${this.name}`
}
} //end category class

class Menu {
constructor() {
  this.categories = [];
  this.selectedCategory = null;
}

start() {
  let selection = this.showMainMenu(); 
  // gets user input
  while (selection != 0) {
switch (selection) {
case '1': 
this.createCategory();
break;
case '2':
  this.showCategories();
  break;
  case '3':
    this.showACategory();
    break;
    case '4':
      this.deleteACategory();
      break;
      default:
        selection = 0;
}
selection = this.showMainMenu();
  }
  alert('Goodbye!');
}

showMainMenu() {
  return prompt(`
  MAIN MENU
  0) exit program
  1) create a new category
  2) view all categories
  3) view a category
  4) delete a category
  `);
}

showCategoryMenu(categoryInfo) {
  return prompt(`
  PRODUCT MENU
  0) back to main menu
  1) add a product
  2) delete a product
  -----------------------
  ${categoryInfo}
  `);
}
createCategory() {
  let name = prompt('Enter name of new category: ');
  this.categories.push(new Category(name));
}

showCategories() {
  let categoryString = '';
this.categories.forEach((category, index) => {
  categoryString += index + ') ' + category.describe() + '\n';
  })
  alert(categoryString);
}

showACategory() {
  let index = prompt('Enter category number to display:');
  if (index > -1 && index < this.categories.length) {
this.selectedCategory = this.categories[index];
//why not use the describe function here?
let description = 'Category: ' + this.selectedCategory.name + '\n';
let productString = '';
for (let i=0; i < this.selectedCategory.products.length; i++) {
  description += i + ') ' + //this.products.describe();
  
  this.selectedCategory.products[i].brand 
  + ' ' + this.selectedCategory.products[i].product + '\n';
}
let selection = this.showCategoryMenu(description);
switch (selection) {
  case '1': 
  this.addProduct();
  break;
  case '2':
    this.deleteProduct();
}
  }
}

deleteACategory() {
  let index = prompt('Enter category number to delete:');
  if (index > -1 && index < this.categories.length) {
    this.categories.splice(index, 1);
  }
}

addProduct() {
  let brand = prompt('Enter the product brand name:');
  let product = prompt('Enter the name of the product:');
  let size = prompt('Enter the size of the product:');
  this.selectedCategory.products.push(new Product(brand, product, size));
}

deleteProduct() {
  let index = prompt('Enter the number for the product you wish to delete:');
  if (index > -1 && this.selectedCategory.products.length) {
    this.selectedCategory.products.splice(index, 1);
  }
}
}//end menu class

let menu = new Menu();
menu.start();
create DATABASE if not exists products;
use products;
drop table if exists products;
create table products (
  id int(10) not null AUTO_INCREMENT,
  name varchar(50) not null,
  brand varchar(50) not null,
  PRIMARY KEY(id)
);
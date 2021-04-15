create database if not exists cars;
use cars;
drop table if exists customer_cars;
drop table if exists customers;
drop table if exists cars;
CREATE TABLE customers (
  id int(11) not null AUTO_INCREMENT,
  first_name varchar(20) not null,
  last_name varchar(20) not null,
  primary key (id)
);
create table cars (
  id int(11) not null AUTO_INCREMENT,
  model varchar(15) not null,
  make varchar(15) not null,
  year YEAR not null,
  price decimal (6, 2) not null,
  primary key (id)
);
create table customer_cars (
  id int(11) not null AUTO_INCREMENT,
  car_id int(11) not null,
  customer_id int(11) not null,
  primary key (id),
  foreign key (car_id) references cars(id),
  foreign key (customer_id) references customers(id)
);
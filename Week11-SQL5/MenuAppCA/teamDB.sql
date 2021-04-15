create DATABASE if not exists teams;
use teams;
drop table if exists members;
drop table if exists teams;
create table teams (
  id int(10) not null AUTO_INCREMENT,
  name varchar(50) not null,
  PRIMARY KEY(id)
);
create table members (
  id int(10) not null AUTO_INCREMENT,
  first_name VARCHAR(25) NOT NULL,
  last_name varchar(25) not null,
  team_id int(10) not null,
  primary key(id),
  foreign key(team_id) references teams(id)
);
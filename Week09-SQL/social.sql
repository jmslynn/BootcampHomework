create database if not exists social;
use social;
drop table if exists comments;
drop table if exists posts;
drop table if exists users;
CREATE TABLE users (
  id int(11) not null AUTO_INCREMENT,
  user_name varchar(20) not null,
  first_name varchar(20) not null,
  last_name varchar(20) not null,
  email varchar(25) not null,
  password varchar(25) not null,
  user_bio varchar(255),
  primary key (id)
);
create table posts (
  id int(11) not null AUTO_INCREMENT,
  user_id int(11) not null,
  post_date datetime not null default CURRENT_TIMESTAMP,
  post_title varchar(100) not null,
  post_body text not null,
  primary key (id),
  foreign key (user_id) references users(id)
);
create table comments (
  id int(11) not null AUTO_INCREMENT,
  user_id int(11) not null,
  post_id int(11) not null,
  comment_date datetime not null default CURRENT_TIMESTAMP,
  comment_body text not null,
  primary key (id),
  foreign key (user_id) references users(id),
  foreign key (post_id) references posts(id)
);
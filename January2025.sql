-- Database operations
create database if not exists ifi character set = utf8mb4 collate utf8mb4_0900_ai_ci;
show create database ifi; -- to view database meta information
show databases; -- to view all databases
drop database if exists ifi; -- to delete a database
use ifi; -- selecting a database

-- Table operations
create table if not exists ifi.language(
	language_id int not null primary key auto_increment,
    name varchar(200) not null
)character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists ifi.movie(
	title
    language_id
)character set = utf8mb4 collate utf8mb4_0900_ai_ci;








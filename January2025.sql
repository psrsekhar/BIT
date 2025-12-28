-- Database operations
drop database if exists ifi; -- to delete a database
create database if not exists ifi character set = utf8mb4 collate utf8mb4_0900_ai_ci;
show create database ifi; -- to view database meta information
show databases; -- to view all databases
use ifi; -- selecting a database

-- Table operations
create table if not exists ifi.language(
	id int not null primary key auto_increment,
    name varchar(200) not null
)default character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists ifi.movie_award_category(
	id int not null primary key auto_increment,
    name varchar(200) not null
)default character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists ifi.movie_roles(
	id int not null primary key auto_increment,
    name varchar(200) not null
)default character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists ifi.movie_award_providers(
	id int not null primary key auto_increment,
    name varchar(200) not null
)default character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists ifi.movie_crew(
	id int not null primary key auto_increment,
    name varchar(200) not null,
	role_id int not null,
	email varchar(200) null,
	contact_info text null,
    -- foreign key constraints (2 indexes will be created for below)
    constraint movie_crew_role_id_fk foreign key(role_id) references ifi.movie_roles(id) on update cascade on delete cascade,
    -- unique constraints
    unique key movie_crew_name_role_id(name, role_id)
)default character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists ifi.movie(
	id int not null primary key auto_increment,
	title varchar(200) not null,
	released_on year not null,
    rating decimal(3,1) not null,
    director_id int not null,
	cast text not null, -- comma seperated crew id values
    language_id int not null,
    -- foreign key constraints
    constraint movie_director_id_fk foreign key(director_id) references ifi.movie_crew(id) 
    on update cascade on delete cascade,
    constraint movie_language_id_fk foreign key(language_id) references ifi.language(id) 
    on update cascade on delete cascade
)default character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists ifi.movie_awards(
	id int not null primary key auto_increment,
	movie_id int not null,
	category_id int not null,
	awarded_on year not null, 
	awarded_to int not null,
	awarded_by int not null,
    -- foreign key constraints
    constraint movie_awards_movie_id_fk foreign key(movie_id) references ifi.movie(id) 
    on update cascade on delete cascade,
    constraint movie_awards_category_id_fk foreign key(category_id) references ifi.movie_award_category(id) 
    on update cascade on delete cascade,
	constraint movie_awards_awarded_to_fk foreign key(awarded_to) references ifi.movie_crew(id) 
    on update cascade on delete cascade,
    constraint movie_awards_awarded_by_fk foreign key(awarded_by) references ifi.movie_award_providers(id) 
    on update cascade on delete cascade,
    -- unique key constraints
    unique key movie_awards_movie_category_awarde_to_by_uk (movie_id, category_id, awarded_to, awarded_by)
)default character set = utf8mb4 collate utf8mb4_0900_ai_ci;

-- to list all tables in a database
show tables;

-- information of a specific table
desc ifi.movie_awards;

-- adding a new column
alter table ifi.movie add column collection int not null default -1 after rating;

-- modify a column (changing data type of a column)
alter table ifi.movie_crew modify column contact_info varchar(10) null;

-- renaming a column
alter table ifi.movie_crew change contact_info phone_number varchar(10) null;

-- deleting a column
alter table ifi.movie_crew drop column email;

-- deleting a table
drop table if exists ifi.movie_crew;

-- inserting a row in to table
insert into ifi.language values (1, "English");
insert into ifi.language (name) values ("Hindi");

-- insert multiple rows
insert into ifi.language (name) values ("Telugu"), ("Tamil"), ("Kannada"), 
("Malayalam");

create table if not exists byts.language(
	id int not null primary key auto_increment,
    name varchar(200) not null
)default character set = utf8mb4 collate utf8mb4_0900_ai_ci;
-- select insert
insert into byts.language select id, name from ifi.language;

-- insert ignore 
insert ignore into ifi.language values (11, "Bengali");

-- update on same key 
insert into ifi.language values (11, "Sanskrit") on duplicate key update name = "Sanskrit";

-- replace a row
replace into ifi.language values (11, "Sanskrit");

-- insert from a file
load data infile "<path-to-file>" into table ifi.language;

-- mysql version
select @@version; 
select version();
select 2; -- prints table with 2 as column and 2 as a row value
select 2+3; -- prints table with (2+3) as column and 5 as a row value

-- to get all rows from a table
select *from ifi.language;

-- to get selected columns from a table
select name from ifi.language;

-- get columns based on a condition (filtering)
select name from ifi.language where id >= 5;

-- get rows based on pattern
select name from ifi.language where name like 'T%';

insert into ifi.movie_award_category (name) values 
("Best Film"), ("Best Actor"), ("Best Actress"), ("Best Director"), ("Music");

insert into ifi.movie_roles (name) values ("Actor"), ("Actress"), ("Artist"), 
("Director"), ("Producer"), ("Music Director"), ("Choreographer"), ("DOP");

insert into ifi.movie_award_providers (name) values ("Oscar"), ("National Awards"),
("Film Fare"), ("SIIMA");

insert into ifi.movie_crew (name, role_id, email, phone_number) values
("Samantha", 2, "samantha@143.com", "9123456789"),
("Trisha", 2, "trisha@143.com", "9123456799"),
("Vijay Joseph", 1, "vijay@143.com", "9123456999"),
("Lokesh Kanakaraj", 4, "lokesh.k@143.com", "9123459999"),
("Anirudh Ravichandran", 6, "anirudh.r@143.com", "9123499999");





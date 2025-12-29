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
	cast text not null, -- comma seperated crew id's
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
alter table ifi.movie add column collection bigint default null after rating;

-- modify a column (changing data type of a column)
alter table ifi.movie_crew modify column contact_info varchar(10) null;

-- renaming a column
alter table ifi.movie_crew change contact_info phone_number varchar(10) null;

-- deleting a column
-- alter table ifi.movie_crew drop column email;

-- deleting a table
-- drop table if exists ifi.movie_crew;

-- inserting a row in to table
insert into ifi.language values (1, "English");
insert into ifi.language (name) values ("Hindi");

-- insert multiple rows
insert into ifi.language (name) values ("Telugu"), ("Tamil"), ("Kannada"), 
("Malayalam");

drop table if exists byts.language;

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
-- load data infile "<path-to-file>" into table ifi.language;

insert into ifi.movie_award_category (name) values 
("Best Film"), ("Best Actor"), ("Best Actress"), ("Best Director"), ("Best Music");

insert into ifi.movie_roles (name) values ("Actor"), ("Actress"), ("Artist"), 
("Director"), ("Producer"), ("Music Director"), ("Choreographer"), ("DOP");

insert into ifi.movie_award_providers (name) values ("Oscar"), ("National Awards"),
("Film Fare"), ("SIIMA");

insert into ifi.movie_crew (name, role_id, email, phone_number) values
-- Actors
('Mahesh Babu', 1, 'mahesh@cinema.com', '9111111111'),
('Yash', 1, 'yash@cinema.com', '9222222222'),
('Ranbir Kapoor', 1, 'ranbir@cinema.com', '9333333333'),
('Vijay Joseph', 1, 'vijay@cinema.com', '9444444444'),
-- Actresses
('Samantha', 2, 'samantha@cinema.com', '9555555555'),
('Trisha', 2, 'trisha@cinema.com', '9666666666'),
('Pooja Hegde', 2, 'pooja@cinema.com', '9777777777'),
('Rashmika Mandanna', 2, 'rashmika@cinema.com', '9888888888'),
-- Directors
('S S Rajamouli', 4, 'rajamouli@cinema.com', '9999999999'),
('Prashanth Neel', 4, 'neel@cinema.com', '9111222233'),
('Ayan Mukerji', 4, 'ayan@cinema.com', '9222333344'),
('Lokesh Kanagaraj', 4, 'lokesh@cinema.com', '9333444455'),
-- Music Directors
('Anirudh Ravichandran', 6, 'anirudh@cinema.com', '9444555566'),
('A R Rahman', 6, 'rahman@cinema.com', '9555666677');

insert into ifi.movie
(title, released_on, rating, collection, director_id, cast, language_id) values
-- Telugu
('Baahubali', 2015, 8.8, 1800000000, 9, '1,5', 3),
('RRR', 2022, 9.0, 2400000000, 9, '1,8', 3),
-- Tamil
('Leo', 2023, 8.2, 600000000, 12, '4,6', 4),
('Master', 2021, 7.9, 350000000, 12, '4', 4),
('Vikram', 2022, 8.5, 500000000, 12, '4', 4),
-- Kannada
('KGF Chapter 1', 2018, 8.2, 2500000000, 10, '2', 5),
('KGF Chapter 2', 2022, 8.4, 4200000000, 10, '2', 5),
-- Hindi
('Yeh Jawaani Hai Deewani', 2013, 7.1, 320000000, 11, '3,6', 2),
('Brahmastra', 2022, 6.8, 430000000, 11, '3,6', 2);

insert into ifi.movie_awards
(movie_id, category_id, awarded_on, awarded_to, awarded_by) values
-- Baahubali
(1, 1, 2016, 9, 2),   -- Best Film → Rajamouli → National Awards
(1, 4, 2016, 9, 3),   -- Best Director → Rajamouli → Film Fare
(1, 5, 2016, 14, 3),  -- Best Music → A R Rahman → Film Fare
-- RRR
(2, 1, 2023, 9, 1),   -- Best Film → Oscar
(2, 4, 2023, 9, 2),   -- Best Director → National Awards
-- Leo
(3, 2, 2024, 4, 4),   -- Best Actor → Vijay → SIIMA
(3, 5, 2024, 13, 3),  -- Best Music → Anirudh → Film Fare
-- Vikram
(5, 2, 2023, 4, 4),   -- Best Actor → Vijay → SIIMA
(5, 5, 2023, 13, 3),  -- Best Music → Anirudh → Film Fare
-- KGF Chapter 2
(7, 1, 2023, 10, 2),  -- Best Film → Prashanth Neel → National Awards
(7, 2, 2023, 2, 3),   -- Best Actor → Yash → Film Fare
-- Yeh Jawaani Hai Deewani
(8, 2, 2014, 3, 3);   -- Best Actor → Ranbir → Film Fare

-- mysql version
select @@version; 
select version();
select 2; -- prints table with 2 as column and 2 as a row value
select 2+3; -- prints table with (2+3) as column and 5 as a row value

-- to get all rows from a table
select * from ifi.language;

-- to get selected columns from a table
select name from ifi.language;

-- get columns based on a condition (filtering)
select name from ifi.language where id >= 5;

-- get rows based on pattern
select name from ifi.language where name like 'T%';

-- movies released after 2020
select * from ifi.movie where released_on >= 2020;

-- tamil movies which have rating above or equal to 8.0
select a.id, a.name, b.title, b.released_on, b.rating, b.language_id from
(select id, name from ifi.language where id = 4)a
inner join
(select title, released_on, rating, language_id from ifi.movie WHERE rating >= 8.0)b
ON a.id = b.language_id;

-- to get all movies with language (inner join)
select a.id, a.name, b.title, b.released_on, b.rating, b.language_id from
(select id, name from ifi.language)a
inner join
(select title, released_on, rating, language_id from ifi.movie)b
ON a.id = b.language_id;

-- to get all movies with award informations (left join)
select a.id, a.title, a.released_on, a.rating, b.category_id, b.awarded_on, b.awarded_to, 
b.awarded_by  from
(select id, title, released_on, rating from ifi.movie)a
left join
(select movie_id, category_id, awarded_on, awarded_to, awarded_by from ifi.movie_awards)b
on a.id = b.movie_id;

-- to get all languages with movie info (right join)
select b.id, b.name, a.title, a.released_on, a.rating, a.language_id from
(select title, released_on, rating, language_id from ifi.movie)a
right join
(select id, name from ifi.language)b
ON a.language_id = b.id;

-- to get movies with out awards
select a.id, a.title, a.released_on, a.rating, b.category_id, b.awarded_on, b.awarded_to, 
b.awarded_by, b.movie_id  from
(select id, title, released_on, rating from ifi.movie)a
left join
(select movie_id, category_id, awarded_on, awarded_to, awarded_by from ifi.movie_awards)b
on a.id = b.movie_id;

-- to get movies with award full information
select g.id, g.title, g.released_on, g.rating, g.category_id, h.category_name, 
g.awarded_on, g.awarded_to, g.crew_name, g.awarded_by, g.awarded_by_name from
(select e.id, e.title, e.released_on, e.rating, e.category_id, e.awarded_on, e.awarded_to, 
f.crew_name, e.awarded_by, e.awarded_by_name from
(select c.id, c.title, c.released_on, c.rating, c.category_id, c.awarded_on, c.awarded_to, 
c.awarded_by, d.awarded_by_name from
(select a.id, a.title, a.released_on, a.rating, b.category_id, b.awarded_on, b.awarded_to, 
b.awarded_by  from
(select id, title, released_on, rating from ifi.movie)a
inner join
(select movie_id, category_id, awarded_on, awarded_to, awarded_by from ifi.movie_awards)b
on a.id = b.movie_id)c
inner join
(select id, name as awarded_by_name from ifi.movie_award_providers)d
on c.awarded_by = d.id)e
inner join
(select id, name as crew_name from ifi.movie_crew)f
on e.awarded_to = f.id)g
inner join
(select id, name as category_name from ifi.movie_award_category)h
on g.category_id = h.id;
-- Aggregate functions : count(), avg(), sum(), min(), max()

-- number of awards that a movie got (leo) -> count()
select a.title, count(b.awarded_on) as award_count from
(select id, title from ifi.movie where id = 3)a
inner join
(select movie_id, awarded_on, awarded_to, awarded_by from ifi.movie_awards)b
on a.id = b.movie_id;

-- average rating of all movies
select avg(rating) as average_rating from ifi.movie;

-- most rated movie
select max(rating) as top_rating from ifi.movie;

-- least rated movie
select min(rating) as top_rating from ifi.movie;

-- number of movies released in each year (group by)
select released_on, count(title) as movie_count from ifi.movie group by released_on;

-- get number of movies each language have
select a.name as language_name, count(b.language_id) as movie_count from
(select id, name from ifi.language)a
left join
(select language_id from ifi.movie)b
on a.id = b.language_id group by a.id;

-- get languages with more than or equal to 2 movies (having)
-- filtering with 'where' clause can not be used after group by
select a.name as language_name, count(b.language_id) as movie_count from
(select id, name from ifi.language)a
left join
(select language_id from ifi.movie)b
on a.id = b.language_id group by a.id having count(b.language_id) >= 2;

-- get number of movies each language have in order of movie count (order by)
select a.name as language_name, count(b.language_id) as movie_count from
(select id, name from ifi.language)a
left join
(select language_id from ifi.movie)b
on a.id = b.language_id group by a.id order by movie_count desc, a.name asc;

-- top language by average rating of movies and update 0.0 as value for null values
select a.name as language_name, ifnull(avg(b.rating), 0.0) as movie_rating from
(select id, name from ifi.language)a
left join
(select language_id, rating from ifi.movie)b
on a.id = b.language_id group by a.id order by movie_rating desc, a.name asc;

-- highest collected movie
select id, title, collection, rating from ifi.movie order by collection desc limit 1;

-- second highest collected movie
select id, title, collection, rating from ifi.movie order by collection desc limit 1 offset 1;

-- string functions in mysql
select concat("samantha", "sairam"); -- to append two strings
select concat_ws("-", "samantha", "sairam"); -- to append string with seperator
-- to get length/number of characters from a string
select char_length("samantha"), length("samantha"), character_length("samantha"); 
-- to get a substring 
select left("samantha", 4); -- first 4 characters in a string 
select right("samantha", 4); -- last 4 characters in a string
select substr("samantha", 4, 6); -- sub string of a string
select ltrim("   samantha sairam    "); -- removing spaces at start
select rtrim("   samantha sairam    "); -- removing spaces at end
select trim("   samantha sairam    "); -- removing space
select reverse("Malayalam"); -- reverse order of a string
-- we can also nest functions in mysql
-- converting string in to lowercase 
select reverse(lower("Malayalam")), lcase("Malayalam");
-- converting string in to uppercase 
select reverse(upper("Malayalam")), ucase("Malayalam");
-- updating a substring
select replace("samantha is married", "married", "re-married");

-- Date & Time functions
select now(); -- to get current time stamp
select curdate(); --  to get current date
select curtime(); -- to get current time
select day(curdate()); -- to get current day
select month(curdate()); -- to get current month
select year(curdate()); -- to get current year
select week(curdate()); --  to get week number in a year (1-52)

















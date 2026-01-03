-- Database operations
create database if not exists byts character set utf8mb4 collate utf8mb4_0900_ai_ci;
show create database byts;
use byts;
-- drop database if exists byts;

-- Table Operations
create table if not exists byts.movies(
	id int auto_increment primary key not null,
    title varchar(250) not null,
    cast text null,
    director varchar(250) not null,
    released_on year not null,
    rating decimal(3, 1) not null
)default character set = utf8mb4 collate = utf8mb4_0900_ai_ci;

create table if not exists byts.film_categories(
	id int auto_increment primary key not null,
    name varchar(250) not null
)default character set = utf8mb4 collate = utf8mb4_0900_ai_ci;

create table if not exists byts.awards_provider(
	id int auto_increment primary key not null,
    name varchar(250) not null
)default character set = utf8mb4 collate = utf8mb4_0900_ai_ci;

create table if not exists byts.film_crew(
  id int auto_increment primary key not null,
  name varchar(250) not null,
  category_id int not null,
  foreign key (category_id) references byts.film_categories(id) on update cascade,
  foreign key (category_id) references byts.film_categories(id) on delete cascade
) default character set = utf8mb4 collate = utf8mb4_0900_ai_ci;

create table if not exists byts.awards(
   id int auto_increment primary key not null,
   award_provider_id int not null,
   award_category_id int not null,
   movies_id int not null,
   film_crew_id int not null,
   awarded_on year not null,
  foreign key (award_provider_id) references byts.awards_provider(id) on update cascade,
  foreign key (award_provider_id) references byts.awards_provider(id) on delete cascade,
  foreign key (award_category_id) references byts.film_categories(id) on update cascade,
  foreign key (award_category_id) references byts.film_categories(id) on delete cascade,
  foreign key (movies_id) references byts.movies(id) on update cascade,
  foreign key (movies_id) references byts.movies(id) on delete cascade,
  foreign key (film_crew_id) references byts.film_crew(id) on update cascade,
  foreign key (film_crew_id) references byts.film_crew(id) on delete cascade
)default character set = utf8mb4 collate = utf8mb4_0900_ai_ci;

-- list all tables in a database
show tables;

-- describe a table
desc movies;

-- adding a new column
alter table byts.awards add column last_modified_on timestamp default current_timestamp after id;

-- modify existing column
alter table byts.awards modify column awarded_on varchar(4) not null;

-- rename a column
alter table byts.awards change last_modified_on last_modified timestamp default current_timestamp;

-- delete a column
alter table byts.awards drop column last_modified;

-- delete a table
-- drop table if exists byts.awards;

-- single insert in to table
insert into byts.film_categories (name) values ("Actor");

-- multiple insert
insert into byts.film_categories (name) values 
("Actress"), ("Director"), ("Music"), ("Film");

insert into byts.awards_provider (name) values 
("OSCAR"), ("National Award"), ("Film Fare"), ("Nandi");

create table if not exists byts.test(
	id int auto_increment primary key not null,
    name varchar(250) not null
)default character set = utf8mb4 collate = utf8mb4_0900_ai_ci;

-- select insert
insert into byts.test (name) select name from byts.awards_provider order by id;

-- insert ignore
insert ignore into byts.awards_provider (id, name) values (1, "OSCAR");

-- insert on duplicate key
insert into byts.awards_provider (id, name) values (1, "Oscar") on duplicate key update name = "Oscar";

-- replace a row
replace into byts.awards_provider (id, name) values (1, "OSCAR");

-- insert from a file
-- load data infile "<path-of the file>" into table byts.awards_provider;

-- to get mysql version
select @@version;
select version();

-- to get all info from table
select *from byts.awards_provider;

-- get selected columns from table
select name from byts.awards_provider;

-- condition based select
select id, name from byts.awards_provider where id = 2;

-- get custom column (alias) name
select id, name AS award_provider_name from byts.awards_provider where id = 2;

select id, name from byts.film_categories;

insert into byts.film_crew (name, category_id) values 
("Vijay",1), ("STR", 1), ("Ajith", 1), ("Samantha", 2), ("Trisha", 2), ("AJ", 2), 
("K.S. Ravi Kumar", 3), ("A.R Murgados", 3), ("AR Rahman", 4),("Haris Jayaraj", 4),
("Atlee",3);

select * from byts.film_crew;

alter table byts.movies modify column director int not null;

alter table byts.movies add constraint fk_movies_crew foreign key (director) references
byts.film_crew(id) on update cascade on delete cascade;

insert into byts.film_crew (name, category_id) values 
("Vijay",1), ("STR", 1), ("Ajith", 1), ("Samantha", 2), ("Trisha", 2), ("AJ", 2), 
("K.S. Ravi Kumar", 3), ("A.R Murgados", 3), ("AR Rahman", 4),("Haris Jayaraj", 4),
("Atlee",3);

INSERT INTO byts.movies (id, title, cast, director, released_on, rating) VALUES
(1, 'Mersal', '1,4', 11, 2017, 8.3),
(2, 'Vinnaithaandi Varuvaayaa', '2,5', 7, 2010, 7.2),
(3, 'Theri', '1,4', 8, 2016, 7.8),
(4, 'Viswasam', '3,6', 7, 2019, 6.9),
(5, 'Bigil', '1,4', 11, 2019, 6.7);

INSERT INTO byts.awards
(id, award_provider_id, award_category_id, movies_id, film_crew_id, awarded_on)
VALUES
(1, 1, 5, 1, 11, '2018'),
(2, 3, 1, 1, 1, '2018'),
(3, 4, 4, 1, 9, '2018'),
(4, 2, 3, 2, 7, '2011'),
(5, 3, 1, 3, 1, '2017'),
(6, 4, 5, 5, 11, '2020');

-- getting info with expressions
select id, title, released_on, (rating+0.2) as rating from byts.movies;

-- filtering rows based on a condition
select * from byts.movies where rating >= 8.0;

-- filtering rows based on a range
select * from byts.movies where rating between 7.5 and 9.0;
select * from byts.movies where rating >= 7.5 and rating <=9.0;

-- filtering rows based on a custom range/matching values
select * from byts.movies where id in (1,3,5);

-- filtering rows based on pattern
select * from byts.movies where title like 's%';

-- sorting based on multiple columns
select * from byts.movies order by title, released_on asc;

-- limit rows (top, lower selection)
select * from byts.movies order by rating desc limit 3;

-- Aggregate functions : sum(), count(), avg(), min(), max()
select count(*) from byts.movies;

-- to get year wise movie count
select released_on, count(released_on) from byts.movies group by released_on;

-- get movies with awards (inner join)
-- get all awards given for movies (left join)
-- get all movies and if any awards given (right join)
-- get awards with out movie info (outer join)
select a.id, a.award_provider_id, a.award_category_id, a.movies_id, b.title, a.film_crew_id, 
a.awarded_on from
(select id, award_provider_id, award_category_id, movies_id, film_crew_id, awarded_on
 from byts.awards)a
inner join
(select id, title, rating from byts.movies)b ON a.movies_id = b.id;

-- to get all movies and award count
select a.title, count(b.movies_id) as award_count from
(select id, title, rating from byts.movies)a
left join
(select id, award_provider_id, award_category_id, movies_id, film_crew_id, awarded_on
 from byts.awards)b ON a.id = b.movies_id group by a.id;
 
-- nested joins (to get award info)
select g.id, g.award_provider_id, g.provider_name, g.award_category_id, g.name, g.movies_id, g.title,
 g.film_crew_id, h.recieved_by, g.awarded_on from
(select e.id, e.award_provider_id, f.provider_name, e.award_category_id, e.name, e.movies_id, 
e.title, e.film_crew_id, e.awarded_on from
(select c.id, c.award_provider_id, c.award_category_id, d.name, c.movies_id, c.title, c.film_crew_id, 
c.awarded_on from
(select a.id, a.award_provider_id, a.award_category_id, a.movies_id, b.title, a.film_crew_id, 
a.awarded_on from
(select id, award_provider_id, award_category_id, movies_id, film_crew_id, awarded_on
 from byts.awards)a
inner join
(select id, title, rating from byts.movies)b on a.movies_id = b.id)c
inner join
(select id, name from byts.film_categories)d on c.award_category_id = d.id)e
inner join
(select id, name as provider_name from byts.awards_provider)f on e.award_provider_id = f.id)g
inner join
(select id, name as recieved_by from byts.film_crew)h on g.film_crew_id = h.id;

-- string functions
select concat(title, released_on, rating) from byts.movies;
select concat_ws("-", title, released_on, rating) from byts.movies;
select title, length(title), char_length(title), character_length(title) from byts.movies;
-- to get first 4 characters from string
select substr(title, 4) from byts.movies;
select replace("samantha is married", "married", "not married");
select trim(" Samantha Sairam "); -- removing spaces in a string
select ltrim(" Samantha Sairam "); -- removing space at start of string
select rtrim(" Samantha Sairam "); -- removing space at end of string
-- nested functions are allowed
select reverse(lcase("Samantha"));
select reverse(lower("Samantha"));
select ucase("Samantha");
select upper("Samantha");
select right("samantha",4);
select left("samantha",4);

-- Date & Time Functions
select now(); -- to get current timestamp
select curdate(); -- to get current date
select curtime(); -- to get current time
select day(curdate()); -- to get current day
select month(curdate()); -- to get current month
select year(curdate()); -- to get current year

select weekday(curdate()); -- to get week number
select dayname(curdate()); -- to get week name

















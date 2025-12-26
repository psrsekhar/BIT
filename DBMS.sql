-- Database Operation
create database if not  exists byts character set utf8mb4 collate utf8mb4_0900_ai_ci;
show create database byts;
use byts;
-- drop  database if exists byts; -- to delete entire database 



-- table operations
create table if not exists byts.movies(
	id int auto_increment primary key not null  ,  -- auto_increment refers to automatically it start with 0 to n,not null refers to  this column not be a null
    title varchar(250) not null,
    cast text null ,
    director varchar(250) not null,
    released_on year not null,
    rating decimal(3,2) not null  -- first digit refer how manay digit you want  ex :999.99 second digit is refer to point two digit


) default character set=utf8mb4 collate =utf8mb4_0900_ai_ci;


create table if not exists byts.film_categories(
id int auto_increment primary key not null,-- A primary key is a column (or set of columns) in a table that uniquely identifies each row
name varchar(250) not null

)default character set=utf8mb4 collate =utf8mb4_0900_ai_ci;


create table if not exists byts.awards_providers(
id int auto_increment primary key not null,
name varchar(250) not null
)default character set=utf8mb4 collate =utf8mb4_0900_ai_ci;

create table if not exists byts.film_crew(
id int auto_increment primary key not null,
name varchar(250) not null,
category_id int not null,
foreign key (category_id) references byts.film_categories(id) on update cascade,-- the update and delete is refers to whenever the parent class  is update or delete any value it reflect on child class also 
foreign key (category_id) references byts.film_categories(id) on delete cascade
)default character set=utf8mb4 collate =utf8mb4_0900_ai_ci;


create table if not exists byts.awards(
id int auto_increment primary key not null,
award_provider_id int not null,
award_category_id int not null,
movies_id int not null,
film_crew_id int not null,
awarded_on year not null,
foreign key (award_provider_id) references byts.awards_providers(id) on update cascade, 
foreign key (award_provider_id) references byts.awards_providers(id) on delete cascade,
foreign key (award_category_id) references byts.film_categories(id) on update cascade, 
foreign key (award_category_id) references byts.film_categories(id) on delete cascade,
foreign key (movies_id) references byts.movies(id) on update cascade, 
foreign key (movies_id) references byts.movies(id) on delete cascade,
foreign key (film_crew_id) references byts.film_crew(id) on update cascade, 
foreign key (film_crew_id) references byts.film_crew(id) on delete cascade

)default character set=utf8mb4 collate =utf8mb4_0900_ai_ci;


-- listing the all tables
show tables ;-- show table refers to 
-- describe the table structure
desc movies ; -- describle refers to describle the 


-- adding a new column
alter table byts.awards add column last_modified_on timestamp default current_timestamp after id ;-- alter refers to alter the table and now we add another column on the table 
-- after is refer to which column we add to the table for example in awards table id is first no we add next to the id column


-- modify existing column
alter table byts.awards modify column awarded_on varchar(4) not null;-- in this query we modify the datatypes on the table  and not null is must

-- rename a column
alter table byts.awards  change last_modified_on lasted_modified timestamp default current_timestamp;

-- delete a column
alter table byts.awards drop column lasted_modified;


-- delete a table
drop table if exists byts.awards; 
 -- now ddl command
 
 
 -- single insert data into the table 
 insert into byts.film_categories(name)values("Best Actor");
 
 
 -- multiple insert
 
 insert into byts.film_categories(name) values("Best Actress"),("Director"),("Music"),("Best Film ");
 
 
 insert into byts.awards_providers(name) values("Oscar"),("National Award"),("Film Fare"),("Nandi");
 
 
 create table if not exists byts.tests(
 id int auto_increment primary key not null,
name varchar(250) not null
 )default character set=utf8mb4 collate =utf8mb4_0900_ai_ci;
   
   
 -- select insert 

insert into byts.tests(name) select name from byts.awards_providers order by id;



-- insert ignore 

insert ignore into byts.awards_providers(id,name) values (1,"Oscar");


-- insert on dulipcate key
insert into byts.awards_providers(id,name) values (1,"Oscar") on  duplicate key update name ="Oscar";

-- replace a row
replace into byts.awards_providers(id,name) values (1,"Oscar");


-- insert from a file 

load data infile "<path-of the file>" into table byts.awards_providers;


-- get into from database

select @@version;
select version();
select 2;-- select doesn't have brain so whatever you type in select column should display the value

-- to get all information from a table * will define all 
select*from byts.awards_providers;

select 2+3;


-- get selected columns from table 
select name  from byts.awards_providers;

-- condition based select 
select id ,name from byts.awards_providers where id =2;


-- get custom column(alias) name

select id, name as byts_awards_provider_name from byts.awards_providers where id = 2;


alter table byts.movies modify column director int not null;
 alter table byts.movies add constraint fk_movies_crew foreign key (director) references byts.film_crew(id) on update cascade on delete cascade;




INSERT INTO byts.movies (title, cast, director, released_on, rating) VALUES
('Baahubali: The Beginning', 'Prabhas, Rana Daggubati, Anushka Shetty, Tamannaah', 'S. S. Rajamouli', 2015, 8.80),
('Vikram', 'Kamal Haasan, Vijay Sethupathi, Fahadh Faasil', 'Lokesh Kanagaraj', 2022, 9.10),
('Asuran', 'Dhanush, Manju Warrier, Ken Karunas', 'Vetrimaaran', 2019, 8.70),
('Kaithi', 'Karthi, Narain, Arjun Das', 'Lokesh Kanagaraj', 2019, 8.50),
('Pariyerum Perumal', 'Kathir, Anandhi, Yogi Babu', 'Mari Selvaraj', 2018, 8.90);



INSERT INTO byts.film_categories (name) VALUES
('Actor'),
('Actress'),
('Director'),
('Music Director'),
('Cinematographer');


INSERT INTO byts.awards_providers (name) VALUES
('Filmfare Awards South'),
('Vijay Awards'),
('National Film Awards'),
('SIIMA Awards'),
('Tamil Nadu State Film Awards');

INSERT INTO byts.film_crew (name, category_id) VALUES
('Prabhas', 1),
('Anushka Shetty', 2),
('S. S. Rajamouli', 3),
('Anirudh Ravichander', 4),
('R. Rathnavelu', 5),
('Kamal Haasan', 1),
('Vijay Sethupathi', 1),
('Lokesh Kanagaraj', 3),
('Dhanush', 1),
('Vetrimaaran', 3);

INSERT INTO byts.awards (award_provider_id, award_category_id, movies_id, film_crew_id, awarded_on) VALUES
(3, 1, 3, 9, 2020),   -- Dhanush won Best Actor for Asuran (National Award)
(1, 3, 1, 3, 2016),   -- Rajamouli won Best Director for Baahubali (Filmfare South)
(2, 1, 2, 6, 2022),   -- Kamal Haasan won Best Actor for Vikram (Vijay Awards)
(4, 2, 1, 2, 2015),   -- Anushka Shetty won Best Actress for Baahubali (SIIMA)
(5, 3, 5, 10, 2019);  -- Vetrimaaran won Best Director for Asuran (TN State Award)
-- getting info with expression
select id,title,released_on,(rating+0.2) as rating from byts.movies ;
-- filtering rows based on the condition

select * from byts.movies where rating >= 8.0;

-- filtering based on the range
select *from byts.movies where rating between 8.0 and 9.0;
select * from byts.movies where rating >= 8.0 and rating<=9.0;

-- filtering based on the custom  range/matching values

select *from byts.movies where id in (1,3,5);

-- filtering based on the pattern
select*from byts.movies where title like "k%";



-- Sorting 
select*from byts.movies  order by title,released_on asc;

-- limit rows(top lowerr selection)
select*from byts.movies  order by rating desc limit 3;

-- Aggregate function : sum(),count(),avg(),min(),max()

select count(*)from byts.movies;
-- to get year wise movies count

select released_on , count(released_on) from  byts.movies group by released_on ;

use byts;
-- get movies with awards (inner join)
-- get all awards given for movies (left join)
-- get all movies and if any  awards give(right join)
-- get awards with out movie info(outer join)
select a.id ,a.award_provider_id, a.award_category_id, a.movies_id,b.title, a.film_crew_id, a.awarded_on from 
(select id ,award_provider_id, award_category_id, movies_id, film_crew_id, awarded_on from byts.awards)a 
left join
(select id ,title,rating from byts.movies)b on a.movies_id=b.id ;


-- to get all movies and award count

select a.title,count(b.movies_id) as awarded_count from
(select id,title,rating from byts.movies)a
left join
(select  id ,award_provider_id, award_category_id, movies_id, film_crew_id, awarded_on from byts.awards)b
on a.id=b.movies_id group by a.id;
-- nested joins (to get award info)

select g.id, g.award_provider_id, g.provider_name, g.award_category_id, g.name, g movies_id, g.title, g.film_crew_id, h.recieved_by, g.awarded_on from(select e.id, e.award_provider_id, f.provider_name, e.award_category_id, e.name, e.movies_id,
(select c.id, c.award_provider_id, c.award_category_id, d.name, c.movies_id, c.title, c.film_crew_id,e.title, e.film_crew_id, e.awarded_on from c.awarded_on 
from
(select a.id, a.award_provider_id, a.award_category_id, a.movies_id, b.title, a.film_crew_id,
a.awarded_on from
(select id, award_provider_id, award_category_id, movies_id, film_crew_id, awarded_on
from byts.awards)a 
inner join
(select id, title, rating from byts.movies)b on a.movies_id = b.id)c
inner join 
(select id, name from byts.film_categories)d on c.award_category_id = d.id)e
inner join
(select id, name as provider_name from byts.awards_provider)f on e.award provider_id = f.id)g
inner join(select id, name as recieved_by from byts.film_crew)h on g.film_crew_id = h.id;


-- String function

select concat(title,released_on,rating) from byts.movies ;
-- concate with spread by 
select concat_ws("-",title,released_on,rating) from byts.movies;
-- no of charcter in string
select title ,length(title) ,char_length(title),character_length(title) from byts.movies;
-- to get first 4 characters from sub string 
select substr(title,4) from byts.movies;
-- replace a string 
select replace("Samantha is married ","married ","not married");
-- trim is used for end of the space 
select trim( "samantha  is married");
-- left trim is used for starting of the string
select ltrim( "samantha  is married");
-- right trim is used for starting of the string
select rtrim( "samantha  is married");
-- reverse or palindrom and nested function will be allowed
select reverse(lcase("Mada")); 
select reverse(lower("Mada")); 
select reverse(ucase("Mada")); 
select reverse(upper("Mada")); 
-- last four letter will be show for right  and first four letter will show on left
select right("Madam",4); 
select left("Madam",4); 

-- Date and Time function
 select now(); -- to get current time stamp
 select curdate(); -- to get current date
 select curtime(); -- to get current time
 select day(curdate()); -- to get current day
 select week(curdate()); -- to get current week number
 select month(curdate()); -- to get current month
 select year(curdate()); -- to get crrent year
 -- to add days to a date
select curdate(), date_add(curdate(), INTERVAL 30 DAY);
-- to get difference between dates
select curdate(), datedif(curdate(), date_add(curdate(), INTERVAL 30 DAY));

select curdate(); -- yyyy-m-dd 
-- Date and Time Formatting
%Y - 2025 -> year
%y - 25 -> short hand year
%M - December -> month
%m - 12 (range: 01-12) -> month
%b - dec -> month
%d - 26 (range: 01 -31) -> date
%e - 26 (range: 1 - 31) -> date
%H - 11 (range: 00 - 23) -> 24-hour format
%h - 11 (range: 00 - 12) -> 12-hour format
%i - 16 (range: 00 - 59) -> minutes
%s - 16 (range: 0 - 59) -> seconds
%p - A.M (range: A.M /P.M)
%W - Friday -> day of a week
%a - Fri -> (short hand day of a week)
-- 26 December 2025
select date_format(curdate(), %d %M %Y);
 
 -- DBMS user/prievilege management
 create user 'attendance'@'localhost' identified by 'Duck@!4#';
 
-- granting access to user
grant select,insert,update on byts.awards_providers to 'attendance'@'localhost';

-- grant access to user for all tables in a database
grant select,insert,update on byts.* to 'attendance'@'localhost'; 

-- grant access to user for all tables in all databases
grant select,insert,update on *.* to 'attendance'@'localhost'; 

-- grant full access to user for all tables in all databases
grant * on *.* to 'attendance'@'localhost'; 

-- to list all the access permissions of a user
show grants for 'attendance'@'localhost';

-- revoking access
revoke all privileges on *.* to 'attendance'@'localhost';

-- Normalization(1NF, 2NF, 3NF, ...)

-- before normalization (a customer order information)
create table if not exists byts.orders(
id int auto_increment primary key not null,
product_id varchar(250) not null,
amount decimal (4,2) not null,
address text not null,
customer_name varchar(250) not null,
customer_id int not null,
contact_number varchar(10) not null 
)default character set = utf8mb4 collate = utf8mb4_0900_ai_ci;

-- After 3NF
create table if not exists byts.orders(
	id int auto_increment primary key not null,
    customer_id int not null,
    amount decimal (4,2) not null,
    address_id int not null -- byts.customer_address
);

create table if not exists byts.order_products(
	order_id int not null,
    product_id int not null,
    quantity int not null
);

create table if not exists byts.customers(
	customer_id int auto_increment primary key not null,
	customer_name varchar(250) not null,
    contact_number varchar(10) not null
);

create table if not exists byts.customer_address(
	id int auto_increment primary key not null,
	customer_id int auto_increment primary key not null,
    address text not null
);








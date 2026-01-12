-- mysql version
select @@version;
-- Database Operations
-- deleting a database
drop database if exists icici; 
-- database creation
create database if not exists icici character set = utf8mb4 
collate utf8mb4_0900_ai_ci;
-- to list databases in the server
show databases;
-- selecting a database
use icici;
-- table creation
create table if not exists icici.customer(
	customer_id int not null auto_increment primary key,
    name varchar(250) not null,
	account_number int not null unique,
    ifsc char(11) not null,
    balance decimal(10, 2) not null,
    address text not null,
    phone_number varchar(10) not null,
    email varchar(250) null,
    check (balance >= 0) -- validation
)character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists icici.customer_login(
	customer_id int not null unique, -- one to one relation with icici.customer
    user_name varchar(250) not null unique, -- admin
    password varchar(250) not null, -- Demo@!4#
    -- constraints
    foreign key(customer_id) references icici.customer(customer_id) 
    on update cascade on delete restrict
)character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists icici.transaction_type(
	id int not null auto_increment primary key,
    name varchar(10) not null
)character set = utf8mb4 collate utf8mb4_0900_ai_ci;

create table if not exists icici.customer_transaction(
    transaction_id int not null auto_increment primary key,
    customer_id int not null,
    amount decimal(10, 2) not null,
    transaction_type int not null,
    transacted_on timestamp default current_timestamp not null,
    comments text null,
    -- constraints
    constraint customer_transaction_type_fk foreign key(transaction_type) references
    icici.transaction_type(id) on update cascade on delete restrict,
    constraint customer_transaction_customer_id_fk foreign key(customer_id) references
    icici.customer(customer_id) on update cascade on delete restrict,
    unique key customer_transaction_customer_id_uk (transaction_id, customer_id)
)character set = utf8mb4 collate utf8mb4_0900_ai_ci;

-- to list all tables in a database
show tables;

-- description of a table
desc table icici.customer;

-- adding a new column to table
alter table icici.customer add column created_on timestamp 
default current_timestamp not null;

-- modifying existing column (changing data type)
alter table icici.customer_login modify column password text not null;

-- renaming a column
alter table icici.customer_transaction change comments info text null;

-- deleteing a column
alter table icici.customer_transaction drop column info;

-- deleting a table
-- drop table if exists icici.customer_transaction;

-- insert data in to table 
-- insert into icici.transaction_type values (1, "Deposit");
-- insert into icici.transaction_type (name) values ("Withdrawl");

-- insert multiple rows in to a table
insert into icici.transaction_type (name) values ("Withdrawl"), ("Deposit");

insert into icici.customer 
(name, account_number, ifsc, balance, address, phone_number, email) values
("Samantha", 8949848, "ICIC00056", 6584156.65, "Chennai", "9012345678", "sam@143.com"),
("Gokul", 8949949, "ICIC00056", 64584156.65, "Coimbatore", "8012345679", "gokul@341.com"),
("Aslam", 8949950, "ICIC00057", 984814.65, "Erode", "7012345680", "aslam@241.com"),
("Ranjith", 8949952, "ICIC00067", 68468.65, "Salem", "6912345680", "ranjith@142.com");

create table if not exists icici.customer_test(
	customer_id int not null auto_increment primary key,
	account_number int not null unique,
    ifsc char(11) not null
);

-- select insert
insert into icici.customer_test select customer_id, account_number, ifsc 
	from icici.customer;

-- insert with duplicate key check
-- insert ignore into icici.transaction_type values (3, "Deposit");

-- update on duplicate key insert
-- insert into icici.transaction_type values (3, "Invalid") on duplicate key update name = "Invalid";

-- replace a row
-- replace into icici.transaction_type values (3, "Invalid");

-- insert data from a file
-- load data infile "<path-to-file>" into table icici.transaction_type;

insert into icici.customer_login values 
(1, "samantha", md5("Demo@!4#")),
(2, "gokul", md5("Demo@!4#"));

insert into icici.customer_transaction 
(customer_id, amount, transaction_type) values 
(1, 2345, 1),
(1, 345, 1),
(1, 45678, 2),
(2, 2345, 2);

-- selecting constants
select 2; -- returns a table with column 2 and value 2
select "samantha"; -- returns a table with column samantha and value samantha
select 2 + 3; -- returns a table with column 2+3 and value 5

-- selecting data from tables
select * from icici.customer;  -- to get all columns and rows
select customer_id, name, balance from icici.customer; -- to get selected columns 

-- get accounts balance > 6584150 (filtering rows)
select customer_id, name, balance from icici.customer where balance >= 6584150;

-- get customer info for name starting with 'S' (filtering rows)
select customer_id, name, balance from icici.customer where name like 'S%';

-- get customer with highest balance
select customer_id, name from icici.customer order by balance desc LIMIT 1;

-- get customer with second highest balance
select customer_id, name from icici.customer order by balance desc LIMIT 1 OFFSET 1;
select customer_id, name from icici.customer order by balance desc LIMIT 1, 1;

-- get number of customers each bank branch have
select ifsc, count(ifsc) as customer_count from icici.customer group by ifsc;

-- get name, account number of the customer after login authentication
select a.customer_id, b.name, b.account_number from 
(select customer_id, user_name, password from icici.customer_login where 
user_name = "samantha" and password = md5("Demo@!4#"))a
LEFT JOIN
(select customer_id, name, account_number from icici.customer)b
ON a.customer_id = b.customer_id;

-- (or)

select a.customer_id, b.name, b.account_number from 
(select customer_id, user_name, password from icici.customer_login where 
user_name = "samantha" and password = md5("Demo@!4#"))a
inner join
icici.customer b
ON a.customer_id = b.customer_id;

-- list of all customers along with login information
select a.customer_id, a.name, a.account_number, b.user_name, b.password from 
icici.customer a
left join
icici.customer_login b
ON a.customer_id = b.customer_id;

-- get customers who have login credentials
select a.customer_id, a.name, a.account_number, b.user_name, b.password from 
icici.customer a
inner join
icici.customer_login b
ON a.customer_id = b.customer_id;

-- get transaction details of all customers
select a.customer_id, a.name, a.account_number, b.transaction_id, b.amount, 
b.transaction_type, b.transacted_on from
icici.customer a
left join
icici.customer_transaction b
ON a.customer_id = b.customer_id;

-- get transaction details of a customer along with name of transaction type
select b.transacted_on, b.transaction_type, c.name, b.amount from 
(select customer_id, name from icici.customer where customer_id = 1) a
inner join
icici.customer_transaction b
on a.customer_id = b.customer_id
inner join 
icici.transaction_type c
on b.transaction_type = c.id;

-- get all deposits made by customers
select a.customer_id, a.name, a.account_number, b.transaction_id, b.amount, 
b.transaction_type, b.transacted_on from
icici.customer a
inner join
(select customer_id, transaction_id,amount,transaction_type, transacted_on from 
 icici.customer_transaction where transaction_type = 2) b
on a.customer_id = b.customer_id;

-- Aggregate functions (sum(),count(), max(), min(),...)

-- get total amount deposited in the bank
select sum(amount) as total_amount from icici.customer_transaction 
where transaction_type = 2;

-- find total amount available in the bank
select sum(balance) as bank_balance from icici.customer;

-- find average customer balance
select avg(balance) as bank_avg_balance from icici.customer;

-- customer with lowest balance in the bank (Sub queries)
select name, balance from icici.customer where 
balance = (select min(balance) from icici.customer);

-- find highest and lowest balance in the bank (aggregated functions can be nested)
select min(balance), max(balance) from icici.customer;

-- find total number of customers in the bank
select count(balance) from icici.customer;

-- find total amount available in each branch of a bank
select ifsc, sum(balance) as bank_balance from icici.customer group by ifsc;

-- find number of transactions a customer has done
select customer_id, count(customer_id) from icici.customer_transaction 
group by customer_id;

-- find branches having more than one customer
select ifsc, count(ifsc) from icici.customer group by ifsc having count(ifsc) > 1;

-- find customers whose total transaction amount is more than 10,000
select a.customer_id, a.name, sum(b.amount) as total_amount from
icici.customer a
inner join
icici.customer_transaction b
on a.customer_id = b.customer_id 
group by a.customer_id having total_amount >= 10000;

-- String functions
select concat("samantha", "sairam"); -- to append a string
select concat_ws("@", "samantha", "sairam"); -- to append a string with seperator
-- to get number of characters in a string
select length("samantha"), char_length("samantha"), character_length("samantha");
-- to get first few characters
select left("samantha", 3);
-- to get last few characters
select right("samantha", 3);
-- to get substring
select substr("samantha", 0, 2);
-- to remove head spaces
select ltrim(" samantha sairam ");
-- to remove tail spaces
select rtrim(" samantha sairam ");
-- to remove space at any part of string
select trim(" samantha sairam ");
-- string in reverse order
select reverse("Malayalam");
-- lower case conversion (functions can be nested)
select reverse(lcase("Malayalam")), reverse(lower("Malayalam"));
-- upper case conversion
select ucase("Malayalam"), upper("Malayalam");
-- replace a substring
select replace("samatha is married", "married", "re-married");

-- Date & Time functions
select now(); -- to get current date along with time
select curdate(); -- to get current date
select curtime(); -- to get current time
select day(curdate()); -- to get current day
select month(curdate()); -- to get current month
select year(curdate()); -- to get current year
select week(curdate()); -- to get week number in a year
-- to add days to a date
select curdate() as joining_date, 
date_add(curdate(), INTERVAL 30 DAY) as expiry_date;
-- difference between two dates
select datedif(curdate(), date_add(curdate(), INTERVAL 30 DAY)) as expiry_date;
-- to get date in (dd-mm-yyyy)
select concat_ws("-", day(curdate()), month(curdate()), year(curdate()));
select date_format(curdate(), "%d-%M-%Y"); -- 12-January-2026
select date_format(curdate(), "%d-%M-%Y %W %p"); -- 12-January-2026 Monday P.M

-- first day of a month
select date_sub(curdate(), INTERVAL DAY(curdate())-1 DAY);
-- last day of a month
select last_day(curdate());
















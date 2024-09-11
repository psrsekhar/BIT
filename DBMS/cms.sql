CREATE DATABASE IF NOT EXISTS cms;
USE cms;
SHOW databases;

CREATE TABLE IF NOT EXISTS cms.student(
	id INT,
    name varchar(100),
    email varchar(255),
    gender varchar(10)
);

show tables;

ALTER TABLE cms.student ADD COLUMN address text; 
DESCRIBE cms.student;

ALTER TABLE cms.student ADD PRIMARY KEY (id);

ALTER TABLE cms.student ADD COLUMN added_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP;

ALTER TABLE cms.student DROP PRIMARY KEY;

ALTER TABLE cms.student MODIFY COLUMN id INT AUTO_INCREMENT, ADD PRIMARY KEY (id);

ALTER TABLE cms.student ADD COLUMN department varchar(20); 
 
DESCRIBE cms.student;

INSERT INTO cms.student (name, email, gender, address, department) 
VALUES ("samantha", "sam@gmail.com", "female", "Privacy", "Rocket Science");

INSERT INTO cms.student VALUES 
(2, "sairam", "sai@gmail.com", "male", "Privacy", current_timestamp(),
"Rocket Science");

DROP TABLE cms.student;

-- RENAME added in MYSQL 5.1.7 and removed in 5.1.23
-- RENAME DATABASE cms TO college; 
DROP DATABASE cms;
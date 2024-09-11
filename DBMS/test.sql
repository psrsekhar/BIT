CREATE TABLE IF NOT EXISTS cms.department(
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name varchar(100) NOT NULL,
    description text
);

CREATE TABLE IF NOT EXISTS cms.student(
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name varchar(100) NOT NULL,
    email varchar(255) NOT NULL,
    gender varchar(10) NULL,
    department_id INT NOT NULL,
    address text NOT NULL,
    added_on timestamp default current_timestamp
);

ALTER TABLE cms.student MODIFY COLUMN department_id INT, 
ADD CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES department(id)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE cms.student MODIFY COLUMN gender ENUM('male', 'female', 'others');

INSERT INTO cms.department (name, description) VALUES 
("Rocket Science", "Research"),
("CE", "B.E"),
("ME", "B.E"),
("EIE", "B.E"),
("ECE", "B.Tech"),
("CSE", "B.Tech"),
("AIML", "B.Tech"),
("DS", "B.Tech");

INSERT INTO cms.student (name, email, gender, address, department_id) VALUES 
("samantha", "sam@gmail.com", "female", "Privacy", 1),
("sairam", "sai@gmail.com", "male", "Privacy", 1);

INSERT INTO cms.student (name, email, gender, address, department_id) VALUES 
("def", "def@gmail.com", "1234567890", "Privacy", 3);


select * from cms.student;

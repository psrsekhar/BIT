# MySQL Interview Questions and Answers

A collection of important **MySQL interview questions and answers** for quick revision and preparation.

---

## 1. What is MySQL?

MySQL is an **open-source relational database management system (RDBMS)** that uses **SQL (Structured Query Language)** to store, manage, and retrieve data. It is widely used due to its **performance, scalability, reliability, and ease of integration** with applications.

---

## 2. What are the different types of JOINs in MySQL?

- **INNER JOIN**: Returns rows with matching values in both tables.
- **LEFT (OUTER) JOIN**: Returns all rows from the left table and matched rows from the right.
- **RIGHT (OUTER) JOIN**: Returns all rows from the right table and matched rows from the left.
- **FULL OUTER JOIN**: Not directly supported in MySQL but can be achieved using `UNION`.

---

## 3. What is the difference between WHERE and HAVING clauses?

- **WHERE**: Filters rows **before grouping**.
- **HAVING**: Filters groups/aggregates **after grouping**.

---

## 4. What is a Primary Key in MySQL?
 
A Primary Key is a column (or set of columns) that uniquely identifies each record in a table.

- Must contain **unique values**.
- Cannot contain **NULL**.
- Each table can have only **one** primary key.

---

## 5. What is a Foreign Key in MySQL?

A Foreign Key is a field in one table that refers to the **Primary Key** in another table. It maintains **referential integrity** between tables.

---

## 6. Difference between CHAR and VARCHAR

- **CHAR**: Fixed-length storage. Pads with spaces if data is shorter. Faster for fixed-size data.
- **VARCHAR**: Variable-length storage. Saves only required characters. More memory efficient.

---

## 7. Difference between DELETE, TRUNCATE, and DROP

- **DELETE**: Removes rows based on condition, can be rolled back.
- **TRUNCATE**: Removes all rows, resets AUTO_INCREMENT, cannot usually be rolled back.
- **DROP**: Removes the entire table including structure. Permanent.

---

## 8. What are Indexes in MySQL?

Indexes are database objects that improve **query performance** by allowing faster lookups. Best used on columns in **WHERE, JOIN, ORDER BY, GROUP BY** clauses.

---

## 9. What is a Transaction in MySQL?

A Transaction is a sequence of operations executed as a single logical unit.  
It follows **ACID** properties:

- **Atomicity** – All or nothing
- **Consistency** – Valid state maintained
- **Isolation** – Independent transactions
- **Durability** – Changes persist after commit

---

## 10. What is Normalization?

Normalization is the process of structuring data to remove redundancy and improve integrity.  
Common forms: **1NF, 2NF, 3NF, BCNF**.

---

## 11. What is Denormalization?

Denormalization combines tables to reduce joins and improve read performance. Increases redundancy intentionally for **faster queries**.

---

## 12. What are Aggregate Functions in MySQL?

- `COUNT()` – Number of rows
- `SUM()` – Adds values
- `AVG()` – Average value
- `MIN()` – Minimum value
- `MAX()` – Maximum value

---

## 13. Difference between GROUP BY and ORDER BY

- **GROUP BY**: Groups rows with identical values, used with aggregate functions.
- **ORDER BY**: Sorts query results (ascending or descending).

---

## 14. AUTO_INCREMENT Attribute

Automatically generates a sequential number for new records (commonly used with **Primary Keys**).

---

## 15. UNION vs UNION ALL

- **UNION**: Combines results and removes duplicate rows.
- **UNION ALL**: Combines results but **keeps duplicates**.

---

## 16. Retrieve Current Date in MySQL

```sql
SELECT CURDATE(); -- Returns current date
SELECT NOW();     -- Returns current date & time
```

---

## 17. Difference between IN and EXISTS

- **IN**: Checks if a value exists in a given list or subquery result.
- **EXISTS**: Checks if the subquery returns any rows (more efficient for large datasets).

---

## 18. How do you create a table in MySQL?

```sql
CREATE TABLE student (
  rollNo INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  marks INT
);
```

---

## 19. TRIGGER vs STORED PROCEDURE

- **TRIGGER**: Automatically invoked on specific table events (INSERT, UPDATE, DELETE).
- **STORED PROCEDURE**: Reusable code block, executes only when explicitly called.

---

## 20. Handling NULL Values in MySQL

- Use **IS NULL / IS NOT NULL** to check.
- **IFNULL(expr, default)** replaces NULLs with default.
- **COALESCE(expr1, expr2, …)** returns first non-null value.

---

## 21. What is a View in MySQL?

A **View** is a **virtual table** based on the result of a query.

- Does not store data itself.
- Provides abstraction, simplifies queries, improves security by exposing subsets of data.

---

## ✅ Summary

This file covers:

- Basic definitions
- Keys (Primary, Foreign)
- Joins, Aggregate functions, Transactions
- Normalization vs Denormalization
- Queries, Indexes, Views, Procedures

# 💡 SQL Interview Questions & Answers (50 Qs)

A comprehensive list of the **Top 50 MySQL SQL Interview Questions & Answers**.  
This covers **basic, intermediate, and advanced** queries frequently asked in technical interviews.  

---

## 🔹 Section 1: Basic SQL Queries (1–15)

### 1. Select all records from a table

```sql
SELECT * FROM employees;
```

---

### 2. Fetch only unique department IDs from employees

```sql
SELECT DISTINCT dept_id FROM employees;
```

---

### 3. Get the number of employees in the table

```sql
SELECT COUNT(*) FROM employees;
```

---

### 4. Fetch employee names and salaries

```sql
SELECT emp_name, salary FROM employees;
```

---

### 5. Retrieve employees earning more than 50,000

```sql
SELECT * FROM employees WHERE salary > 50000;
```

---

### 6. Retrieve employees who joined after 2022-01-01

```sql
SELECT * FROM employees WHERE join_date > '2022-01-01';
```

---

### 7. Fetch employees whose names start with 'A'

```sql
SELECT * FROM employees WHERE emp_name LIKE 'A%';
```

---

### 8. Fetch employees whose names end with 'n'

```sql
SELECT * FROM employees WHERE emp_name LIKE '%n';
```

---

### 9. Sort employees by salary (descending)

```sql
SELECT * FROM employees ORDER BY salary DESC;
```

---

### 10. Sort employees by department, then by name

```sql
SELECT * FROM employees ORDER BY dept_id, emp_name;
```

---

### 11. Find employees with NULL manager_id

```sql
SELECT * FROM employees WHERE manager_id IS NULL;
```

---

### 12. Replace NULL manager_id with 'N/A'

```sql
SELECT emp_name, IFNULL(manager_id, 'N/A') AS manager FROM employees;
```

---

### 13. Fetch first 5 employees

```sql
SELECT * FROM employees LIMIT 5;
```

---

### 14. Fetch employees between salary 40,000 and 70,000

```sql
SELECT * FROM employees WHERE salary BETWEEN 40000 AND 70000;
```

---

### 15. Fetch employees in departments 1, 2, or 3

```sql
SELECT * FROM employees WHERE dept_id IN (1,2,3);
```

---

## 🔹 Section 2: Aggregate Functions & GROUP BY (16–25)

### 16. Get the total salary of employees

```sql
SELECT SUM(salary) AS total_salary FROM employees;
```

---

### 17. Get the average salary

```sql
SELECT AVG(salary) FROM employees;
```

---

### 18. Find minimum and maximum salaries

```sql
SELECT MIN(salary) AS min_salary, MAX(salary) AS max_salary FROM employees;
```

---

### 19. Count employees in each department

```sql
SELECT dept_id, COUNT(*) FROM employees GROUP BY dept_id;
```

---

### 20. Find average salary per department

```sql
SELECT dept_id, AVG(salary) FROM employees GROUP BY dept_id;
```

---

### 21. Departments with more than 5 employees

```sql
SELECT dept_id, COUNT(*)
FROM employees
GROUP BY dept_id
HAVING COUNT(*) > 5;
```

---

### 22. Total salary expense per department

```sql
SELECT dept_id, SUM(salary)
FROM employees
GROUP BY dept_id;
```

---

### 23. Department with highest average salary

```sql
SELECT dept_id, AVG(salary) AS avg_salary
FROM employees
GROUP BY dept_id
ORDER BY avg_salary DESC
LIMIT 1;
```

---

### 24. Employees earning above departmental average

```sql
SELECT emp_name, salary, dept_id
FROM employees e
WHERE salary > (
  SELECT AVG(salary) FROM employees WHERE dept_id = e.dept_id
);
```

---

### 25. Employees with duplicate salaries

```sql
SELECT salary, COUNT(*)
FROM employees
GROUP BY salary
HAVING COUNT(*) > 1;
```

---

## 🔹 Section 3: Joins Queries (26–35)

### 26. Inner join employees with departments

```sql
SELECT e.emp_name, d.dept_name
FROM employees e
INNER JOIN departments d ON e.dept_id = d.dept_id;
```

---

### 27. Left join employees with departments

```sql
SELECT e.emp_name, d.dept_name
FROM employees e
LEFT JOIN departments d ON e.dept_id = d.dept_id;
```

---

### 28. Right join employees with departments

```sql
SELECT e.emp_name, d.dept_name
FROM employees e
RIGHT JOIN departments d ON e.dept_id = d.dept_id;
```

---

### 29. Full outer join (using UNION)

```sql
SELECT e.emp_name, d.dept_name
FROM employees e
LEFT JOIN departments d ON e.dept_id = d.dept_id
UNION
SELECT e.emp_name, d.dept_name
FROM employees e
RIGHT JOIN departments d ON e.dept_id = d.dept_id;
```

---

### 30. Self join – fetch employee and their manager

```sql
SELECT e.emp_name AS Employee, m.emp_name AS Manager
FROM employees e
LEFT JOIN employees m ON e.manager_id = m.emp_id;
```

---

### 31. Find employees working in 'Sales'

```sql
SELECT e.emp_name
FROM employees e
JOIN departments d ON e.dept_id = d.dept_id
WHERE d.dept_name = 'Sales';
```

---

### 32. Employees without departments

```sql
SELECT e.emp_name
FROM employees e
LEFT JOIN departments d ON e.dept_id = d.dept_id
WHERE d.dept_id IS NULL;
```

---

### 33. Employees with department and manager details

```sql
SELECT e.emp_name, d.dept_name, m.emp_name AS Manager
FROM employees e
JOIN departments d ON e.dept_id = d.dept_id
LEFT JOIN employees m ON e.manager_id = m.emp_id;
```

---

### 34. Highest salary in each department (using join)

```sql
SELECT d.dept_name, MAX(e.salary) AS max_salary
FROM employees e
JOIN departments d ON e.dept_id = d.dept_id
GROUP BY d.dept_name;
```

---

### 35. Department with no employees

```sql
SELECT d.dept_name
FROM departments d
LEFT JOIN employees e ON d.dept_id = e.dept_id
WHERE e.emp_id IS NULL;
```

---

## 🔹 Section 4: Advanced Queries (36–50)

### 36. Find the second highest salary

```sql
SELECT MAX(salary)
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);
```

---

### 37. Nth highest salary

```sql
SELECT DISTINCT salary
FROM employees e1
WHERE N-1 = (
  SELECT COUNT(DISTINCT salary)
  FROM employees e2
  WHERE e2.salary > e1.salary
);
```

---

### 38. Top 5 highest paid employees

```sql
SELECT emp_name, salary
FROM employees
ORDER BY salary DESC
LIMIT 5;
```

---

### 39. Third and fourth highest salaries

```sql
SELECT DISTINCT salary
FROM employees
ORDER BY salary DESC
LIMIT 2,2;  -- Skip first two, fetch next two
```

---

### 40. Employees with salaries between top 10% and 20%

```sql
SELECT emp_name, salary
FROM employees
ORDER BY salary DESC
LIMIT 10 OFFSET 10;
```

---

### 41. Employees who joined in the last 30 days

```sql
SELECT *
FROM employees
WHERE join_date >= CURDATE() - INTERVAL 30 DAY;
```

---

### 42. Employees hired in current year

```sql
SELECT *
FROM employees
WHERE YEAR(join_date) = YEAR(CURDATE());
```

---

### 43. Swap genders 'M' and 'F'

```sql
UPDATE employees
SET gender = CASE
  WHEN gender = 'M' THEN 'F'
  WHEN gender = 'F' THEN 'M'
END;
```

---

### 44. Delete employees with no department

```sql
DELETE FROM employees WHERE dept_id IS NULL;
```

---

### 45. Increase salary by 10% for Sales department

```sql
UPDATE employees
SET salary = salary * 1.10
WHERE dept_id = (SELECT dept_id FROM departments WHERE dept_name = 'Sales');
```

---

### 46. Retrieve employees with same salary but different departments

```sql
SELECT e1.emp_name, e1.salary, e1.dept_id
FROM employees e1
JOIN employees e2 ON e1.salary = e2.salary
AND e1.dept_id <> e2.dept_id;
```

---

### 47. Find department with maximum employees

```sql
SELECT dept_id, COUNT(*) AS total
FROM employees
GROUP BY dept_id
ORDER BY total DESC
LIMIT 1;
```

---

### 48. Find employees with salary greater than their manager’s salary

```sql
SELECT e.emp_name, e.salary, m.emp_name AS Manager, m.salary AS manager_salary
FROM employees e
JOIN employees m ON e.manager_id = m.emp_id
WHERE e.salary > m.salary;
```

---

### 49. Highest paid employee in company

```sql
SELECT emp_name, salary
FROM employees
ORDER BY salary DESC
LIMIT 1;
```

---

### 50. Lowest paid employee in each department

```sql
SELECT dept_id, emp_name, salary
FROM employees e
WHERE salary = (
  SELECT MIN(salary) FROM employees WHERE dept_id = e.dept_id
);
```

---

# ✅ Summary  

- **Basic Queries:** SELECT, WHERE, LIKE, LIMIT (1–15)  
- **Aggregate Functions:** COUNT, AVG, SUM, GROUP BY, HAVING (16–25)  
- **Joins:** INNER, LEFT, RIGHT, SELF JOIN (26–35)  
- **Advanced:** Ranking, Subqueries, Correlated queries, Updates (36–50)

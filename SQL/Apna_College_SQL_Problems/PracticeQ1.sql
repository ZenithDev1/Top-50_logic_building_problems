# lecture link: https://youtu.be/hlGoQC332VM?si=uYlJiYyh1xA3rha3
# TimeStamp for Question: 51:42

# Solution

CREATE DATABASE XYZ;

USE XYZ;

# Step 1: Create table
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(20),
    salary FLOAT
);

# Step 2: Add (insert) information into the table
INSERT INTO employee (id, name, salary) VALUES 
(1, 'adam', 25000),
(2, 'bob', 30000),
(3, 'casey', 40000);

# Step 3: Select & view all your table data
SELECT * FROM employee;
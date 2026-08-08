# lecture link: https://youtu.be/hlGoQC332VM?si=uYlJiYyh1xA3rha3
# TimeStamp for Question: 01:40:40

# Solution
CREATE DATABASE sqlLectProblems;

USE sqlLectProblems;

# Step 1: Create table
CREATE TABLE payment (
    customer_id INT PRIMARY KEY,
    customer VARCHAR(100),
    mode VARCHAR(50),
    city VARCHAR(50)
);


# Step 2: Add (insert) information into the table
INSERT INTO payment (customer_id, customer, mode, city) VALUES
(101, 'Olivia Barrett', 'Netbanking', 'Portland'),
(102, 'Ethan Sinclair', 'Credit Card', 'Miami'),
(103, 'Maya Hernandez', 'Credit Card', 'Seattle'),
(104, 'Liam Donovan', 'Netbanking', 'Denver'),
(105, 'Sophia Nguyen', 'Credit Card', 'New Orleans'),
(106, 'Caleb Foster', 'Debit Card', 'Minneapolis'),
(107, 'Ava Patel', 'Debit Card', 'Phoenix'),
(108, 'Lucas Carter', 'Netbanking', 'Boston'),
(109, 'Isabella Martinez', 'Netbanking', 'Nashville'),
(110, 'Jackson Brooks', 'Credit Card', 'Boston');


# Step 3: Select & view all your table data
SELECT mode AS Payment_Typpe, count(mode) AS Total_Count
FROM payment
group by mode;

# adding alias was my personal choice for better formatting
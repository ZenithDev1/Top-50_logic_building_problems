#Problem Link: https://leetcode.com/problems/second-highest-salary/description/?envType=study-plan-v2&envId=top-sql-50
#Difficulty Level: Medium

#Solution
SELECT (
    SELECT DISTINCT salary
    FROM (
        SELECT 
            salary,
            DENSE_RANK() OVER (ORDER BY salary DESC) as rnk
        FROM Employee
    ) AS RankedSalaries
    WHERE rnk = 2
) AS SecondHighestSalary;
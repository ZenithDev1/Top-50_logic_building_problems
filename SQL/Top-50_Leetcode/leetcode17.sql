#Problem Link: https://leetcode.com/problems/project-employees-i/description/?envType=study-plan-v2&envId=top-sql-50
#Difficulty Level: Easy

#Solution
SELECT 
    p.project_id, 
    ROUND(AVG(e.experience_years), 2) AS average_years
FROM 
    Project p
JOIN 
    Employee e 
    ON p.employee_id = e.employee_id
GROUP BY 
    p.project_id;
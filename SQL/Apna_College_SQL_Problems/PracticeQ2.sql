# lecture link: https://youtu.be/hlGoQC332VM?si=uYlJiYyh1xA3rha3
# TimeStamp for Question: 01:38

# Solution
SELECT city, avg(marks)
FROM student
GROUP BY city 
order by avg(marks) ASC;
# lecture link: https://youtu.be/hlGoQC332VM?si=uYlJiYyh1xA3rha3
# TimeStamp for Question: 01:43:39

#Solution
SELECT count(name), city FROM student
GROUP BY city
HAVING max(marks) > 90;
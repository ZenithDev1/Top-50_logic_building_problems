#Problem Link: https://leetcode.com/problems/confirmation-rate/submissions/2104530790/?envType=study-plan-v2&envId=top-sql-50
#Difficulty Level: Medium


#Solution:
select su.user_id, round(coalesce(avg(action='confirmed'), 0), 2) as confirmation_rate
from signups su
left join confirmations c
on su.user_id = c.user_id
group by su.user_id
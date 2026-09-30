#Problem Link: https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/?envType=study-plan-v2&envId=top-sql-50
#Difficulty Level: Medium


#Solution:
WITH myCTE AS(
    Select requester_id id from RequestAccepted
    UNION ALL
    Select accepter_id id from RequestAccepted
)
Select id , COUNT(*) as num
From myCTE
Group By id
Order By num Desc
LIMIT 1
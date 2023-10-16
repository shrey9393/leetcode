SELECT user_id,  max(time_stamp) AS last_stamp
FROM logins
where YEAR(time_stamp) = 2020
GROUP BY user_id;
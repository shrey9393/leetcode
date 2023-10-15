SELECT r.contest_id, round((COUNT(r.user_id) / (SELECT COUNT(*) FROM users) * 100),2) AS percentage
FROM register r
GROUP BY r.contest_id
ORDER BY percentage desc,r.contest_id;

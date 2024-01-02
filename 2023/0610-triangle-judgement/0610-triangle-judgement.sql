SELECT *,
       IF(x + y > z AND x + z > y and y+z>x, 'Yes', 'No') AS triangle
FROM triangle;

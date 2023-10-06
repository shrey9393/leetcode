SELECT c.name AS Customers
FROM customers c
LEFT JOIN orders o ON c.Id = o.customerId
WHERE o.customerId IS NULL;

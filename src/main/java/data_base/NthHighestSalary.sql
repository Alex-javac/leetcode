--Nth Highest Salary
CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
    RETURN QUERY (
        -- Write your PostgreSQL query statement below.
        select DISTINCT e.salary
        from Employee e
        order by e.salary desc
        limit 1 offset (CASE
                            WHEN $1>0 THEN $1-1
                            ELSE 100000
            END)
    );
END;
$$ LANGUAGE plpgsql;
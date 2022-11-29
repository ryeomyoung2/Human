-- SQL �������� ��������
-- ���� 1. 2015�� ��� �������� ���� ��� ������ ��ȸ�ϼ���.
-- ���̺�� : populations
SELECT
    *
FROM populations
WHERE life_expectancy > (SELECT AVG(life_expectancy) FROM populations WHERE year = 2015)
	  AND year = 2015;

-- ���� 2. subquery_countries ���̺� �ִ� capital�� 
-- ��Ī�Ǵ� cities ���̺��� ������ ��ȸ�ϼ���. 
-- ��ȸ�� �÷����� name, country_code, urbanarea_pop
SELECT name, country_code, urbanarea_pop
  FROM cities
WHERE name IN
  (SELECT capital
   FROM countries2)
ORDER BY urbanarea_pop DESC;

-- ���� 3. 
-- ���� 1. economies ���̺��� country code, inflation rate, unemployment rate�� ��ȸ�Ѵ�.
-- ���� 2. inflation rate ������������ �����Ѵ�.
-- ���� 3. subquery_countries ���̺� gov_form �÷����� Constitutional Monarchy �Ǵ� `Republic`�� �� ������ �����Ѵ�.
-- Select fields
-- �����ͼ�
SELECT code, inflation_rate, unemployment_rate
FROM economies
  WHERE year = 2015 AND code NOT IN
  	(SELECT code
  	 FROM countries2
  	 WHERE (GOV_FORM = 'Constitutional Monarchy' OR GOV_FORM LIKE '%Republic%'))
ORDER BY inflation_rate;

-- ���� 4. 2010�� �� ����� inflation_rate�� ���� ���� ������ inflation_rate�� ���ϼ���. 
-- ��Ʈ 1. �Ʒ� ���� ����
SELECT name, continent, inflation_rate
  FROM countries2 
  	INNER JOIN economies
    USING (code)
WHERE year = 2010;
SELECT * FROM countries2;

-- �� ����� inflation_rate�� ���� ���� ���� �����ϴ� �ڵ带 �ۼ��Ѵ�. 
SELECT sc.country_name, sc.continent, ec.inflation_rate
  FROM countries2 sc
	INNER JOIN economies ec
	ON sc.code = ec.code
  WHERE year = 2015
    AND inflation_rate IN (
        SELECT MAX(inflation_rate) AS max_inf
        FROM (
             SELECT sc.country_name, sc.continent, ec.inflation_rate
             FROM countries2 sc
             INNER JOIN economies ec
             -- Using(code) ��� ON ������ �ۼ��մϴ�.
             ON sc.code = ec.code
             WHERE year = 2015)
        GROUP BY continent);

-- SQL ������ �Լ� ��������
-- ���� 1. �� �࿡ ���ڸ� 1, 2, 3, ..., ���·� �߰��Ѵ�. (row_n ���� ǥ��)
-- row_n �������� ������������ ���
-- ���̺�� alias�� �����Ѵ�. 
SELECT 
    ROWNUM as row_n
    , sm.*
FROM summer_medals sm;

-- ���� 2. �ø��� �⵵�� �������� ������� �ۼ��� �Ѵ�. 
-- ��Ʈ : ���������� ������ �Լ��� �̿��Ѵ�. 
SELECT 
    Year, 
    ROW_NUMBER() OVER(ORDER BY Year) AS Row_N
FROM (
    SELECT DISTINCT Year
    FROM summer_medals
) Years;

-- ���� 3. 
-- (1) WITH �� ����Ͽ� �� ��������� ȹ���� �޴� ������ ������������ �����ϵ��� �մϴ�. 
-- (2) (1) ������ Ȱ���Ͽ� �׸��� �������� ��ŷ�� �߰��Ѵ�. 
-- ���� 5���� ���� : OFFSET 0 ROWS FETCH NEXT 5 ROWS ONLY
-- WITH AS (1�� ����)
-- 2�� ����

WITH medals AS (
  SELECT
    Athlete,
    COUNT(*) AS Medals
  FROM summer_medals
  GROUP BY Athlete)

SELECT
  Medals, 
  Athlete,
  ROW_NUMBER() OVER (ORDER BY Medals DESC) AS Row_N
FROM medals
ORDER BY Medals DESC
OFFSET 0 ROWS FETCH NEXT 5 ROWS ONLY;

-- ���� 4
-- ���������� �����Ѵ�. 
-- ���� 69KG ���� ��⿡�� �ų� �ݸ޴޸���Ʈ ��ȸ�ϵ��� �մϴ�. 
SELECT
    Year,
    Country AS champion
  FROM summer_medals
  WHERE
    Discipline = 'Weightlifting' AND
    Event = '69KG' AND
    Gender = 'Men' AND
    Medal = 'Gold';
    
-- ���� �������� �ų� ���⵵ è�Ǿ� ���� ��ȸ�ϵ��� �մϴ�.
-- LAG & WITH �� ���
WITH Weightlifting_Gold AS (
  SELECT
    -- Return each year's champions' countries
    Year,
    Country AS champion
  FROM summer_medals
  WHERE
    Discipline = 'Weightlifting' AND
    Event = '69KG' AND
    Gender = 'Men' AND
    Medal = 'Gold')

SELECT
  Year, Champion,
  LAG(Champion) OVER
    (ORDER BY Year ASC) AS Last_Champion
FROM Weightlifting_Gold
ORDER BY Year ASC;
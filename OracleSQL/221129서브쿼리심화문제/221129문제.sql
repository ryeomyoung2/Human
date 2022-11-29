-- SQL �������� ��������
-- ���� 1. 2015�� ��� �������� ���� ��� ������ ��ȸ�ϼ���.
select * from populations
where life_expectancy > 
(select AVG(life_expectancy) 
from populations where year like '%2015%');

-- ���� 2. countries2 ���̺� �ִ� capital�� 
-- ��Ī�Ǵ� cities ���̺��� ������ ��ȸ�ϼ���. 
-- ��ȸ�� �÷����� name, country_code, urbanarea_pop
select * from countries2;
select * from cities;
select name, country_code, urbanarea_pop from cities where name
IN (select capital from countries2);

-- ���� 3. 
-- ���� 1. economies ���̺��� country code, inflation rate, unemployment rate�� ��ȸ�Ѵ�.
-- ���� 2. inflation rate ������������ �����Ѵ�.
-- ���� 3. subquery_countries ���̺� gov_form �÷����� Constitutional Monarchy �Ǵ� `Republic`�� �� ������ �����Ѵ�.
-- Select fields
-- �����ͼ�
select code, inflation_rate, unemployment_rate 
from economies where code in
(SELECT code FROM countries2 
where (gov_form NOT IN('Constitutional Monarchy'))
and(gov_form NOT IN('Republic'))) 
order by inflation_rate asc;


-- ���� 4. 2015�� �� ����� inflation_rate�� ���� ���� ������ inflation_rate�� ���ϼ���. 
-- ��Ʈ 1. �Ʒ� ���� ����
SELECT country_name, continent, inflation_rate
  FROM countries2
  	INNER JOIN economies
    USING (code)
WHERE year = 2010;
-- �� ����� inflation_rate�� ���� ���� ���� �����ϴ� �ڵ带 �ۼ��Ѵ�. 


-- SQL ������ �Լ� ��������
-- ���� 1. �� �࿡ ���ڸ� 1, 2, 3, ..., ���·� �߰��Ѵ�. (row_n ���� ǥ��)
-- row_n �������� ������������ ���
-- ���̺�� alias�� �����Ѵ�. 


-- ���� 2. �ø��� �⵵�� �������� ������� �ۼ��� �Ѵ�. 
-- ��Ʈ : ���������� ������ �Լ��� �̿��Ѵ�. 


-- ���� 3. 
-- (1) WITH �� ����Ͽ� �� ��������� ȹ���� �޴� ������ ������������ �����ϵ��� �մϴ�. 
-- (2) (1) ������ Ȱ���Ͽ� �׸��� �������� ��ŷ�� �߰��Ѵ�. 
-- ���� 5���� ���� : OFFSET 0 ROWS FETCH NEXT 5 ROWS ONLY
-- WITH AS (1�� ����)
-- 2�� ����


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
--------------------------------------------------------------------------------
select * from employees;
select * from departments;

select count(*) from employees 
where department_id in 
(select department_id from departments where parent_id is null);
--------------------------------------------------------------------------------
select * from job_history;
select * from employees;
select employee_id, emp_name, job_id from employees where (employee_id,job_id)
IN (select employee_id, job_id from job_history);
--------------------------------------------------------------------------------
select * from departments;
select * from job_history;
select a.department_id, a.department_name
from departments a
where exists(select 1 from job_history b where a.department_id = b.department_id);
--------------------------------------------------------------------------------
select a.department_id, a.department_name
from department a
where exists(selext)

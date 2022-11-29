--PL/SQL / day02_morning.sql
--�͸���
SET SERVEROUTPUT ON

DECLARE
    vi_num NUMBER;
    
BEGIN
    vi_num :=100;
    DBMS_OUTPUT.PUT_LINE('vi_num = ' || TO_CHAR(vi_num));
END;
/ 




--���� 38����
--DML
--��� ID�� 100�� ����� �̸���, �μ����� ��ȸ�ض�
DECLARE
  vs_emp_name    VARCHAR2(80); -- ����� ����
  vs_dep_name    VARCHAR2(80); -- �μ��� ����
BEGIN
  SELECT a.emp_name, b.department_name
    INTO vs_emp_name, vs_dep_name -- INTO ������ �Ҵ�
    FROM employees a,
         departments b
   WHERE a.department_id = b.department_id
     AND a.employee_id = 100;


  DBMS_OUTPUT.PUT_LINE( vs_emp_name || ' - ' || vs_dep_name);
END;





-- �� ���� ���ڸ� �Է¹޾Ƽ� ����ϴ� ����
ACCEPT p_num1 prompt 'ù ��° ���ڸ� �Է��ϼ��� ~'
ACCEPT p_num2 prompt 'ù ��° ���ڸ� �Է��ϼ��� ~'

DECLARE

    v_sum number(10);
BEGIN
    v_sum := &p_num1 + &p_num2;
    DBMS_OUTPUT.PUT_LINE('������ : ' || TO_CHAR(v_sum));
END;
/





SELECT * FROM employees;
--���� : ������ �����ȣ�� �Է��ϸ� employees ���̺��� �ش� �����ȣ�� �޿��� ����ض�
 
ACCEPT p_empno prompt 'ù ��° ���ڸ� �Է��ϼ��� ~'

DECLARE
    v_salary NUMBER;
    v_name VARCHAR2(80);
BEGIN
    SELECT salary, emp_name
    INTO v_salary, v_name
    FROM employees 
    WHERE employee_id = &p_empno;
        DBMS_OUTPUT.PUT_LINE(v_name || '-' || TO_CHAR(v_salary));
END;
/






ACCEPT p_num prompt '���ڸ� �Է��ϼ���~'

BEGIN

    IF mod(&p_num, 2)= 0 THEN
        DBMS_OUTPUT.PUT_LINE('¦���Դϴ�.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Ȧ���Դϴ�.');
    END IF;
END;
/
 
 
 
 
 
-- ��ҵ���, �߰� �ҵ���, ���ҵ��ڸ� �����ϴ� �͸��� �����
-- ������ �����ȣ / ���� �����
ACCEPT p_empno prompt 'ù ��° ���ڸ� �Է��ϼ��� ~'

DECLARE
--    v_salary NUMBER;
    v_salary employees.salary%TYPE;
BEGIN
    SELECT salary INTO v_salary FROM employees WHERE employee_id = &p_empno;
    DBMS_OUTPUT.PUT_LINE(v_salary);
    IF v_salary >= 5000 THEN 
        DBMS_OUTPUT.PUT_LINE('��ҵ���');
    ELSIF v_salary >= 3000 THEN
        DBMS_OUTPUT.PUT_LINE('�߰� �ҵ���');
    ELSE
        DBMS_OUTPUT.PUT_LINE('�� �ҵ���');
    END IF;
END;
/




--����
--������̺��� �����ȣ�� ���� ū ����� ã�Ƴ� ��,
-- �� ��ȣ +1������ �Ʒ��� ����� ������̺� �ű� �Է��ϴ� �͸� ����� ����� ����.
/*
<�����>   : Harrison Ford
<�̸���>   : HARRIS
<�Ի�����> : ��������
<�μ���ȣ> : 50
*/
declare
    vn_max_empno employees.employee_id%TYPE;

begin
    select max(employee_id)into vn_max_empno from employees;

    INSERT INTO employees (employee_id, emp_name, email, hire_date, department_id)
    VALUES( vn_max_empno + 1 , 'Harrison Ford', 'HARRIS', SYSDATE, 50);
    
    commit;
end;

select * from employees order by employee_id desc;

--select * from employees;
delete from employees where employee_id = 207;
commit;





--�ݺ���
--303��° ���κ��� ����
--LOOP�� 3�� ���ϱ� �ۼ�
declare
  vn_base_num number := 3;
  vn_cnt number := 1;
begin
    loop
    
        dbms_output.put_line(vn_base_num || '*' || vn_cnt || ' = ' || vn_base_num * vn_cnt);
        vn_cnt := vn_cnt + 1; --vn_cnt ���� ��� 1�� ����
        exit when vn_cnt >9;
    
    end loop;
end;
/

--while ��

declare
  vn_base_num number := 4;
  vn_cnt number := 1;
begin
    while vn_cnt <=9 --vn_cnt�� 9���� �۰ų� ���� ��� ó��
    loop
        dbms_output.put_line(vn_base_num || '*' || vn_cnt || ' = ' || vn_base_num * vn_cnt);
        vn_cnt := vn_cnt + 1; --vn_cnt ���� ��� 1�� ����
        exit when vn_cnt =5;
    end loop;
end;
/


--for loop
declare
  vn_base_num number := 6;
begin
    for i in 1..9 --1���� 9���� �ݺ��� ����
    loop
        dbms_output.put_line(vn_base_num || '*' || i || ' = ' || vn_base_num * i);
        exit when i = 5;
    end loop;
end;
/


--�������� ��, �������� ��ȯ�ϴ� �Լ�
create or replace function my_mod(num1 number, num2 number)
    return number --��ȯ ������Ÿ�� ����
is
    --���� ����
    vn_remainder number :=0; --��ȯ�� ������
    vn_quotient number :=0; --��
begin
    --���� �ۼ�
    vn_quotient := floor(num1/num2); --������/���� ���� �κ� �ɷ�����
    vn_remainder := num1 - (num2 * vn_quotient); --������ = ������ - (����*��)
    
    return vn_remainder; --������ ��ȯ

end;
/




select my_mod(14,3) remainder from dual;

--�������� ��ȯ�ϴ� �Լ� �ۼ�
--52790 �̱�, 52784 �״�����
select * from countries;

create or replace function fn_get_country_name(p_country_id number)
    return varchar2
is
    vs_country_name countries.country_name%TYPE;
begin

    select country_name into vs_country_name
    from countries
    where country_id = p_country_id;
    
    return vs_country_name; -- ������ ��ȯ

end;

--Ȱ��
--52790 �̱�, 52784 �״�����
select 
    fn_get_country_name(52790) country1
    , fn_get_country_name(52784) country2
from 
    dual;
    
select 
    fn_get_country_name(111111) country1
    , fn_get_country_name(52784) country2
from 
    dual;

    
    

CREATE OR REPLACE FUNCTION fn_get_country_name ( p_country_id NUMBER )
   RETURN VARCHAR2  -- �������� ��ȯ�ϹǷ� ��ȯ ������Ÿ���� VARCHAR2
IS
   vs_country_name COUNTRIES.COUNTRY_NAME%TYPE;
   vn_count NUMBER := 0;
BEGIN
	
	
	SELECT COUNT(*)
	  INTO vn_count
	  FROM countries
	 WHERE country_id = p_country_id;
	 
  IF vn_count = 0 THEN
     vs_country_name := '�ش籹�� ����';
  ELSE
	
	  SELECT country_name
	    INTO vs_country_name
	    FROM countries
	   WHERE country_id = p_country_id;
	      
  END IF;
	 
 RETURN vs_country_name;  -- ������ ��ȯ
	
END;



select 
    fn_get_country_name(111111) country1
    , fn_get_country_name(52784) country2
from 
    dual;









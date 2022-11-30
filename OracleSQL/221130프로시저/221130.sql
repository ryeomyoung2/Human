--day02_afternoon.sql
--92��° ����

CREATE OR REPLACE PROCEDURE my_new_job_proc 
          ( p_job_id    IN JOBS.JOB_ID%TYPE,
            p_job_title IN JOBS.JOB_TITLE%TYPE,
            p_min_sal   IN JOBS.MIN_SALARY%TYPE,
            p_max_sal   IN JOBS.MAX_SALARY%TYPE )
IS

BEGIN
	
	INSERT INTO JOBS ( job_id, job_title, min_salary, max_salary, create_date, update_date)
	          VALUES ( p_job_id, p_job_title, p_min_sal, p_max_sal, SYSDATE, SYSDATE);
	          
	COMMIT;
	
	
END ;

--���ν��� ����
select * from jobs;
EXEC my_new_job_proc ('SM_JOB1', 'Sample JOB1', 1000, 5000);

select * from jobs;
EXEC my_new_job_proc ('SM_JOB1', 'Sample JOB1', 1000, 5000);



--ȸ������ ������
--�ߺ� ID�� ���� �ȵ� (X)
--�Ϲ������� �������ʿ��� ���� vs DB�ʿ��� ����


CREATE OR REPLACE PROCEDURE my_new_job_proc 
          ( p_job_id    IN JOBS.JOB_ID%TYPE,
            p_job_title IN JOBS.JOB_TITLE%TYPE,
            p_min_sal   IN JOBS.MIN_SALARY%TYPE,
            p_max_sal   IN JOBS.MAX_SALARY%TYPE )
IS
    vn_cnt NUMBER :=0;
BEGIN
    --������ job_id�� �ִ��� üũ
    SELECT count(*)INTO vn_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    --0�̸� ����, �׷� INSERT
    IF vn_cnt = 0 THEN
        
	INSERT INTO JOBS ( job_id, job_title, min_salary, max_salary, create_date, update_date)
	          VALUES ( p_job_id, p_job_title, p_min_sal, p_max_sal, SYSDATE, SYSDATE);
    
    ELSE --������ update
        UPDATE jobs
            SET job_title = p_job_title,
                min_salary = p_min_sal,
                max_salary = p_max_sal,
                update_date = SYSDATE
        WHERE job_id = p_job_id;
        
    END IF;
    
	COMMIT;
	
END ;

EXEC my_new_job_proc ('SM_JOB1', 'Sample JOB1', 2000, 5000);
select * from jobs;

-- �Ű������� ����Ʈ �� ����

CREATE OR REPLACE PROCEDURE my_new_job_proc 
          ( p_job_id    IN JOBS.JOB_ID%TYPE,
            p_job_title IN JOBS.JOB_TITLE%TYPE,
            p_min_sal   IN JOBS.MIN_SALARY%TYPE :=10,
            p_max_sal   IN JOBS.MAX_SALARY%TYPE :=1000
)
IS
    vn_cnt NUMBER :=0;
BEGIN
    --������ job_id�� �ִ��� üũ
    SELECT count(*)INTO vn_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    --0�̸� ����, �׷� INSERT
    IF vn_cnt = 0 THEN
        
	INSERT INTO JOBS ( job_id, job_title, min_salary, max_salary, create_date, update_date)
	          VALUES ( p_job_id, p_job_title, p_min_sal, p_max_sal, SYSDATE, SYSDATE);
    
    ELSE --������ update
        UPDATE jobs
            SET job_title = p_job_title,
                min_salary = p_min_sal,
                max_salary = p_max_sal,
                update_date = SYSDATE
        WHERE job_id = p_job_id;
        
    END IF;
    
	COMMIT;
	
END ;

EXEC my_new_job_proc ('SM_JOB1', 'Sample JOB1');
select * from jobs;






-- IN/OUT/IN OUT �Ű����� ����
-- 270����
SET SERVEROUTPUT ON
CREATE OR REPLACE PROCEDURE my_parameter_test_proc(
    p_var1      VARCHAR2,
    p_var2 OUT    VARCHAR2,
    p_var3 IN OUT    VARCHAR2
)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('p_var1 value = ' || p_var1);
    DBMS_OUTPUT.PUT_LINE('p_var2 value = ' || p_var2);
    DBMS_OUTPUT.PUT_LINE('p_var3 value = ' || p_var3);
    p_var2 := 'B2';
    p_var3 := 'C2';
END;

--�͸��� ���ؼ� �׽�Ʈ
DECLARE
    v_var1 VARCHAR2(10) := 'A';
    v_var2 VARCHAR2(10) := 'B';
    v_var3 VARCHAR2(10) := 'C';
BEGIN
    my_parameter_test_proc(v_var1,v_var2,v_var3);
    DBMS_OUTPUT.PUT_LINE('v_var2 value = ' || v_var2);
    DBMS_OUTPUT.PUT_LINE('v_var3 value = ' || v_var3);
END;

--RETURN��
--���ν��������� RETURN���� ���Ḧ �ǹ�
CREATE OR REPLACE PROCEDURE my_new_job_proc 
          ( p_job_id    IN  JOBS.JOB_ID%TYPE,
            p_job_title IN  JOBS.JOB_TITLE%TYPE,
            p_min_sal   IN  JOBS.MIN_SALARY%TYPE := 10,
            p_max_sal   IN  JOBS.MAX_SALARY%TYPE := 100
            --p_upd_date  OUT JOBS.UPDATE_DATE%TYPE  
            )
IS
  vn_cnt NUMBER := 0;
  vn_cur_date JOBS.UPDATE_DATE%TYPE := SYSDATE;
BEGIN
	-- 1000 ���� ������ �޽��� ��� �� ����������
	IF p_min_sal < 1000 THEN
	   DBMS_OUTPUT.PUT_LINE('�ּ� �޿����� 1000 �̻��̾�� �մϴ�');
	   RETURN;
  END IF;
	
	-- ������ job_id�� �ִ��� üũ
	SELECT COUNT(*)
	  INTO vn_cnt
	  FROM JOBS
	 WHERE job_id = p_job_id;
	 
	-- ������ INSERT 
	IF vn_cnt = 0 THEN 
	
	   INSERT INTO JOBS ( job_id, job_title, min_salary, max_salary, create_date, update_date)
	             VALUES ( p_job_id, p_job_title, p_min_sal, p_max_sal, vn_cur_date, vn_cur_date);
	             
	ELSE -- ������ UPDATE
	
	   UPDATE JOBS
	      SET job_title   = p_job_title,
	          min_salary  = p_min_sal,
	          max_salary  = p_max_sal,
	          update_date = vn_cur_date
	    WHERE job_id = p_job_id;
	
  END IF;
  
	          
	COMMIT;
	
	
END ;   


EXEC my_new_job_proc ('SM_JOB1', 'Sample JOB1', 999, 6000);
select * from jobs;

--����ó��
--374����
CREATE OR REPLACE PROCEDURE no_exception_proc 
IS
  vi_num NUMBER := 0;
BEGIN
	vi_num := 10 / 0;
	 
	DBMS_OUTPUT.PUT_LINE('Success!');
	
END;


CREATE OR REPLACE PROCEDURE exception_proc 
IS
  vi_num NUMBER := 0;
BEGIN
	vi_num := 10 / 0;
	 
	DBMS_OUTPUT.PUT_LINE('Success!');
EXCEPTION WHEN OTHERS THEN	 
	 DBMS_OUTPUT.PUT_LINE('������ �߻��߽��ϴ�');		
	
END;	

--���� ó���� ���� ���ν��� ����
DECLARE 
 
BEGIN
	
	 --no_exception_proc; 
     exception_proc; 
	 DBMS_OUTPUT.PUT_LINE('����!');

END;


--����ó�� ���׷��̵�
CREATE OR REPLACE PROCEDURE exception_proc 
IS
  vi_num NUMBER := 0;
BEGIN
	vi_num := 10 / 0;
	 
	DBMS_OUTPUT.PUT_LINE('Success!');
--EXCEPTION WHEN OTHERS THEN	
EXCEPTION WHEN ZERO_DIVIDE THEN
	 DBMS_OUTPUT.PUT_LINE('������ �߻��߽��ϴ�');
     DBMS_OUTPUT.PUT_LINE('SQL ERROR CODE:' || SQLCODE);
     DBMS_OUTPUT.PUT_LINE('SQL ERROR MESSAGE:' || SQLERRM);
	
END;	

CREATE OR REPLACE PROCEDURE exception_proc 
IS
  vi_num NUMBER := 0;
BEGIN
	vi_num := 10 / 0;
	 
	DBMS_OUTPUT.PUT_LINE('Success!');
--EXCEPTION WHEN OTHERS THEN	
EXCEPTION WHEN ZERO_DIVIDE THEN
	 DBMS_OUTPUT.PUT_LINE('ZERO_DIVIDE �߻�');
     DBMS_OUTPUT.PUT_LINE('SQL ERROR CODE:' || SQLCODE);
     DBMS_OUTPUT.PUT_LINE('SQL ERROR MESSAGE:' || SQLERRM);
     WHEN OTHERS THEN
     DBMS_OUTPUT.PUT_LINE('�ٸ� ���� �߻�');
     DBMS_OUTPUT.PUT_LINE('SQL ERROR CODE:' || SQLCODE);
     DBMS_OUTPUT.PUT_LINE('SQL ERROR MESSAGE:' || SQLERRM);
	
END;	

EXEC exception_proc;

-- ���� 727����
-- ȿ������ ���� ó�� ���
CREATE TABLE error_log_tb (
                 error_seq     NUMBER,              -- ���� ������
                 prog_name     VARCHAR2(80),        -- ���α׷���
                 error_code    NUMBER,              -- �����ڵ�
                 error_message VARCHAR2(300),       -- ���� �޽���
                 error_line    VARCHAR2(100),       -- ���� ����
                 error_date    DATE DEFAULT SYSDATE -- �����߻�����
);

-- �� �ʿ��� ������ �ִ��� �ش� �÷��� �߰��Ѵ�. 
-- CREATE SEQUENCE�� ����Ѵ�. (�ڵ�����, �Ϸù�ȣ)
CREATE SEQUENCE error_seq
           INCREMENT BY 1
           START WITH 1
           MINVALUE 1
           MAXVALUE 999999
           NOCYCLE
           NOCACHE;

-- ���ܰ� �߻��� ��, ���� �α� ���̺� ���� ������ �Է��ϴ� ���ν����� �����Ѵ�. 
CREATE OR REPLACE PROCEDURE error_log_proc (
      p_prog_name error_log_tb.prog_name%TYPE,
      p_error_code error_log_tb.error_code%TYPE,
      p_error_messgge error_log_tb.error_message%TYPE,
      p_error_line error_log_tb.error_line%TYPE)
    IS

    BEGIN
      INSERT INTO error_log_tb (error_seq, prog_name, error_code, error_message, error_line)
           VALUES (error_seq.NEXTVAL, p_prog_name, p_error_code, p_error_messgge, p_error_line );

      COMMIT;
END;

-- ���� �͸� ����̳� �ٸ� ���ν������� ���ܰ� �߻����� ��, ����ó�� �κп��� �� ���ν����� ȣ���Ѵ�. 
CREATE OR REPLACE PROCEDURE ins_emp2_proc ( 
                  p_emp_name       employees.emp_name%TYPE,
                  p_department_id  departments.department_id%TYPE,
                  p_hire_month  VARCHAR2  )
IS
   vn_employee_id  employees.employee_id%TYPE;
   vd_curr_date    DATE := SYSDATE;
   vn_cnt          NUMBER := 0;
   
   ex_invalid_depid EXCEPTION; -- �߸��� �μ���ȣ�� ��� ���� ����
   PRAGMA EXCEPTION_INIT(ex_invalid_depid, -20000); -- ���ܸ�� �����ڵ� ����
   
   ex_invalid_month EXCEPTION; -- �߸��� �Ի���� ��� ���� ����
   PRAGMA EXCEPTION_INIT (ex_invalid_month, -1843); -- ���ܸ�� �����ڵ� ����
   
   -- ���� ���� ���� ����
   v_err_code error_log_tb.error_code%TYPE;
   v_err_msg error_log_tb.error_message%TYPE;
   v_err_line error_log_tb.error_line%TYPE;
   
BEGIN
	
	 -- �μ����̺��� �ش� �μ���ȣ �������� üũ
	 SELECT COUNT(*)
	   INTO vn_cnt
	   FROM departments
	  WHERE department_id = p_department_id;
	  
	 IF vn_cnt = 0 THEN
	    RAISE ex_invalid_depid; -- ����� ���� ���� �߻�
	 END IF;
	 
	 -- �Ի�� üũ (1~12�� ������ ������� üũ)
	 IF SUBSTR(p_hire_month, 5, 2) NOT BETWEEN '01' AND '12' THEN
	    RAISE ex_invalid_month; -- ����� ���� ���� �߻�
	 
	 END IF;
	 
	 -- employee_id�� max ���� +1
	 SELECT MAX(employee_id) + 1
	   INTO vn_employee_id
	   FROM employees;
	 
	 -- ����ڿ���ó�� �����̹Ƿ� ��� ���̺� �ּ��� �����͸� �Է���
	 INSERT INTO employees ( employee_id, emp_name, hire_date, department_id )
              VALUES (vn_employee_id, p_emp_name, TO_DATE(p_hire_month || '01'), p_department_id );
              
     COMMIT;              
              
EXCEPTION WHEN ex_invalid_depid THEN -- ����� ���� ���� ó��
    v_err_code := SQLCODE;
    v_err_msg  := '�ش� �μ��� �����ϴ�';
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
WHEN ex_invalid_month THEN -- �Ի�� ����� ���� ���� ó��
    v_err_code := SQLCODE;
    v_err_msg  := SQLERRM;
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
WHEN OTHERS THEN
    v_err_code := SQLCODE;
    v_err_msg  := SQLERRM;
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
END;

--�μ���ȣ �߸��Է�
EXEC ins_emp2_proc('HONG', 1000, '201401');

-- �߸��� ��
EXEC ins_emp2_proc('EVAN', 100, '202213');

select * from error_log_tb;



-- Ʈ����

CREATE TABLE exam1(
    id NUMBER PRIMARY KEY
    , name VARCHAR2(20)
);
CREATE TABLE exam2(
    log VARCHAR2(100)
    , regdate DATE Default SYSDATE
);

-- ��Ȳ1, exam1 ���̺� �����ϰ� insert�� �߰�
-- exam2�� �ش� �α� ����� ����

CREATE OR REPLACE TRIGGER trig_insert_exam2
AFTER
    INSERT ON exam1
BEGIN
    INSERT INTO exam2(log) VALUES('�߰��۾�-�α�');
END;

INSERT INTO exam1 VALUES(100,'ȫ�浿');

SELECT * FROM exam2;

CREATE OR REPLACE TRIGGER trig_insert_exam2
AFTER 
    INSERT OR UPDATE OR DELETE ON exam1
DECLARE 
    v_msg VARCHAR2(100);
BEGIN
    -- ���� ���� (conditional predicate) 
    IF INSERTING THEN 
        v_msg := '> �߰� �۾� - �α�';
    ELSIF UPDATING THEN 
        v_msg := '> ���� �۾� - �α�';
    ELSIF DELETING THEN 
        v_msg := '> ���� �۾� - �α�';
    END IF;
    INSERT INTO exam2(log) VALUES (v_msg);
END;

INSERT INTO exam1 VALUES (101, '��浿');
UPDATE exam1 SET name='��浿' WHERE id = 100;
DELETE FROM exam1 WHERE id = 100;

SELECT * FROM exam2;



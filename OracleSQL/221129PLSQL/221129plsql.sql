--PL/SQL / day02_morning.sql
--익명블록
SET SERVEROUTPUT ON

DECLARE
    vi_num NUMBER;
    
BEGIN
    vi_num :=100;
    DBMS_OUTPUT.PUT_LINE('vi_num = ' || TO_CHAR(vi_num));
END;
/ 




--교재 38라인
--DML
--사원 ID가 100인 사원의 이름명, 부서명을 조회해라
DECLARE
  vs_emp_name    VARCHAR2(80); -- 사원명 변수
  vs_dep_name    VARCHAR2(80); -- 부서명 변수
BEGIN
  SELECT a.emp_name, b.department_name
    INTO vs_emp_name, vs_dep_name -- INTO 변수에 할당
    FROM employees a,
         departments b
   WHERE a.department_id = b.department_id
     AND a.employee_id = 100;


  DBMS_OUTPUT.PUT_LINE( vs_emp_name || ' - ' || vs_dep_name);
END;





-- 두 개의 숫자를 입력받아서 출력하는 예제
ACCEPT p_num1 prompt '첫 번째 숫자를 입력하세요 ~'
ACCEPT p_num2 prompt '첫 번째 숫자를 입력하세요 ~'

DECLARE

    v_sum number(10);
BEGIN
    v_sum := &p_num1 + &p_num2;
    DBMS_OUTPUT.PUT_LINE('총합은 : ' || TO_CHAR(v_sum));
END;
/





SELECT * FROM employees;
--문제 : 임의의 사원번호를 입력하면 employees 테이블에서 해당 사원번호의 급여를 출력해라
 
ACCEPT p_empno prompt '첫 번째 숫자를 입력하세요 ~'

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






ACCEPT p_num prompt '숫자를 입력하세요~'

BEGIN

    IF mod(&p_num, 2)= 0 THEN
        DBMS_OUTPUT.PUT_LINE('짝수입니다.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('홀수입니다.');
    END IF;
END;
/
 
 
 
 
 
-- 고소득자, 중간 소득자, 저소득자를 구분하는 익명블록 만들기
-- 임의의 사원번호 / 교재 사원명
ACCEPT p_empno prompt '첫 번째 숫자를 입력하세요 ~'

DECLARE
--    v_salary NUMBER;
    v_salary employees.salary%TYPE;
BEGIN
    SELECT salary INTO v_salary FROM employees WHERE employee_id = &p_empno;
    DBMS_OUTPUT.PUT_LINE(v_salary);
    IF v_salary >= 5000 THEN 
        DBMS_OUTPUT.PUT_LINE('고소득자');
    ELSIF v_salary >= 3000 THEN
        DBMS_OUTPUT.PUT_LINE('중간 소득자');
    ELSE
        DBMS_OUTPUT.PUT_LINE('저 소득자');
    END IF;
END;
/




--문제
--사원테이블에서 사원번호가 제일 큰 사원을 찾아낸 뒤,
-- 이 번호 +1번으로 아래의 사원을 사원테이블에 신규 입력하는 익명 블록을 만들어 보자.
/*
<사원명>   : Harrison Ford
<이메일>   : HARRIS
<입사일자> : 현재일자
<부서번호> : 50
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





--반복문
--303번째 라인부터 시작
--LOOP문 3단 곱하기 작성
declare
  vn_base_num number := 3;
  vn_cnt number := 1;
begin
    loop
    
        dbms_output.put_line(vn_base_num || '*' || vn_cnt || ' = ' || vn_base_num * vn_cnt);
        vn_cnt := vn_cnt + 1; --vn_cnt 값이 계속 1씩 증가
        exit when vn_cnt >9;
    
    end loop;
end;
/

--while 문

declare
  vn_base_num number := 4;
  vn_cnt number := 1;
begin
    while vn_cnt <=9 --vn_cnt가 9보다 작거나 같을 경우 처리
    loop
        dbms_output.put_line(vn_base_num || '*' || vn_cnt || ' = ' || vn_base_num * vn_cnt);
        vn_cnt := vn_cnt + 1; --vn_cnt 값이 계속 1씩 증가
        exit when vn_cnt =5;
    end loop;
end;
/


--for loop
declare
  vn_base_num number := 6;
begin
    for i in 1..9 --1부터 9까지 반복문 수행
    loop
        dbms_output.put_line(vn_base_num || '*' || i || ' = ' || vn_base_num * i);
        exit when i = 5;
    end loop;
end;
/


--나머지와 몫, 나머지를 반환하는 함수
create or replace function my_mod(num1 number, num2 number)
    return number --반환 데이터타입 지정
is
    --변수 선언
    vn_remainder number :=0; --반환할 나머지
    vn_quotient number :=0; --몫
begin
    --수식 작성
    vn_quotient := floor(num1/num2); --피제수/제수 정수 부분 걸러내기
    vn_remainder := num1 - (num2 * vn_quotient); --나머지 = 피제수 - (제수*몫)
    
    return vn_remainder; --나머지 반환

end;
/




select my_mod(14,3) remainder from dual;

--국가명을 반환하는 함수 작성
--52790 미국, 52784 네덜란드
select * from countries;

create or replace function fn_get_country_name(p_country_id number)
    return varchar2
is
    vs_country_name countries.country_name%TYPE;
begin

    select country_name into vs_country_name
    from countries
    where country_id = p_country_id;
    
    return vs_country_name; -- 국가명 반환

end;

--활용
--52790 미국, 52784 네덜란드
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
   RETURN VARCHAR2  -- 국가명을 반환하므로 반환 데이터타입은 VARCHAR2
IS
   vs_country_name COUNTRIES.COUNTRY_NAME%TYPE;
   vn_count NUMBER := 0;
BEGIN
	
	
	SELECT COUNT(*)
	  INTO vn_count
	  FROM countries
	 WHERE country_id = p_country_id;
	 
  IF vn_count = 0 THEN
     vs_country_name := '해당국가 없음';
  ELSE
	
	  SELECT country_name
	    INTO vs_country_name
	    FROM countries
	   WHERE country_id = p_country_id;
	      
  END IF;
	 
 RETURN vs_country_name;  -- 국가명 반환
	
END;



select 
    fn_get_country_name(111111) country1
    , fn_get_country_name(52784) country2
from 
    dual;









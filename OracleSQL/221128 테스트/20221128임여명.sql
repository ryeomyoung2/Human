문제 1
select * from tb_point;

문제 2
select customer_cd, point_memo, point from tb_point;

문제 3
select customer_cd as 고객코드, point_memo as "포인트 내용", point as 포인트 from tb_point;

문제4
select customer_cd, customer_nm, email, total_point 
from tb_customer
where NOT email is NULL and total_point < 10000;

문제5
select customer_cd, seq_no, point 
from tb_point
where customer_cd like '%2017053%' and seq_no like '%2%';

문제6
select class_cd, student_no, student_nm, kor, eng, mat,(kor + eng + mat)as TOT,
ROUND(((kor + eng + mat)/3), 1)as AVG
from TB_GRADE 
where (kor>=80 and eng>=80 and mat>=80) 
or (class_cd LIKE '%A%' OR class_cd LIKE '%B%');

문제7
select * from tb_point
where (REG_DTTM like '2018%') and (point BETWEEN 10000 AND 50000);

문제8
select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from TB_CUSTOMER
where (birth_day like '198%') and (total_point >= 20000);

문제9
UPDATE TB_CUSTOMER SET birth_day = 19920315 WHERE customer_nm = '김한길';

select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from TB_CUSTOMER where (mw_flg like '%M%')
and(BIRTH_DAY like '____05__')or(BIRTH_DAY like '____06__')or(BIRTH_DAY like '____07__');


문제11
select * from TB_ITEM_INFO
where item_cd LIKE '%S01%' 
OR item_cd LIKE '%S04%' 
OR item_cd LIKE '%S06%' 
OR item_cd LIKE '%S10%';

문제12
select * from tb_point where (customer_cd LIKE '%2017042%' 
OR customer_cd LIKE '%2018087%' 
OR customer_cd LIKE '%2019095%') and (point_memo LIKE '%구매%');

문제13
select * from tb_point where (point_memo LIKE '%구매%') 
and (reg_dttm LIKE '2019%')
ORDER BY point desc;

문제14

SELECT kor, eng, mat, (kor + eng + mat)as 합계 
from TB_GRADE 
where class_cd LIKE '%B%'
ORDER BY 합계 desc;

문제15 
select sales_dt,product_nm, sum(sales_count)as 총판매수 from TB_SALES 
where (sales_dt LIKE '%20190802%' or sales_dt LIKE '%20190803%')
group by sales_dt, product_nm
ORDER BY sales_dt asc;


문제16
select distinct product_nm 
from TB_SALES where sales_dt BETWEEN 20190801 AND 20190802
ORDER BY product_nm asc;

문제17
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point
from TB_CUSTOMER a, TB_POINT b
where a.customer_cd=b.customer_cd and a.customer_cd LIKE '%2019069%';

문제18
select customer_cd, customer_nm, total_point,
case when total_point>=50000 then 'VIP'
when total_point>=20000 and total_point<50000 then '골드'
when total_point>=1000 and total_point<20000 then '실버'
else '일반'
end "고객 등급"
from TB_CUSTOMER;

문제19
select rownum, a.* from TB_GRADE a
where (class_cd LIKE '%A%' 
OR class_cd LIKE '%C%');

문제20
select customer_cd,customer_nm, mw_flg, birth_day, phone_number, email, total_point,reg_dttm from TB_CUSTOMER
where (BIRTH_DAY BETWEEN 19900101 AND 20991231) and(customer_cd LIKE '2018%' or customer_cd LIKE '2019%')
and(NOT phone_number is NULL);


문제21
select 300/60, to_char(sysdate,'YYYY-MM-DD')as "오늘 날짜",  
to_char(add_months(sysdate,+1),'yyyy-mm-dd')as "30일 후 날짜" from dual;

문제22
select a.*
from TB_CUSTOMER a, TB_POINT b
where (a.customer_cd=b.customer_cd)
and(b.point_memo LIKE '%이벤트%')
and(NOT email is NULL);




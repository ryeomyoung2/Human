���� 1
select * from tb_point;

���� 2
select customer_cd, point_memo, point from tb_point;

���� 3
select customer_cd as ���ڵ�, point_memo as "����Ʈ ����", point as ����Ʈ from tb_point;

����4
select customer_cd, customer_nm, email, total_point 
from tb_customer
where NOT email is NULL and total_point < 10000;

����5
select customer_cd, seq_no, point 
from tb_point
where customer_cd like '%2017053%' and seq_no like '%2%';

����6
select class_cd, student_no, student_nm, kor, eng, mat,(kor + eng + mat)as TOT,
ROUND(((kor + eng + mat)/3), 1)as AVG
from TB_GRADE 
where (kor>=80 and eng>=80 and mat>=80) 
or (class_cd LIKE '%A%' OR class_cd LIKE '%B%');

����7
select * from tb_point
where (REG_DTTM like '2018%') and (point BETWEEN 10000 AND 50000);

����8
select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from TB_CUSTOMER
where (birth_day like '198%') and (total_point >= 20000);

����9
UPDATE TB_CUSTOMER SET birth_day = 19920315 WHERE customer_nm = '���ѱ�';

select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from TB_CUSTOMER where (mw_flg like '%M%')
and(BIRTH_DAY like '____05__')or(BIRTH_DAY like '____06__')or(BIRTH_DAY like '____07__');


����11
select * from TB_ITEM_INFO
where item_cd LIKE '%S01%' 
OR item_cd LIKE '%S04%' 
OR item_cd LIKE '%S06%' 
OR item_cd LIKE '%S10%';

����12
select * from tb_point where (customer_cd LIKE '%2017042%' 
OR customer_cd LIKE '%2018087%' 
OR customer_cd LIKE '%2019095%') and (point_memo LIKE '%����%');

����13
select * from tb_point where (point_memo LIKE '%����%') 
and (reg_dttm LIKE '2019%')
ORDER BY point desc;

����14

SELECT kor, eng, mat, (kor + eng + mat)as �հ� 
from TB_GRADE 
where class_cd LIKE '%B%'
ORDER BY �հ� desc;

����15 
select sales_dt,product_nm, sum(sales_count)as ���Ǹż� from TB_SALES 
where (sales_dt LIKE '%20190802%' or sales_dt LIKE '%20190803%')
group by sales_dt, product_nm
ORDER BY sales_dt asc;


����16
select distinct product_nm 
from TB_SALES where sales_dt BETWEEN 20190801 AND 20190802
ORDER BY product_nm asc;

����17
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point
from TB_CUSTOMER a, TB_POINT b
where a.customer_cd=b.customer_cd and a.customer_cd LIKE '%2019069%';

����18
select customer_cd, customer_nm, total_point,
case when total_point>=50000 then 'VIP'
when total_point>=20000 and total_point<50000 then '���'
when total_point>=1000 and total_point<20000 then '�ǹ�'
else '�Ϲ�'
end "�� ���"
from TB_CUSTOMER;

����19
select rownum, a.* from TB_GRADE a
where (class_cd LIKE '%A%' 
OR class_cd LIKE '%C%');

����20
select customer_cd,customer_nm, mw_flg, birth_day, phone_number, email, total_point,reg_dttm from TB_CUSTOMER
where (BIRTH_DAY BETWEEN 19900101 AND 20991231) and(customer_cd LIKE '2018%' or customer_cd LIKE '2019%')
and(NOT phone_number is NULL);


����21
select 300/60, to_char(sysdate,'YYYY-MM-DD')as "���� ��¥",  
to_char(add_months(sysdate,+1),'yyyy-mm-dd')as "30�� �� ��¥" from dual;

����22
select a.*
from TB_CUSTOMER a, TB_POINT b
where (a.customer_cd=b.customer_cd)
and(b.point_memo LIKE '%�̺�Ʈ%')
and(NOT email is NULL);




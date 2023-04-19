-- 2023.04.19

-- VIEW : 가산 테이블
-- VIEW 객체는 sql을 가진다 -> sql 실행결과를 가상의 테이블로 사용

select empno, ename, deptno
from emp
where deptno=30;

-- view 객체 생성
-- create or replace view 뷰이름 as 서브쿼리
create or replace view emp_view30
as
select empno, ename, deptno
from emp
where deptno=30;

select * from emp_view30;

-- 주문정보 : orders, book, customer
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate, c.phone
from orders o join book b
on o.bookid=b.bookid
join customer c
on o.custid=c.custid;

create or replace view order_info
as
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate, c.phone
from orders o join book b
on o.bookid=b.bookid
join customer c
on o.custid=c.custid;

select bookname from order_info where name='박지성';

select view_name, text from user_views;

-- view 삭제
drop view emp_view30;

select rownum, ename, hiredate from emp order by hiredate;

select rownum, ename, hiredate
from (select rownum, ename, hiredate from emp order by hiredate)
where rownum <= 3
order by hiredate;

create or replace view emp_hiredate_view
as
select ename, hiredate from emp order by hiredate;

select rownum, ename, hiredate
from emp_hiredate_view
where rownum <= 3;

select to_char(hiredate, 'YYYY') from emp;














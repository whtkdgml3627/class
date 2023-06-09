-- 2023-04-12
-- 함수문제 2

--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
select * from customer;
select custid,
        decode(custid,
                1, '박지성'
        ) as name,
        sum(saleprice) as sum
from orders
group by custid
having custid=1;

--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
select * from orders;
select custid,
        decode(custid,
                1, '박지성'
        ) as name,
        count(*) as count
from orders
group by custid
having custid=1;

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(1) 마당서점도서의총개수
select count(*) as count from book;

--(2) 마당서점에도서를출고하는출판사의총개수
select count(distinct publisher) from book;

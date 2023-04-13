-- 2023.04.13
-- JOIN 문제

-- 1 마당서점의 고객이 요구하는 다음 질문에대해 SQL 문을 작성하시오.

-- (5) 박지성이 구매한 도서의 출판사 수
select count(publisher)
from customer c natural join orders o natural join book b
where c.name='박지성';

-- (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
select b.bookname, o.saleprice, b.price-o.saleprice as "정가와 차이"
from customer c join orders o
on c.custid=o.custid
join book b
on o.bookid=b.bookid
where c.custid=1;


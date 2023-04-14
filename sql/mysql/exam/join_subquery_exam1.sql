-- 2023.04.13
-- JOIN & SUBQUERY 문제

-- 1 마당서점의 고객이 요구하는 다음 질문에대해 SQL 문을 작성하시오.

-- (5) 박지성이 구매한 도서의 출판사 수
select count(publisher)
from customer c natural join orders o natural join book b
where c.custid=1;

-- (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
select b.bookname, o.saleprice, b.price-o.saleprice as "정가와 차이"
from customer c join orders o
on c.custid=o.custid
join book b
on o.bookid=b.bookid
where c.custid=1;

-- (7) 박지성이 구매하지 않은 도서의 이름
select b.bookname
from book b
where bookid not in (select bookid from orders o where b.bookid=o.bookid and custid=1);
select bookid from orders where custid=1;

-- 2 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL문을 작성하시오.

-- (8) 주문하지 않은 고객의 이름 (부속질의사용)
select c.name
from customer c
where custid not in (select custid from orders o where c.custid=o.custid);
select * from orders;

-- (9) 주문금액의 총액과 주문의 평균금액
select sum(saleprice) total, round(avg(saleprice)) avg from orders;

-- (10) 고객의 이름과 고객별 구매액
select c.name, sum(saleprice)
from customer c join orders o
on c.custid=o.custid
group by c.name;

-- (11) 고객의 이름과 고객이 구매한 도서목록
select c.name, b.bookname
from customer c join orders o
on c.custid=o.custid
join book b
on o.bookid=b.bookid
order by c.name;

-- (12) 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은주문
select *
from book b join orders o
on b.bookid=o.bookid
where b.price-o.saleprice = (select max(b.price-o.saleprice) from book b join orders o on b.bookid=o.bookid);
-- select max(b.price-o.saleprice) from book b join orders o on b.bookid=o.bookid;

-- (13) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
select c.name
from customer c join orders o
on c.custid=o.custid
group by c.name
having avg(saleprice) > (select avg(saleprice) from orders);
-- select avg(saleprice) from orders o;

-- 3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select c.name
from customer c join orders o
on c.custid=o.custid
join book b
on o.bookid=b.bookid
where b.publisher in (select b.publisher from orders o join book b on o.bookid=b.bookid where o.custid=1) and c.custid!=1;
-- select b.publisher from orders o join book b on o.bookid=b.bookid where o.custid=1;

-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select c.name
from customer c join orders o
on c.custid=o.custid
join book b
on o.bookid=b.bookid
group by c.name
having count(distinct b.publisher)>1;

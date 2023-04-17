-- subquery exam2

-- 1 마당 서점의 고객이 요구하는 다음 질문에 대해 SQL 문을 작성하시오.

-- (5) 박지성이 구매한 도서의 출판사 수
select count(publisher)
from customer c natural join orders o natural join book b
where c.custid=1;

select count(distinct b.publisher)
from orders o join book b
on o.bookid=b.bookid
join customer c
on o.custid=c.custid
where c.name='박지성';

-- (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매 가격의 차이
select *
from orders o join book b
on o.bookid=b.bookid
join customer c
on o.custid=c.custid;

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
-- group by, c.custid, c.name
-- orders, customer
select c.custid, c.name, sum(saleprice)
from orders o join customer c
on o.custid=c.custid
group by c.custid, c.name
order by c.custid;

-- (11) 고객의 이름과 고객이 구매한 도서목록
select c.name, b.bookname
from customer c join orders o
on c.custid=o.custid
join book b
on o.bookid=b.bookid
order by c.name;

-- (12) 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은주문
-- 정가 - 판매가 -> 최대 차이가 나는 값
select o.orderid, b.price, o.saleprice, b.price-o.saleprice as gap
from orders o join book b
on o.bookid=b.bookid
where b.price-o.saleprice = (select max(b.price-o.saleprice) from orders o join book b on o.bookid=b.bookid);
select max(b.price-o.saleprice) from orders o join book b on o.bookid=b.bookid;

select *
from book b join orders o
on b.bookid=o.bookid
where b.price-o.saleprice = (select max(b.price-o.saleprice) from book b join orders o on b.bookid=o.bookid);

-- (13) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
-- 고객별 총 판매액 출력 조건 -> 총 평균보다 더 높은 값을 가지는 고객만 출력
select c.custid, c.name, avg(o.saleprice)
from orders o join customer c
on o.custid=c.custid
group by c.custid, c.name
having avg(o.saleprice) > (select avg(saleprice) from orders)
order by c.custid;

select c.name
from customer c join orders o
on c.custid=o.custid
group by c.name
having avg(saleprice) > (select avg(saleprice) from orders);

-- 3. 마당 서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
-- orders join book -> publisher in ();
-- 박지성이 구매한 도서의 출판사 이름
select c.name
from orders o join book b
on o.bookid=b.bookid
join customer c
on o.custid=c.custid
where b.publisher in (select distinct b.publisher from orders o join book b on o.bookid=b.bookid join customer c on o.custid=c.custid where c.name='박지성') and c.name!='박지성';
-- select distinct b.publisher from orders o join book b on o.bookid=b.bookid join customer c on o.custid=c.custid where c.name='박지성';

select c.name
from customer c join orders o
on c.custid=o.custid
join book b
on o.bookid=b.bookid
where b.publisher in (select b.publisher from orders o join book b on o.bookid=b.bookid where o.custid=1) and c.custid!=1;

-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
-- group by custid, name
-- 고객별 구매한 도서별 출판사의 수
select c.custid, c.name
from orders o join book b
on o.bookid=b.bookid
join customer c
on o.custid=c.custid
group by c.custid, c.name;


select c.name
from customer c join orders o
on c.custid=o.custid
join book b
on o.bookid=b.bookid
group by c.name
having count(distinct b.publisher)>1;






















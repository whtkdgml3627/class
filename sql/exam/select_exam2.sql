-- select example2

-- 1 마당서점의 고객이 요구하는 다음 질문에 대해 SQL 문을작성하시오.

-- (1) 도서번호가 1인 도서의 이름
SELECT BOOKNAME FROM BOOK WHERE BOOKID=1;

-- (2) 가격이 20,000원이상인 도서의 이름
SELECT BOOKNAME FROM BOOK WHERE PRICE>=20000;

-- 2 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 문을 작성하시오.

-- (3) 모든 고객의 이름, 주소
SELECT NAME, ADDRESS FROM CUSTOMER;

-- (4) 2014년7월4일 ~ 7월7일사이에 주문받은 도서의 주문번호
SELECT ORDERID FROM ORDERS WHERE ORDERDATE BETWEEN '14/07/04' AND '14/07/07';

-- (5) 2014년7월4일 ~ 7월7일사이에 주문받은 도서를 제외한 도서의 주문번호
SELECT ORDERID FROM ORDERS WHERE ORDERDATE NOT BETWEEN '14/07/04' AND '14/07/07';

-- (6) 성이‘김’씨인 고객의 이름과 주소
SELECT NAME, ADDRESS FROM CUSTOMER WHERE NAME LIKE '김%';

-- (7) 성이‘김’씨이고 이름이‘아’로 끝나는 고객의 이름과 주소
SELECT NAME, ADDRESS FROM CUSTOMER WHERE NAME LIKE '김%아';
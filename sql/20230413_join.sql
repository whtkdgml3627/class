-- 2023.04.13
-- JOIN
-- from에 ,를 통해서 join을 한다.

-- CROSS JOIN
-- 테이블을 붙이고 결과 행은 모든 경우의 수를 출력 -> n * m
-- emp, dept -> 14 * 4 = 56개의 행
select *
from emp, dept;

-- cross join
select *
from emp cross join dept;

-- where로 동일한 값이 있는것만 출력해주는 where문
select *
from emp, dept
where emp.deptno=dept.deptno
order by emp.deptno;

-- equi join
select empno, e.deptno, d.deptno, dname
from emp e, dept d
where e.deptno=d.deptno;

-- equi join
-- inner join 은 조건문을 where가 아니라 on으로 사용한다
select *
from emp inner join dept
on emp.deptno=dept.deptno;

select *
from emp e join dept d
on e.deptno=d.deptno;

select *
from emp e join dept d
using(deptno);

-- natural join
-- 
select *
from emp natural join dept;

-- 이름이 SCOTT인 사람의 부서명을 출력해봅시다.
select deptno
from emp
where ename='SCOTT';
-- 20
select dname
from dept
where deptno=20;

-- JOIN으로 해결
select ename, dname
from emp e, dept d
where e.deptno=d.deptno and ename='SCOTT';

-- 사원별 급여 등급 표현
select * from salgrade;
select e.ename, s.grade, s.losal, e.sal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

-- self Join : 자기 자신의 테이블을 조인하는 경우
-- 각 사원의 이름과 각 사원의 매니저 이름을 출력
select e.ename, m.ename
from emp e, emp m
where e.mgr=m.empno;

-- outer join : 조건에 만족하지 않는 행도 출력하는 join
select e.ename, nvl(m.ename, '없음')
from emp e, emp m
where e.mgr=m.empno(+);

select *
from emp e join emp m
on e.mgr=m.empno;

select *
from emp e left outer join emp m
on e.mgr=m.empno;

-- 도서 판매 정보 출력
select * from orders;

select o.orderid, c.name, b.bookname, o.saleprice, o.orderdate
from orders o, customer c, book b
where o.custid=c.custid and o.bookid=b.bookid;

select *
from orders o natural join customer c natural join book b;













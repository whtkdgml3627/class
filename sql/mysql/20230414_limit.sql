-- 2023.04.19
-- mysql limit
-- 순서 뽑아와서 출력

select ename, hiredate from emp order by hiredate;

-- limit index, count
select ename, hiredate from emp order by hiredate limit 0, 3;
select ename, hiredate from emp order by hiredate limit 3, 3;
select ename, hiredate from emp order by hiredate limit 6, 3;
select ename, hiredate from emp order by hiredate limit 9, 3;
select ename, hiredate from emp order by hiredate limit 12, 3;
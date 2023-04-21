
-- DEPT MANAGER

-- 1. List
select * from dept;

-- 2. Search
select * from dept where deptno=10;
-- select * from dept where depnot=?
select * from dept where dname like '%A%';
select * from dept where dname='ACCOUNTING';
-- select * from dept where dname=?

-- 3. Insert
insert into dept values (50, 'Test', 'Seoul');
-- insert into dept values (?, ?, ?)
rollback;

-- 4. Update
update dept set dname = 'AAAA', loc = 'BBB' where deptno=60;
-- update dept set dname=?, loc=? where deptno=?
rollback;

















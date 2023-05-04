drop table IF EXISTs dept01;

CREATE TABLE `dept01` (
  `deptno` int NOT NULL AUTO_INCREMENT,
  `dname` varchar(100)  NOT NULL,
  `loc` varchar(100)  NOT NULL,
  PRIMARY KEY (`deptno`)
);

-- list
SELECT * FROM dept01;
-- SELECT * FROM dept01

-- register
INSERT INTO DEPT01 (DNAME, LOC) VALUES ('TEST', 'LOCTEST');
-- INSERT INTO DEPT01 (DNAME, LOC) VALUES (?, ?)

-- delete
DELETE from DEPT01 where deptno=5;
-- DELETE from DEPT01 where deptno=?

select * from emp, dept where emp.deptno=dept.deptno;
create or replace view company
as
select deptno, empno, ename, job, hiredate
from emp;

-- list
select * from company order by deptno;

-- insert
insert into company values (10, 9999, 'TEST', 'TEST', '2023-05-04');
-- insert into company values (?, ?, ?, ?, ?)










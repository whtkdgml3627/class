-- 2023.04.18
-- DML : 입력, 수정, 삭제
-- Create(insert), Read(select), Update(update), Delete(delete) -> CRUD

-- INSERT : 데이터를 행 단위로 입력

-- 테스트 테이블 생성
DROP TABLE DEPT01;
CREATE TABLE DEPT01 (
    DEPTNO NUMBER(2) CONSTRAINT PK_DEPT01_DEPTNO PRIMARY KEY,
    DNAME VARCHAR2(10) NOT NULL,
    LOC VARCHAR2(10)
);
DESC DEPT01;

-- INSERT INTO 테이블이름 (컬럼, 컬럼, ...) VALUES (데이터, 데이터, ....);
INSERT INTO DEPT01 (DEPTNO, DNAME, LOC) VALUES (10, 'TEST', 'TEST-LOC');
INSERT INTO DEPT01 (LOC, DNAME, DEPTNO) VALUES ('서울', '개발팀', 20);
INSERT INTO DEPT01 (DEPTNO, DNAME, LOC) VALUES (30, 'QA', '서울', 'MEMO');
INSERT INTO DEPT01 (DEPTNO, DNAME) VALUES (30, 'QA');
-- 오류
INSERT INTO DEPT01 (DEPTNO, DNAME, LOC) VALUES (30, 'QA');
-- 오류
INSERT INTO DEPT01 (DEPTNO, DNAME) VALUES (NULL, NULL);
-- 오류 : NOT NULL 제약이 있는 컬럼은 반드시 데이터를 입력 해주어야 한다.
INSERT INTO DEPT01 (DEPTNO, LOC) VALUES (30, '제주');

-- 모든 컬럼에 데이터를 입력하는 경우 -> 컬럼명을 생략하고 사용
INSERT INTO DEPT01 VALUES (40, '기획팀', '대전');

-- NULL 값의 입력
-- 명시적 입력
INSERT INTO DEPT01 VALUES (50, 'TEST', NULL);
INSERT INTO DEPT01 VALUES (70, 'TEST', '');
-- 암묵적 입력
INSERT INTO DEPT01 (DEPTNO, DNAME) VALUES (60, 'Test123');

SELECT * FROM DEPT01;

-- 서브쿼리를 이용한 데이터 입력
CREATE TABLE DEPT02 AS SELECT * FROM DEPT WHERE 1=0;
DESC DEPT02

INSERT INTO DEPT02 SELECT * FROM DEPT;
SELECT * FROM DEPT02;

-- update : 행단위 컬럼들의 데이터를 변경 -> 해당 컬럼의 값을 입력/수정/삭제
-- update 테이블이름 set 컬럼명1=새로운값, 컬럼명2=새로운값, ... where 행을 선택하는 조건;
drop table emp01;
create table emp01 as select * from emp;
select * from emp01;

-- 특정행을 수정할 경우 where의 조건으로 행을 선택
-- 부서번호가 10번인
-- 사원의 부서번호를 30번으로 수정합시다.
update emp01 set deptno=30 where deptno=10;

-- 2. 급여가 3000 이상인 사원만
-- 급여를 10% 인상합시다
update emp01 set sal=sal*1.1 where sal>=3000;

-- 3. 1987년에 입사한 사원의 입사일이 오늘로 수정합시다.
update emp01 set hiredate=sysdate where substr(hiredate, 1, 2) = '87';

-- SCOTT 사원의 부서번호는 20번으로, 직급은 MANAGER로 한꺼번에 수정하도록 합시다.
update emp01 set deptno=40, job='MANAGER' where ename='SCOTT';

-- SCOTT 사원의 입사일자는 오늘로, 급여를 50 으로 커미션을 4000 으로 수정합시다.
update emp01 set hiredate=sysdate, sal=50, comm=4000 where ename='SCOTT';

-- 20번 부서의 지역명을 40번 부서의 지역명으로 변경하기 위해서 서브 쿼리문을 사용해 봅시다. 
select * from dept02;
select loc from dept02 where deptno=40;
update dept02
set loc = (select loc from dept02 where deptno=40) where deptno=20;

-- 서브 쿼리를 이용해서
-- 부서 번호가 20인 부서의 부서명과 지역명을
-- 부서 번호가 30번인 부서와 동일하게 변경하도록 해 봅시다. 
select * from dept02;
select dname, loc from dept02 where dept02=30;
update dept02
set (dname, loc) = (select dname, loc from dept02 where deptno=30) where deptno=20;

-- delete : 테이블의 행 단위 삭제
-- delete from 테이블이름 where 행을 선택 하는 조건
select * from dept01;
-- dept01 테이블의 모든 행을 삭제, 모든 부서정보를 삭제
delete from dept01;

select * from dept02;
-- 부서 테이블 dept02에서 30번 부서만 삭제
delete from dept02 where deptno=30;

select * from dept02;
select * from emp01;
-- 사원 테이블에서 부서명이 SALES인 사원을 모두 삭제해봅시다.
select deptno from dept02 where dname='SALES';
delete from emp01 where deptno=(select deptno from dept02 where dname='SALES');

-- sequence : 연속된 숫자를 생성해주는 객체
-- create sequence 이름 [옵션]
drop sequence seq_dept_deptno;
create sequence seq_dept_deptno
start with 10
increment by 10;

-- 자동 생성된 값 : 시퀀스객체이름.nextval

select seq_dept_deptno.nextval from dual;
insert into dept01 values (seq_dept_deptno.nextval, 'text이름', 'test위치');
select * from dept01;
select seq_dept_deptno.currval from dual;


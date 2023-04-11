-- 2023.04.11
-- SELECT 수업

-- 현재 로그인 되어있는 사용자의 모든 TABLE 정보를 노출하는 명령어
SELECT * FROM TAB;
-- SELECT * FROM EMP;
-- SELECT EMPNO FROM EMP;

-- 테이블 정보 확인을 위한 명령어
-- 문자열을 사용하는 명령어 VARCHAR2(ORACLE)
DESC emp;
DESC dept;

-- emp TABLE
-- 이름       널?       유형           
-------- -------- ------------ 
-- EMPNO    NOT NULL NUMBER(4)    사원번호
-- ENAME             VARCHAR2(10) 사원이름
-- JOB               VARCHAR2(9)  직급, 업무
-- MGR               NUMBER(4)    상사코드 (EMPNO)
-- HIREDATE          DATE         입사일
-- SAL               NUMBER(7,2)  급여
-- COMM              NUMBER(7,2)  수당, 보너스
-- DEPTNO            NUMBER(2)    부서번호

-- dept TABLE
-- 이름     널?       유형           
-------- -------- ------------ 
-- DEPTNO NOT NULL NUMBER(2)    부서번호
-- DNAME           VARCHAR2(14) 부서명
-- LOC             VARCHAR2(13) 근무지역

-- 데이터 추출하는 질의어 : SELECT
-- SELECT 컬럼이름, 컬럼이름, 컬럼이름 ... FROM 테이블이름{VIEW도 사용이 가능하다.};
-- SELECT * FROM 테이블이름; > 전체컬럼을 다 가져옴
-- 명령어(키워드), 테이블명(객체이름)은 대,소문자를 가리지 않는다.
-- 테이블에 저장된 데이터들은 비교하거나 찾을 때 대,소문자를 구분한다.
SELECT * FROM DEPT;
select * from dept;

-- 엔터를 쳐서 개행시켜도 세미콜론까지의 명령어를 실행한다.
-- 특정 컬럼의 데이터만 검색
SELECT  dname --, deptno, loc
FROM dept
;




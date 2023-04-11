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

-- select 구문의 프리젠테이션영역에 테이블이 가지는 컬럼뿐 아니라 연산(함수)의 결과를 새로운 컬럼으로 출력
select sal, sal+100, sal-100, sal*10, sal/2 from emp;
select sal+100 from emp;
select sal-100 from emp;
select sal*10 from emp;
select sal/2 from emp;

-- 사원테이블에서 사원의 이름과 급여, 연봉계산 결과를 출력 (연봉의 계산은 급여*12)
select ename, sal, sal*12+500 from emp;

-- 상여금 계산 > sal*12+comm
-- null의 연산결과는 null이 나온다
select sal, comm, sal*12+comm from emp where comm is not null;
select sal, comm, nvl(comm,0), sal*12+nvl(comm,0) from emp;

-- 컬럼의 이름에 별칭 부여
-- 컬럼뒤에 as 키워드를 쓰고 별칭을 작성
select sal, comm, nvl(comm,0) as comm1, sal*12+nvl(comm,0) as yearSal from emp;

-- 문자열의 연산 > 문자열을 붙여준다 : 문자열 || 문자열
select ename || ' is a ' || job as person from emp;

-- select [distinct] from ...
-- distinct의 역할 : 중복값을 제거하고 값을 하나만 출력해야할 때 사용
select deptno from emp;
select distinct deptno from emp;
select job from emp;
select distinct job from emp;

-- 원하는 행 검색
-- where 절을 사용한다.
-- select ... from ... where 조건식;
-- 급여가 3000 이상인 사원의 정보 리스트
select * from emp where sal >= 3000;

-- = : 컬럼의 데이터가 같은지 비교 (JAVA의 == 와 동일)
-- 10번 부서에 소속된 사원들의 정보를 출력
select ename, job, deptno from emp where deptno = 10;

-- 다음은 이름이 FORD인 사원의 사원번호(EMPNO)과 사원이름(ENAME)과 급여(SAL)을 출력
-- 문자열 비교 > '' 작은 따옴표 사용
select empno, ename, sal from emp where ename = 'FORD';

-- 날짜를 비교할 때에도 홑 따옴표를 사용한다.
select * from emp where hiredate = '1981-12-03';
-- 날짜를 크다 작다로 이후 이전을 비교해줄 수 있다.
select * from emp where hiredate > '1981-12-03';

-- 논리연산자 : AND, OR, NOT
-- 10번부서의 매니저가 누구인지 찾아보자
select * from emp where deptno=10 and job='MANAGER';
select * from emp where deptno=10 or job='MANAGER';
select * from emp where not deptno=10;
select * from emp where deptno<>10;
select * from emp where deptno!=10;

-- 2000에서 3000 사이의 급여를 받는 사원
select * from emp where sal>=2000 AND sal<=3000;
-- 범위 연산자 : 컬럼명 BETWEEN A AND B = A이상 B이하 / 작은 값 먼저 작성 and 큰 값
select * from emp where sal between 2000 and 3000;

-- 범위 연산자의 연산은 날짜도 가능하다. : 날짜는 홑 따옴표로 정의
-- 1987년에 입사한 사원 > 1987-01-01
select * from emp where hiredate BETWEEN '1980-01-01' and '1981-12-31';
select * from emp where hiredate not BETWEEN '1980-01-01' and '1981-12-31';

-- 10번, 20번, 30번 부서에 소속한 사원의 정보를 출력
select * from emp where deptno=10 or deptno=20 or deptno=30;
-- 컬럼명 in(값1, 값2, 값3, ...)연산자 : or의 연산을 간단하게 처리 // in()안에 select로 불러올 수 있다.
-- 컬럼 = 컬럼=값1 or 컬럼=값2 or 컬럼=값3 or ...
select * from emp where deptno in(10,20,30);
select * from emp where deptno not in(10,20);

-- 패턴 검색 : 문자열의 패턴을 검색할 때 > 컬럼 LIKE '패턴';
-- 패턴 형식 : % (어떤 문자열이 와도 상관 없음) > '%java%' java 문자열을 포함하는 문자열 ----------- 검색에서 가장 많이 쓰인다.
-- 패턴 형식 : 언더바 _한자리 __두자리 ___세자리 (_언더바의 개수만큼 자리수가 올 수 있음) > '__A' 앞 두자리는 어떤 문자가 와도 상관없고 A로 끝나는 세자리 문자열
-- F로 시작하는 이름의 사원 리스트
select * from emp where ename like 'F%';
-- 이름에 A를 포함하는 사원 리스트 : '%A%';
select * from emp where ename like '%A%';
select * from emp where ename not like '%A%';
-- 이름이 N으로 끝나는 사원의 리스트 : '%N'; '%.pdf'; pdf파일 출력할 때
select * from emp where ename like '%N';

-- 사원 이름중 두번째 문자가 A인 사원 리스트
select * from emp where ename like '_A%';
select * from emp where ename like '__R%';  -- 세번째문자가 R
select * from emp where ename like '%R_';   -- 끝에서 두번째 문자가 R

-- NULL 여부를 판단하는 IS NULL / IS NOT NULL
-- 커미션이 등록되지 않은 사원 리스트 > comm이 null인 사원
-- select * from emp where comm=null; -- 무조건 false이기 때문에 행을 아무것도 찾지 못한다.
select * from emp where comm is null;
-- 커미션이 등록되어 있는 사원 리스트 > comm이 null이 아닌 사원
select * from emp where comm is not null;
-- 커미션을 받지 못하는 사원 > comm이 null이거나 0인 사원
select * from emp where comm is null or comm=0;
select * from emp where not (comm is null or comm=0);
select * from emp where comm is not null and comm>0;

-- select의 출력 결과의 정렬 : 오름차순 asc (생략가능), 내림차순 desc
-- select ... from ... where ... order by 컬럼이름 (asc[생략가능],desc)
-- 급여순 (오름차순)으로 사원 리스트 출력
select * from emp ORDER BY sal;
select * from emp ORDER BY sal desc;

-- 문자 정렬
-- 이름 순
select * from emp order by ename;

-- 날짜
-- 입사일 빠른 순서대로 정렬
select * from emp order by hiredate;
-- 최근 입사일 기준으로 정렬 : 내림차순
select * from emp order by hiredate desc;

-- 급여순으로 정렬
select * from emp order by sal, ename desc;



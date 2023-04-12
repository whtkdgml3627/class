-- 2023.04.12
-- 함수

desc dual;
select * from dual;

-- 단일 행 함수 / 집합(그룹) 함수
-- 단일 행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수들이 있다.

-- 숫자 함수
-- 절대값 abs
select 10, -10, abs(-10), abs(10) from dual;

-- floor : 소수점 아래를 절사
select 2.1, 2.9, floor(2.1), floor(2.9) from dual;

-- round : 지정 위치에서 반올림 처리 (데이터, 자릿수)
select 1234.567, round(1234.567), round(1234.567, 1), round(1234.567, -1) from dual;

-- trunc : 지정 위치에서 아래를 절사
select 1234.567, trunc(1234.567), trunc(1234.567, 1), trunc(1234.567, -1) from dual;

-- mod : 나머지 연산 자바의 %와 같음 / 13%2 와 같이 나눌 수를 뒤에 사용해서 나머지 구함
select mod(1,3), mod(2,3), mod(0,3), mod(13,0) from dual;

select * from emp where ename=upper('scott');
-- 문자 함수
-- lower() : 문자열 모두를 소문자로 변경
select 'SCOTT', lower('SCOTT') from dual;
select dname, lower(dname) from dept;

-- upper() : 문자열 모두를 대문자로 변경
select 'scott', upper('scott') from dual;

-- substr : 문자열을 추출
-- substr(원본데이터, 시작위치)
-- substr(원본데이터, 시작위치, 반환할 문자의 개수)
select '안녕하세요. 손흥민 입니다.', substr('안녕하세요. 손흥민 입니다.' , 5), substr('안녕하세요. 손흥민 입니다.', 2, 8)
from dual;

-- length(원본문자열) : 문자열의 개수
select length('안녕하세요.!!!!') from dual;


-- 문자열에서 특정 자리수를 지정하고 자리에 데이터가 없을 때 패턴을 입력
-- 00010
-- lpad(원본데이터, 자릿수, 넣어줄 데이터) = rpad도 동일
select '10', lpad('10', 10, 0), rpad('11', 5, '*') from dual;
select lpad(deptno, 5, 0) from dept;

-- trim() : 공백 제거
select '     ABC     ', trim('     AAA     '), trim('     AAA'), trim('AAA     ') from dual;

-- replace() : 문자열을 바꿔준다
-- replace(원본데이터, 바꿀문자열, 바꿔서 넣어줄 데이터)
select 'Steven KING', replace('Steven KING', 'Steven', 's.'), replace('Steven KING', 'Steven ', '') from dual;

-- 날짜 함수
select sysdate from dual;

select sysdate, months_between('23/12/12', sysdate) from dual;
select add_months(sysdate, 8) from dual;
select add_months(sysdate, -1) from dual;
select add_months(sysdate, -3) from dual;
select add_months(sysdate, -6) from dual;
select next_day(sysdate, 1) from dual;
select last_day(sysdate) from dual;
select round(sysdate) from dual;
select trunc(sysdate) from dual;

-- 변환 함수
-- DATE -> CHAR
-- to_char(원본, '패턴')
select sysdate,
        to_char(sysdate, 'YYYY-MM-DD'),
        to_char(sysdate, 'YYYY.MM.DD'),
        to_char(sysdate, 'YYYYMMDD'),
        to_char(sysdate, 'YYYY-MM-DD DAY'),
        to_char(sysdate, 'YYYY.MM.DD. HH24:MI:SS')
from dual;

-- NUMBER -> CHAR
select  123456789,
        to_char(123456789, '000000000000'),
        to_char(123456789, '000,000,000,000'),
        to_char(123456789, '999999999999'),
        to_char(123456789, '999,999,999,999'),
        to_char(123456789, 'L999,999,999,999'),
        to_char(3456789, '999,999')
from dual;

select ename, sal, to_char(sal*1300, 'L999,999,999') as wonSal from emp order by wonSal;

-- CHAR -> DATE
-- to_date('문자열', '패턴')
select * from emp
where hiredate = to_date('1981.02.20', 'YYYY.MM.DD');
-- to_date('19810220', 'YYYYMMDD');

insert into emp values(9999, 'SON', 'MANAGER', 7782, to_date('2023-04-12', 'YYYY-MM-DD'), 4000, null, 10);
select * from emp;
rollback; -- 마지막 commit 시점으로 복귀

-- CHAR -> NUMBER
-- to_number('문자열', '패턴') -> 숫자 타입
select '20000'-'10000' from dual; -- 자동 형변환
select '20,000'-'10,000' from dual; -- 연산 불가능
-- to_number 사용하여 숫자타입으로 변경 후 패턴 작성
select to_number('20,000', '999,999,999')-to_number('10,000', '99,999') from dual;

-- decode 함수 -> = 비교 연산 후 결과를 출력하는 함수 switch~case 함수와 같은 역할

select ename, deptno,
        decode(deptno,
                10, 'ACCOUNTING',
                20, 'RESEARCH',
                30, 'SALES',
                40, 'OPERATIONS'
        ) as dname
from emp order by deptno;

-- 8. 직급에 따라 급여를 인상하도록 하자. 직급이 'ANAlYST'인 사원은 5%, 'SALESMAN'인 사원은 10%,
-- 'MANAGER'인 사원은 15%, 'CLERK'인 사원은 20%인 인상한다.
select ename, job, sal,
        decode(job,
                'ANALYST', sal+sal*0.05,
                'SALESMAN', SAL+SAL*0.1,
                'MANAGER', SAL+SAL*0.15,
                'CLERK', SAL+SAL*0.2
        ) as sal1,
        nvl (decode(job,
                'ANALYST', sal+sal*0.05,
                'SALESMAN', SAL+SAL*0.1,
                'MANAGER', SAL+SAL*0.15,
                'CLERK', SAL+SAL*0.2
        ), sal) as sal2
from emp order by sal2;

select ename, deptno,
        decode(deptno,
                10, 'ACCOUNTING',
                20, 'RESEARCH',
                30, 'SALES',
                40, 'OPERATIONS'
        ) as dname,
        case when deptno=10 then 'ACCOUNTING'
            when deptno=20 then 'RESEARCH'
            when deptno=30 then 'SALES'
            else 'OPERATIONS'
        end as dname2
from emp order by deptno;

-- 그룹함수, 집합함수, 집계함수, 다중행 함수
-- 하나의 행이 아닌 다중행을 그룹으로 묶어서 처리
-- sum(합), avg(평균), count(행의 개수 / 컬럼의 null이 있으면 건너뛴다), max, min

-- 급여 총액 구하기
select sum(sal), to_char(sum(sal*1300), 'L999,999,999') from emp;

-- 커미션의 총합
select sum(comm), count(comm), avg(comm) from emp;
select comm from emp where comm is not null;

-- 평균 급여
select avg(sal), trunc(avg(sal)), round(avg(sal)) from emp;

-- 최대 급여 max(), 최소 급여 min()
select max(sal), min(sal) from emp;

-- count() -> 행의 개수
-- 전체 사원의 수
select count(*) from emp;
-- 10번 부서의 사원 수
select count(*) from emp where deptno=10;
-- 부서의 개수
select count(*) from dept;
select job from emp order by job;
-- distinct로 중복 제거
select count(distinct job) from emp;
-- null은 출력 안됨
select count(comm) from emp;

select * from emp order by deptno;

-- group by -> 행 단위로 그룹핑
select deptno, 
        count(*) as "사원의수",
        sum(sal) as "총급여액",
        trunc(avg(sal)) as "평균급여액",
        max(sal) as "최고급여액",
        min(sal) as "최소급여액",
        count(comm) as "커미션을받는사원수"
from emp
group by deptno
having avg(sal)>=2000 -- 그룹핑된 데이터의 집합함수 결과를 조건식으로 만들 때 사용
order by deptno;
-- group by로 그룹핑을 하고 난 다음 그룹핑 된 행의 조건식을 사용하려면 where가 아니라 having를 사용한다
-- having는 group by 뒤에 사용한다.

select job
from emp
group by job
order by job;













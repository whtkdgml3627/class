-- 2023.04.14
-- 서브쿼리 문제

-- 43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.
select ename, job
from emp
where job in (select job from emp where empno=7788);
-- select job from emp where empno=7788;

-- 44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 담당 업무
select ename, job
from emp
where sal > (select sal from emp where empno=7499);
-- select sal from emp where empno=7499;

-- 45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
select ename, job, sal
from emp
where sal=(select min(sal) from emp);
-- select min(sal) from emp;

-- 46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
-- mysql에서는 오류라고 나온다.. 이유를 모르겠다..
select job, avg(sal)
from emp
group by job
having avg(sal) = (select min(avg(sal)) from emp group by job);
select min(avg(sal)) from emp group by job;




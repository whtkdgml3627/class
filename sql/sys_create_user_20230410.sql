--  2023.04.10
--  주석


--  사용자 생성

ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

-- SHOW USER;

-- 1. 다른사용자 > 팝업메뉴 > 사용자 생성
-- 2. 계정이름 c##himedia > c##을 생략하기 위해서는
-- ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE; 를 실행시켜주어야 한다.
-- 실행하면 c## 생략하고 사용자 생성가능
-- 3. 권한 부여 : CONNECT, RESOURCE 두 곳에 권한 부여 (부여된 롤탭)
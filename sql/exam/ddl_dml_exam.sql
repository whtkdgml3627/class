-- 2023.04.18
-- DDL / DML EXAM

DROP TABLE PHONEINFO_BASIC;
DROP TABLE PHONEINFO_UNIV;
DROP TABLE PHONEINFO_COM;


CREATE TABLE PHONEINFO_BASIC (
    IDX NUMBER(6) CONSTRAINT PK_PHONEINFO_BASIC_IDX PRIMARY KEY,
    FR_NAME VARCHAR2(20) NOT NULL,          -- 친구 이름
    FR_PHONENUMBER VARCHAR2(20) NOT NULL,   -- 친구 전화번호
    FR_EMAIL VARCHAR2(20),                  -- 친구 이메일
    FR_ADDRESS VARCHAR2(20),                -- 친구 주소
    FR_REGDATE DATE DEFAULT SYSDATE         -- 등록 시간
);

-- SEQUENCE 생성
CREATE SEQUENCE SEQ_PBASIC_IDX;
DROP SEQUENCE SEQ_PBASIC_IDX;

CREATE TABLE PHONEINFO_UNIV (
    IDX NUMBER(6) CONSTRAINT PK_PHONEINFO_UNIV_IDX PRIMARY KEY,
    FR_U_MAJOR VARCHAR(20) DEFAULT 'N' NOT NULL,                                -- 대학친구의 전공 정보
    FR_U_YEAR NUMBER(1) DEFAULT '1' CHECK (FR_U_YEAR BETWEEN 0 AND 5) NOT NULL, -- 대학친구의 학년
    FR_REF NUMBER(6) REFERENCES PHONEINFO_BASIC(IDX) NOT NULL                   -- 친구의 기본 정보 외래키
);

-- SEQUENCE 생성
CREATE SEQUENCE SEQ_PUNIV_IDX;
DROP SEQUENCE SEQ_PUNIV_IDX;

CREATE TABLE PHONEINFO_COM (
    IDX NUMBER(6) CONSTRAINT PK_PHONEINFO_COM_IDX PRIMARY KEY,
    FR_C_COMPANY VARCHAR2(20) DEFAULT 'N' NOT NULL,             -- 회사친구의 회사이름
    FR_REF NUMBER(6) REFERENCES PHONEINFO_BASIC(IDX) NOT NULL   -- 친구의 기본 정보 외래키
);

-- SEQUENCE 생성
CREATE SEQUENCE SEQ_PCOM_IDX;
DROP SEQUENCE SEQ_PCOM_IDX;

-- INSERT로 행에 값 대입
-- PHONEINFO_BASIC
INSERT INTO PHONEINFO_BASIC VALUES (SEQ_PBASIC_IDX.NEXTVAL, 'SON', '010-1111-1111', 'SON@GMAIL.COM', '영국', '2023-04-15');
INSERT INTO PHONEINFO_BASIC (IDX, FR_NAME, FR_PHONENUMBER) VALUES (SEQ_PBASIC_IDX.NEXTVAL, 'KING', '010-2222-2222');

-- PHONEINFO_UNIV
INSERT INTO PHONEINFO_UNIV VALUES (SEQ_PUNIV_IDX.NEXTVAL, '체육', 2, SEQ_PBASIC_IDX.CURRVAL);
INSERT INTO PHONEINFO_UNIV (IDX, FR_U_MAJOR, FR_REF) VALUES (SEQ_PUNIV_IDX.NEXTVAL, '경영', SEQ_PBASIC_IDX.CURRVAL);

-- PHONEINFO_COM
INSERT INTO PHONEINFO_COM VALUES (SEQ_PCOM_IDX.NEXTVAL, '하이미디어', SEQ_PBASIC_IDX.CURRVAL);
INSERT INTO PHONEINFO_COM (IDX, FR_REF) VALUES (SEQ_PCOM_IDX.NEXTVAL, SEQ_PBASIC_IDX.CURRVAL);

COMMIT;
-- SELECT로 테이블 읽기
-- PHONEINFO_BASIC
SELECT * FROM PHONEINFO_BASIC;

-- PHONEINFO_UNIV
SELECT * FROM PHONEINFO_UNIV;

-- PHONEINFO_COM
SELECT * FROM PHONEINFO_COM;


-- UPADATE로 테이블 값 변경
-- PHONEINFO_BASIC
UPDATE PHONEINFO_BASIC
SET FR_NAME='LEE' WHERE FR_NAME='KING';

-- PHONEINFO_UNIV
UPDATE PHONEINFO_UNIV
SET FR_U_YEAR=3 WHERE IDX=22;

-- PHONEINFO_COM
UPDATE PHONEINFO_COM
SET FR_C_COMPANY='네이버' WHERE FR_REF=2;

-- DELETE로 테이블 행 삭제
-- PHONEINFO_BASIC
DELETE PHONEINFO_BASIC WHERE IDX=2;

-- PHONEINFO_UNIV
DELETE PHONEINFO_UNIV WHERE FR_U_MAJOR='경영';

-- PHONEINFO_COM
DELETE PHONEINFO_COM WHERE FR_REF=2;

ROLLBACK;
commit;

delete from emp;
select * from emp;

delete from emp01;
select * from emp01;

rollback;
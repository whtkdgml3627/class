CREATE TABLE `member` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `uid` varchar(45)  NOT NULL,
  `pw` varchar(45) NOT NULL,
  `uuid` varchar(45) DEFAULT NULL,
  `uname` varchar(45) NOT NULL,
  `uphoto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idx`),
  UNIQUE KEY `uid_UNIQUE` (`uid`)
);

-- LIST
SELECT * FROM MEMBER;

-- INSERT
INSERT INTO `member`
(`uid`, `pw`, `uname`, `uphoto`)
VALUES ('cool', '1111', 'COOL', 'photo.jpg');
-- INSERT INTO member (uid, pw, uname, uphoto) VALUES (?, ?, ?, ?)

-- SELECT : 로그인처리 -> uid/pw 비교해서 질의
SELECT * FROM MEMBER WHERE UID='cool' AND PW='1111';
-- MemberDTO 데이터 저장
SELECT idx, uid, uname, uphoto FROM MEMBER WHERE uid='cool' AND pw='1111';
-- SELECT idx, uid, uname, uphoto FROM MEMBER WHERE uid=? AND pw=?

------------------------------------------------------------------------------------------------------------
select deptno, empno, ename, job, hiredate from emp01 order by deptno;
-- select deptno, empno, ename, job, hiredate from emp01 order by deptno













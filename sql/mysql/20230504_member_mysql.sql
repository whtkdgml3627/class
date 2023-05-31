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

select count(*) from member where uid='cool123';
-- select count(*) from member where uid=?
INSERT INTO `tbl_board` VALUES (1,'게시글 테스트1','글쓰기 테스트 1',1,NULL,'2023-05-23','2023-05-23'),(3,'손흥민 로그인 글쓰기 수정','로그인 후 글 수정',3,'ee6e020e-2e32-45c3-800e-8ef5eda239e5mini.jpg','2023-05-23','2023-05-23');














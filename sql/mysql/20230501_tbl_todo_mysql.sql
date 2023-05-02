CREATE TABLE `tbl_todo` (
  `tno` int NOT NULL AUTO_INCREMENT,
  `todo` varchar(100)  NOT NULL,
  `duedate` date DEFAULT (curdate()),
  `finished` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`tno`)
);

insert into tbl_todo values ();
-- DML INSERT
INSERT INTO tbl_todo (todo, duedate) VALUES ('JSP 공부', '2023-05-05');
-- INSERT INTO tbl_todo (todo, duedate) VALUES (?, ?)

-- DML UPDATE
UPDATE tbl_todo SET todo='청소', duedate='2023-05-03', finished=false WHERE tno=2;
-- UPDATE tbl_todo SET todo=?, duedate=?, finished=? WHERE tno=?

-- DML DELETE
DELETE from tbl_todo where tno=8;
-- DELETE from tbl_todo where tno=?

-- DQL SELECT
-- LIST
SELECT * FROM tbl_todo;
-- SELECT * FROM tbl_todo
-- 상세보기 VIEW, 수정 UPDATE-VIEW
SELECT * FROM tbl_todo where tno=2;
-- SELECT * FROM tbl_todo where tno=?

COMMIT;
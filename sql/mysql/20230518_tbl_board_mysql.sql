create table tbl_board (
                           bno INT,
                           title varchar(200) not null,
                           content varchar(2000) not null,
                           writer varchar(50) not null,
                           regdate date default (now()),
                           updatedate date default (now())
);
alter table tbl_board add constraint pk_board primary key (bno);

create table tbl_reply (
                           rno INT,
                           bno INT not null,
                           reply varchar(1000) not null,
                           replyer varchar(50) not null,
                           replyDate date default (now()),
                           updateDate date default (now())
);
alter table tbl_reply add constraint pk_reply primary key (rno);
alter table tbl_reply add constraint fk_reply_board foreign key (bno) references tbl_board (bno);
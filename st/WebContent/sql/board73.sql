create table board73(
board_no number(20) primary key,
board_name varchar2(30) not null,
board_title varchar2(200) not null,
board_pwd varchar2(30) not null,
board_cont varchar2(4000) not null,
board_hit number(20) default 0,
board_date date
);

create sequence board73_no_seq
increment by 1 start with 1 nocache;

select * from board73 order by board_no desc;

desc board73;
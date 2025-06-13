--1번 문제 풀이는 테이블 생성
create table tbl_guestbook7( --방명록 테이블 생성
 gno int primary key -- 방명록 번호
 ,gname varchar2(50) not null -- 작성자
 , gtitle varchar(200) not null -- 제목
 , gcont varchar2(4000) not null --내용
 , gdate date default sysdate -- 등록날짜
);

select * from tbl_guestbook7 order by gno desc;

--생성된 테이블 구조 확인 명령어
desc tbl_guestbook7; --describe 테이블명;
describe tbl_guestbook7;

--2번문제 풀이
--gno_seq2  시퀀스 생성문
create sequence gno_seq2
start with 1 --1부터 시작
increment by 1 --1씩 증가
nocache
nocycle;

--생성된 시퀀스로 부터 다음 시퀀스 번호값 확인
select gno_Seq2.nextval as "다음시퀀스 번호값" from dual;

--4번 문제 풀이
select * from tbl_guestbook7 order by gno desc;

update tbl_guestbook7 set gname='수정 이순신', gtitle='수정 방명록 제목', gcont='수정 방명록 내용' where gno=2;










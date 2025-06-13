-- 오라클 db SQL문에서 한줄 주석문 기호
/*  한줄 이상 주석문 기호 */

--customer 테이블 생성
create table customer(
  cus_no number(38) primary key --고객번호, cus_no는 컬럼명(필드명) 이라고 한다. 이 컬럼명에 최종 고객번호가 저장된다.
  ,cus_name varchar2(50) not null --고객이름
  ,cus_phone varchar2(30) not null --고객 폰번호
  ,cus_email varchar2(100) not null --고객 이메일주소
  ,cus_date date --고객 등록날짜, default sysdate 제약조건을 주면 cus_date컬럼에 굳이 등록날짜값을 저장하지 않아도 기본값 날짜값이 오라
  --클 sysdate  날짜함수에 의해서 저장된다. default 제약조건은 기본값을 저장할 수 있게 해준다.
);

/* 오라클 자료형 종류)
 * number(38)은 최대자리수가 38자까지 정수 숫자값을 저장하는 타입
 * varchar2는 가변문자 타입
 * date는 날짜 타입
 * 
 * 제약조건이란 테이블 컬럼에 자료 저장시 어떤 제한을 가하는 것을 말한다.
 * 
 * 제약조건 종류)
 *  1.primary key -기본키 제약조건이다. 이 제약조건은 중복 자료 저장금지, null저장 금지
 *  2.not null --null저장금지 즉 반드시 자료를 입력해야 한다.
 *  해당 컬럼에 제약조건을 생략하면  기본값 null제약조건이다.
 */

--생성된 customer 테이블의 컬럼을 확인
select * from customer;--customer테이블의 모든 컬럼 데이터를 확인 검색하는 쿼리문이다. *는 모든 컬럼을 뜻한다.

/* 레코드란 테이블 컬럼에 저장된 한행의 자료 집합을 말한다.
 * 
 * 레코드 저장문 형식)
 * insert into 테이블명 (컬럼 목록) values(값);
 * 테이블의 모든 컬럼에 레코드 저장시에는 컬럼목록을 생략해도 된다. 하지만 원하는 컬럼에만 레코드를 저장할 때는 컬럼목록을 명시 코드해야
 * 한다.
 * 컬럼목록 순서와 values값 목록 순서는 일치해야 한다.
 * 문자열 레코드 저장시에는 ''(작은 따옴표)로 감싼다.
 * 
 * SQL문은 대소문자를 구분하지 않지만 컬럼에 저장된 영문 레코드는 대소문자를 구분한다.
 * 
 * 시퀀스 란? 번호 발생기 이다. 주로 고객번호나 게시판 번호 등 정수숫자 번호값 발생용도로 사용한다.
 * 시퀀스 특징)
 *  1.시퀀스 번호는 중복 번호가 없고 null없다. 그러므로 primary key 제약조건으로 설정되고 정수숫자 타입으로 지정된 컬럼 레코드값
 * 저장용도로 사용해야 한다.
 * 
 * 시퀀스 생성문법 형식)
 * create sequence 시퀀스명
 * start with 1 --1부터 시작, 기본값으로 생략가능
 * increment by 1 --1씩증가, 기본값으로 생략가능
 * nocache --임시 메모리를 사용하지 않겠다는 의미, 생략하면 기본값은 cache 20이다. 이것의 의미는 오라클에서 시퀀스 번호를 미리 20개
 * --까지 메모리에 올려 놓겠다는 뜻이다. 어제 마지막으로 발급된 시퀀스 번호가 100이라면 캐시에는 101~120까지 메모리에 있고, 다음 시퀀스
 * --번호값은 121부터 시작됨. 오늘 db가 재시작하면 캐시값은 초기화 된다.
 * nocycle; --시퀀스 최대값 또는 최소값에 도달하면 다시 처음부터 시퀀스 번호값을 반복하지 않겠다는 의미이다. 기본값으로 생략가능함
 */
--cus_seq라는 시퀀스를 생성
create sequence cus_seq
start with 1
increment by 1
nocache
nocycle;

--cus_seq 다음 시퀀스 번호값 확인 => 시퀀스이름.nextval
select cus_seq.nextval as "다음 시퀀스 번호값"  from dual;

select sysdate as "오늘 날짜와 시간값" from dual;

insert into  customer (cus_no,cus_name,cus_phone,cus_email,cus_date) values(cus_seq.nextval, '홍길동', '010-777-7777', 
'hong@gmail.com', sysdate);

/* 저장후 레코드 검색쿼리문 문법형식)
 *  select 컬럼목록(전체컬럼은 *) from 테이블명 where 조건식 order by 기준컬럼 desc(asc);
 *  
 * order by는 정렬문이다.
 * desc는 내침차순정렬을 해준다.
 * 내림차순 정렬 규칙)
 *  1.한글은 가나다 역순 2.영어는 알파벳 역순 3.숫자는 큰숫자 부터 먼저 정렬된다.
 * 
 * 오른차순 정렬은 asc문이다.기본값으로 생략가능하다. 오른차순 정렬은 내림차순의 역순이다. 
 */
--고객번호를 기준으로 내림차순 정렬
select * from customer order by cus_no desc;
 
--2번째 레코드 저장
insert into customer values(cus_seq.nextval, '이순신','010-999-9999','leeshin@naver.com',sysdate);

--3번째 레코드 저장
insert into customer values(cus_seq.nextval, '신사임당','010-888-8888','shin@gmail.com', sysdate);

/* 레코드 수정문 형식)
 *  update 테이블명
 *  set 컬럼명=변경할 값, 컬럼명=변경할 값 ...
 *  where 조건식;
 */
--2번 레코드의 고객이름과 폰번호, 이메일주소를 변경
update customer set cus_name='수정 홍길동', cus_phone='010-555-5555', cus_email='edithong@gmail.com' where cus_no=2;

--2번 고객번호를 검색
select cus_name, cus_phone, cus_email from customer where cus_no=2;

/* 레코드 삭제문 형식)
 *  delete from 테이블명  where 조건식;
 * from절문은 생략가능하다.
 */
select * from customer order by cus_no asc; --고객번호를 기준으로 오름차순 정렬

--4번 레코드를 삭제
delete from customer where cus_no = 4;

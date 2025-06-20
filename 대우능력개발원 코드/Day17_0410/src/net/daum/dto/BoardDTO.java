package net.daum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //기본생성자, canEqual(), equals(), getter(), hashCode(), setter(), toString()메서드가 자동으로 추가
@AllArgsConstructor //Constructor는 생성자란 뜻이고 @AllArgsConstructor 애노테이션을 사용하면 기본생성자는 사라지고 멤버변수개
//수만큼 초기화를 할수 있게 생성자가 오버로딩된 것이 자동으로 추가
public class BoardDTO {//게시판 데이터 저장빈 클래스 DTO

	private String writer;//글쓴이
	private String title;//글제목
	private String content;//글내용
	
}

package com.hi.app.domain;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserRequest {

	// 변수 선언은 파라미터 이름과 동일하게 선언
	private String keyword;
	private int tno;
	private int page;

}

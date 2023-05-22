package com.hi.board.mapper;

import com.hi.board.domain.member.MemberDTO;
import com.hi.board.domain.member.MemberRegistRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	// 로그인 select
	MemberDTO selectByUidPw(String uid, String pw);

	// 회원가입 insert
	int insertMember(MemberRegistRequest registRequest);

}

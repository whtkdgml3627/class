package com.hi.board.service;

import com.hi.board.domain.ReplyDTO;
import com.hi.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

@Service
public class ReplyReadService {

	private ReplyMapper replyMapper;

	public ReplyReadService(ReplyMapper replyMapper) {
		this.replyMapper = replyMapper;
	}

	public ReplyDTO getReply(int rno) {
		return replyMapper.selectByRno(rno);
	}
}

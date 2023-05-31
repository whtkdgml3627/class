package com.hi.board.service;

import com.hi.board.domain.ReplyDTO;
import com.hi.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

@Service
public class ReplyInsertService {

	private ReplyMapper replyMapper;

	public ReplyInsertService(ReplyMapper replyMapper) {
		this.replyMapper = replyMapper;
	}

	public int insertReply(ReplyDTO replyDTO) {
		return replyMapper.insertReply(replyDTO);
	}
}

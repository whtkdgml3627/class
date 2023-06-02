package org.zerock.bj2.mappers;


import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("select now()")
	String getTime();
}

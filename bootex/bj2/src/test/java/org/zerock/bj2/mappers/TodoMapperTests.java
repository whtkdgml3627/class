package org.zerock.bj2.mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj2.dto.TodoDTO;
import org.zerock.bj2.dto.TodoDTO2;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TodoMapperTests {
    
    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Autowired(required = false)
    private TodoMapper2 todoMapper2;


    @Test
    @Transactional
    public void insertTest(){

        Assertions.assertNotNull(todoMapper2, "Todo mapper2");

        TodoDTO2 dto = TodoDTO2.builder()
        .title("title")
        .content("test content")
        .writer("tester")
        .dueDate("2023-06-07")
        .build();

        int count = todoMapper2.insert(dto);

        Assertions.assertEquals(count, 1);
        
        log.info(("===================="));
        log.info(dto.getTno());
        log.info(("===================="));
    }


    @Transactional
    @Test
    public void testInsert(){

        Assertions.assertNotNull(todoMapper, "Todo mapper");

        TodoDTO todoDTO = TodoDTO.builder()
        .title("테스트 투두")
        .content("Test Content")
        .writer("user11")
        .dueDate("2023-06-07")
        .build();

        int count = todoMapper.insert(todoDTO);

        Assertions.assertEquals(count, 1);

        log.info("==============================");
        log.info(todoDTO.getTno());
        log.info("==============================");
        

    }
}

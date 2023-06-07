package org.zerock.bj2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO2 {
    
    private int tno;
    private String title;
    private String content;
    private String writer;
    private boolean complete;
    private String dueDate;

}

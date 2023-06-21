package com.study.restBoard.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private Boolean noticeYn;
}

package com.study.restBoard.post;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    /**
     * 게시글 저장
     * @param params - 게시글 정보
     */
    void save(PostRequest params);

    /**
     * 게시글 상세조회
     * @param id - seq
     * @return 게시글 상세정보
     */
    PostResponse findById(Long id);

    /**
     * 게시글 수정
     * @param params - seq
     */
    void update(PostRequest params);

    /**
     * 게시글 삭제(삭제처리)
     * @param id - seq
     */

    void deleteById(Long id);

    /**
     * 전체 리스트 조회
     */
    List<PostResponse> findAll();
}

package com.ou.mapper;

import com.ou.domain.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentsMapper {
    List<Comments> queryAll();
}

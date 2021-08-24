package com.ou.mapper;

import com.ou.domain.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
//    @Select("select * from ou.bookmsg")
   List<Books> queryAll();
}

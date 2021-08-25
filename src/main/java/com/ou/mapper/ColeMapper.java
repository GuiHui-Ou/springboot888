package com.ou.mapper;

import com.ou.domain.Coles;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ColeMapper {
    List<Coles> queryAll();
}

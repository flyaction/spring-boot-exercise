package com.imooc.firstappdemo.mapper;

import com.imooc.firstappdemo.entity.IconEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IconMapper {

    @Select("select count(id) from cp_icon")
    Integer getCount();

    IconEntity findById(int id);

    List<IconEntity> findByPage(int currentPage, int pageSize);




}

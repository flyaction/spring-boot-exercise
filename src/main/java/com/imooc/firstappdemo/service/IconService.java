package com.imooc.firstappdemo.service;

import com.github.pagehelper.Page;
import com.imooc.firstappdemo.common.PageBean;
import com.imooc.firstappdemo.entity.DataAppDpi;
import com.imooc.firstappdemo.entity.IconEntity;

import java.util.List;


public interface IconService {

    IconEntity findById(int id);

    PageBean<IconEntity> findByPage(int currentPage, int pageSize);


    PageBean<DataAppDpi> findMyPage(DataAppDpi icon, int currentPage, int pageSize);


    void saveTransactional(DataAppDpi dpi);
}

package com.imooc.firstappdemo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.imooc.firstappdemo.common.PageBean;
import com.imooc.firstappdemo.entity.DataAppDpi;
import com.imooc.firstappdemo.entity.IconEntity;
import com.imooc.firstappdemo.mapper.DataAppDpiMapper;
import com.imooc.firstappdemo.mapper.IconMapper;
import com.imooc.firstappdemo.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class IconServiceImpl implements IconService {

    @Autowired
    IconMapper iconMapper;

    @Autowired
    DataAppDpiMapper dataAppDpiMapper;


    @Override
    public IconEntity findById(int id) {
        return iconMapper.findById(id);
    }

    @Override
    public PageBean<IconEntity> findByPage(int currentPage, int pageSize) {

        PageHelper.startPage(currentPage,pageSize);
        List<IconEntity> allItems = iconMapper.findByPage(currentPage,pageSize);


        Integer countNums = iconMapper.getCount();

        PageBean<IconEntity> pageData = new PageBean<>(currentPage,pageSize,countNums);

        pageData.setItems(allItems);


        return pageData;
        //System.out.println(pageData);
        //return pageData.getItems();
    }


    @Override
    public PageBean<DataAppDpi> findMyPage(DataAppDpi dpi, int currentPage, int pageSize) {

        PageHelper.startPage(currentPage,pageSize);


        Example example = new Example(DataAppDpi.class);
        Example.Criteria criteria = example.createCriteria();

        if(!StringUtils.isEmptyOrWhitespace(dpi.getAppName())){
            criteria.andLike("appName","%"+dpi.getAppName()+"%");
        }
        example.orderBy("id").desc();

        List<DataAppDpi> allItems = dataAppDpiMapper.selectByExample(example);

        Integer countNums = dataAppDpiMapper.selectCountByExample(example);

        PageBean<DataAppDpi> pageData = new PageBean<>(currentPage,pageSize,countNums);

        pageData.setItems(allItems);

        return pageData;
        //System.out.println(pageData);
        //return pageData.getItems();
    }


    //事务
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveTransactional(DataAppDpi dpi) {

        dataAppDpiMapper.insert(dpi);

        int a = 1 / 0;

        DataAppDpi dpi2 = new DataAppDpi();
        dpi2.setId(3);
        dpi2.setFrom("TD-TD");

        dataAppDpiMapper.updateByPrimaryKeySelective(dpi2);
    }
}

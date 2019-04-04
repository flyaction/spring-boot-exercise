package com.imooc.firstappdemo.util;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

/**
 * @Author Action
 * @Description:
 * @Date Create in 2019/4/3 12:00
 */
public interface MyMapper<T> extends
        Mapper<T>,
        MySqlMapper<T>,
        DeleteByIdsMapper<T>,
        ConditionMapper<T>,
        ExampleMapper<T>,
        SelectByIdsMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}

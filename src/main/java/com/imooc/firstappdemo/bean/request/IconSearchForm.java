package com.imooc.firstappdemo.bean.request;

import lombok.Data;

/******************************************
 * @createDate: 2019/03/18
 * @company: (C) Copyright aidata360 2019
 * @since: JDK 1.8
 * @Description:
 ******************************************/
@Data
public class IconSearchForm{
    private String id;
    private String name;
    private String iconUrl;
    private String iconDesc;
    private String catId;
    private String status;
    private String createTime;
    private String updateTime;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getIconDesc() {
        return iconDesc;
    }

    public String getCatId() {
        return catId;
    }

    public String getStatus() {
        return status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }
}

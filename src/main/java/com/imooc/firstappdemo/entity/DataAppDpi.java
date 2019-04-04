package com.imooc.firstappdemo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_app_dpi")
public class DataAppDpi {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ID
     */
    @Column(name = "`tdid`")
    private String tdid;

    /**
     * 分类
     */
    @Column(name = "`category`")
    private String category;

    /**
     * app名称
     */
    @Column(name = "`appName`")
    private String appName;

    /**
     * PKG
     */
    @Column(name = "`pkgName`")
    private String pkgName;

    /**
     * url
     */
    @Column(name = "`url`")
    private String url;

    /**
     * 主域名
     */
    @Column(name = "`host`")
    private String host;

    /**
     * 作业来源
     */
    @Column(name = "`from`")
    private String from;

    /**
     * kind
     */
    @Column(name = "`type`")
    private String type;

    /**
     * work
     */
    @Column(name = "`woker`")
    private String woker;

    /**
     * 导入时间
     */
    @Column(name = "`createTime`")
    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取ID
     *
     * @return tdid - ID
     */
    public String getTdid() {
        return tdid;
    }

    /**
     * 设置ID
     *
     * @param tdid ID
     */
    public void setTdid(String tdid) {
        this.tdid = tdid;
    }

    /**
     * 获取分类
     *
     * @return category - 分类
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置分类
     *
     * @param category 分类
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取app名称
     *
     * @return appName - app名称
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置app名称
     *
     * @param appName app名称
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 获取PKG
     *
     * @return pkgName - PKG
     */
    public String getPkgName() {
        return pkgName;
    }

    /**
     * 设置PKG
     *
     * @param pkgName PKG
     */
    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    /**
     * 获取url
     *
     * @return url - url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取主域名
     *
     * @return host - 主域名
     */
    public String getHost() {
        return host;
    }

    /**
     * 设置主域名
     *
     * @param host 主域名
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 获取作业来源
     *
     * @return from - 作业来源
     */
    public String getFrom() {
        return from;
    }

    /**
     * 设置作业来源
     *
     * @param from 作业来源
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * 获取kind
     *
     * @return type - kind
     */
    public String getType() {
        return type;
    }

    /**
     * 设置kind
     *
     * @param type kind
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取work
     *
     * @return woker - work
     */
    public String getWoker() {
        return woker;
    }

    /**
     * 设置work
     *
     * @param woker work
     */
    public void setWoker(String woker) {
        this.woker = woker;
    }

    /**
     * 获取导入时间
     *
     * @return createTime - 导入时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置导入时间
     *
     * @param createTime 导入时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
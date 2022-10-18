package com.github.codeqingkong.model;

import java.util.Date;

/**
 * @author qingkong
 * @date 2021/12/15
 */
public class Role {
    private Integer id;
    private String name;
    private String code;
    private Date createdTime;
    private Date modifiedTime;
    private Integer hasDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getHasDeleted() {
        return hasDeleted;
    }

    public void setHasDeleted(Integer hasDeleted) {
        this.hasDeleted = hasDeleted;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedTime=" + modifiedTime +
                ", hasDeleted=" + hasDeleted +
                '}';
    }
}

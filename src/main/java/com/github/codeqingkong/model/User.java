package com.github.codeqingkong.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author qingkong
 * @date 2021/12/6
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;
    private Boolean hasDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Boolean getHasDeleted() {
        return hasDeleted;
    }

    public void setHasDeleted(Boolean hasDeleted) {
        this.hasDeleted = hasDeleted;
    }
}

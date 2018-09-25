package com.wdsite.demo.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Dy
 * @since 2018-09-25
 */
public class Demo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    @TableField("REMOVED")
    private Boolean removed;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Boolean getRemoved() {
        return removed;
    }

    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Demo{" +
        "name=" + name +
        ", removed=" + removed +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

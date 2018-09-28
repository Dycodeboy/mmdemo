package com.wdsite.demo.shiro.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Dy
 * @since 2018-09-28
 */
public class SysRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer roleId;

    private Integer permissionId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "SysRolePermission{" +
        "roleId=" + roleId +
        ", permissionId=" + permissionId +
        "}";
    }
}

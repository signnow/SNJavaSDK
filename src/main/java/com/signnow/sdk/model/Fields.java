package com.signnow.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Bhanu on 7/1/2014.
 *
 * This model is useful to build the Fields Object to have different types of files like, Signature,CheckBox,Texts and Initials.
 */
public class Fields {

    private int x;
    private int y;
    private int width;
    private int height;
    @JsonProperty("page_number")
    private int pageNumber;
    private String role;
    private boolean required;
    private String type;

    @JsonProperty("role_id")
    private String roleId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

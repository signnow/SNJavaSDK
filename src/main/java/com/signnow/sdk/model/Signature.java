package com.signnow.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Bhanu on 7/1/2014.
 */
public class Signature extends Fields {
    private int width;
    private int height;
    private int x;
    private int y;

    @JsonProperty("page_number")
    private int pageNumber;

    private String data;

    public Signature()
    {

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

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

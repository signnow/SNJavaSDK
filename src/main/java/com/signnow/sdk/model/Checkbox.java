package com.signnow.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Bhanu on 7/1/2014.
 *
 * This class is used to create the check box on the document
 */


public class Checkbox extends Fields{

    private int x;
    private int y;
    private int width;
    private int height;

    @JsonProperty("page_number")
    private int pageNumber;

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
}

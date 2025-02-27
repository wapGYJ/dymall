package com.wapgyj.productservice.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;

import java.io.Serializable;

import java.util.Map;

@TableName(value = "tb_product",autoResultMap = true)
public class Product implements Serializable {
    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;

    private String  name;

    private String description;

    private String picture;

    private Float price;

    private int stock;

@TableField(value = "categories",typeHandler = JacksonTypeHandler.class)
    private Map<String,Object> categories;

    public Product(String name, String description, String picture, Float price, int stock, Map<String, Object> categories) {
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.price = price;
        this.stock = stock;
        this.categories = categories;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Map<String, Object> getCategories() {
        return categories;
    }

    public void setCategories(Map<String, Object> categories) {
        this.categories = categories;
    }

    public Product() {
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}

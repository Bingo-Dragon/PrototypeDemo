package com.bingo.springmvc.entity;

import java.util.Date;

public class ShoppingCart {
    private String id;

    private String userId;

    private String shopId;

    private String productId;

    private String isProductExists;

    private Short amount;

    private Date createdTime;

    public ShoppingCart(String id, String userId, String shopId, String productId, String isProductExists, Short amount, Date createdTime) {
        this.id = id;
        this.userId = userId;
        this.shopId = shopId;
        this.productId = productId;
        this.isProductExists = isProductExists;
        this.amount = amount;
        this.createdTime = createdTime;
    }

    public ShoppingCart() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getIsProductExists() {
        return isProductExists;
    }

    public void setIsProductExists(String isProductExists) {
        this.isProductExists = isProductExists == null ? null : isProductExists.trim();
    }

    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
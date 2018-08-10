package com.bingo.springmvc.dao;

import com.bingo.springmvc.entity.ShoppingCart;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}
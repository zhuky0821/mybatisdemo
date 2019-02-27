package com.zhuky.mybatis.dao;

import com.zhuky.mybatis.pojo.Order;
import com.zhuky.mybatis.pojo.OrderUser;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    OrderUser queryOrderUserByOrderNumber(@Param("number") String number);

    Order queryOrderWithUserByOrderNumber(@Param("number") String number);

    Order queryOrderWithUserAndDetailByOrderNumber(@Param("number") String number);

    Order queryOrderWithUserAndDetailItemByOrderNumber(@Param("number") String number);

    public Order queryOrderAndUserByOrderNumberLazy(@Param("number") String number);
}

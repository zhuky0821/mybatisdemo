package com.zhuky.mybatis.dao;

import com.zhuky.mybatis.pojo.Order;
import com.zhuky.mybatis.pojo.OrderUser;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    OrderUser queryOrderUserByOrderNumber(@Param("number") String number);

    Order queryOrderWithUserByOrderNumber(@Param("number") String number);




}

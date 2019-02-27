package com.zhuky.mybatis.pojo;

import java.util.List;

public class Order {
    private int id;
    private Long userId;

    public String getOrderNumber() {
        return orderNumber;
    }

    private String orderNumber;
    private User user;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderNumber='" + orderNumber + '\'' +
                ", user=" + user +
                ", detailList=" + detailList +
                '}';
    }

    private List<OrderDetail> detailList;

    public User getUser() {
        return user;
    }

}

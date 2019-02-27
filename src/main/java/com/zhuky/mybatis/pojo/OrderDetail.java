package com.zhuky.mybatis.pojo;

public class OrderDetail {
    private Integer id;
    private Integer orderId;
    private Double totalPrice;
    private Integer status;
    private Item item;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", item=" + item +
                '}';
    }
}

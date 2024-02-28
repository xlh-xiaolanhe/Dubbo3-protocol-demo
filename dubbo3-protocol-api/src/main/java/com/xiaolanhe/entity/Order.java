package com.xiaolanhe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 *@author: xiaolanhe
 *@createDate: 2024/2/27 23:49
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    private String orderId;
    private double price;
}

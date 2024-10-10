package com.raathammudu.groceryorder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class GroceryOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Long customerId;
    private String items;
    private double totalPrice;
    private String deliveryAddress;
    private Date orderDate;
    private String status;

    // Getters and Setters
}

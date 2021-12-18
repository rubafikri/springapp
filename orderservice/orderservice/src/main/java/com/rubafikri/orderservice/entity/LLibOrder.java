package com.rubafikri.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LLibOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long orderid;
    String price;
    String qty;
}

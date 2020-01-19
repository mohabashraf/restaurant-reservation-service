package com.example.asynchronous.dto;

import com.example.asynchronous.domains.ItemSize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String id;
    private int price;
    private String name;
    private ItemSize size;

    public Item(int price, String name, ItemSize size) {
        this.id = UUID.randomUUID().toString();
        this.price = price;
        this.name = name;
        this.size = size;
    }
}

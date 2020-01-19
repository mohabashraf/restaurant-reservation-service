package com.example.asynchronous.dto;

import org.junit.jupiter.api.Test;

public class ItemsPOJO {

    @Test
    public void testShouldConstruct(){
        Item item = new Item("Pizza", 20, "Large");
    }
}

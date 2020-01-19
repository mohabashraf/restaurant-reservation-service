package com.example.asynchronous.dto;

import com.example.asynchronous.domains.ItemSize;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ItemsPOJO {


    @Test
    public void testShouldConstructItem(){
        Item item = new Item(20, "Pizza", ItemSize.LARGE);
        assertThat(item.getPrice()).isEqualTo(20);
        assertThat(item.getName()).isEqualTo("Pizza");
        assertThat(item.getSize()).isEqualTo(ItemSize.LARGE);
    }
}

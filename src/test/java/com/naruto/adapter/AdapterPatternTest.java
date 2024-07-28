package com.naruto.adapter;

import org.junit.jupiter.api.Test;

public class AdapterPatternTest {

    @Test
    public void testAdapterPattern() {
        var imageView = new ImageView(new Image());
        imageView.view();
    }
}

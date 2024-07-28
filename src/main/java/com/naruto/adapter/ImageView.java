package com.naruto.adapter;

public class ImageView {
    private final Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void view() {
        this.image.apply(new VividFilter());
        this.image.apply(new RetroAdapterFilter(new RetroFilter()));
    }
}

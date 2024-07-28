package com.naruto.adapter;

public class RetroAdapterFilter implements Filter{

    private final RetroFilter retroFilter;

    public RetroAdapterFilter(RetroFilter retroFilter) {
        this.retroFilter = retroFilter;
    }

    @Override
    public void apply() {
        retroFilter.init();
        retroFilter.render();
    }
}

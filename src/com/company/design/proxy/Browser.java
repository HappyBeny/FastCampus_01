package com.company.design.proxy;

public class Browser implements IBrowser{
    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url);
    }

    private String url;

    public Browser(String url) {
        this.url = url;
    }
}

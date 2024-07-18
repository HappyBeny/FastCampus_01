package com.company.design.decorator;

public class AudiDecorator implements ICar{

    protected Audi audi;
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(Audi audi, String modelName, int modelPrice) {
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void showPrice() {

    }
}

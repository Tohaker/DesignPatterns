package com.pluralsight.builder;

public class LunchOrder {

    public static class Builder {
        private String bread, condiments, dressing, meat;

        // We have an empty constructor here, but if any parameters are required, we may assign them here.
        public Builder() {

        }

        // This method returns the LunchOrder to its parent class, passing the builder as its only argument.
        public LunchOrder build() {
            return new LunchOrder(this);
        }

        // All subsequent methods allow us to specify the construction of the order with as many or as few components
        // as we like. Each one returns the Builder so the methods can be stacked in an easily readable order.
        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}

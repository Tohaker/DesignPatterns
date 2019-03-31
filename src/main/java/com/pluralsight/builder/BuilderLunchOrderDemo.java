package com.pluralsight.builder;

public class BuilderLunchOrderDemo {

    public static void main(String[] args) {
        // We create the Builder to start construction on the order. Each order will have its own static builder, so
        // this can change over the course of the program.
        LunchOrder.Builder builder = new LunchOrder.Builder();

        // Building up an order is easy, with us only adding in the components we need.
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder =  builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}

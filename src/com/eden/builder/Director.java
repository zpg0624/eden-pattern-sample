package com.eden.builder;

import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @created by eden
 * @since 2019-03-12 下午 5:35:43
 */

public class Director {

    private Builder  builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build(){
        builder.buildPart1();
        builder.buildPart3();
        builder.buildPart2();
    }

    public static void main(String[] args) {
   new Director(new CatBuilder()).build();
        System.out.println(CatBuilder.LOCAL.get() );
    }
}

package com.eden.builder;

/**
 * @created by eden
 * @since 2019-03-12 下午 5:28:44
 */

public class CatBuilder implements Builder {
    static  ThreadLocal<Cat> LOCAL= new ThreadLocal<>();
    static {
        LOCAL.set(new Cat());
    }

    @Override
    public void buildPart1() {
        LOCAL.get().setName("oooo");
    }

    @Override
    public void buildPart2() {

        LOCAL.get().setAge(25);
    }

    @Override
    public void buildPart3() {

        Address address = new Address();
        address.setAddr("guangzhou");
        LOCAL.get().setAddress(address);
    }
}

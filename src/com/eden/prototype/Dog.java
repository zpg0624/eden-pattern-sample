package com.eden.prototype;

/**
 * @created by eden
 * @since 2019-03-12 下午 5:57:50
 */

public class Dog implements Cloneable {

    private String name;

    private Integer age;


    Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Dog dog = new Dog();

        dog.setAge(12);
        dog.setName("aa");
        Address address = new Address();
        address.setAddr("address");
        dog.setAddress(address);


        System.out.println(dog);
        Object clone = dog.clone();


        System.out.println(clone);

    }
}


class Address {

    String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                '}';
    }
}

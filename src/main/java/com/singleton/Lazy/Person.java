package com.singleton.Lazy;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2021/12/19 4:36 下午
 */
public class Person {

    public Car travel() {
        System.out.println("I'm going on a trip");
        Car car = Car.getInstance();
        car.run();
        return car;
    }

    public Car go2School() {
        System.out.println("I'm going to school");
        Car car = Car.getInstance();
        car.run();
        return car;
    }

    public Car go2Party() {
        System.out.println("I'm going to the party");
        Car car = Car.getInstance();
        car.run();
        return car;
    }
}

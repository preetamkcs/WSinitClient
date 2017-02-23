package com.company;

import mypackage.HelloWorldService;

public class Main {

    public static void main(String[] args) {
        System.out.println(new HelloWorldService().getHelloWorldPort().sayHelloWorldFrom("Preetam"));
    }
}

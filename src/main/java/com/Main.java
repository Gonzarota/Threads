package com;

public class Main {
    public static void main(String[] args) {
        ChildThread child1= new ChildThread();
        ChildThread child2= new ChildThread();
        ChildThread child3= new ChildThread();

        child1.start();
        child2.start();
        child3.start();
    }
}

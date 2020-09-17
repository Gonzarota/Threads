package com;

public class ChildThread extends Thread{

    @Override
    public void run(){
        System.out.println("Entrando en el hilo con el id: "+ this.getId());
    }
}

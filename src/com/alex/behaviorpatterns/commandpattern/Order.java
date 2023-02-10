package com.alex.behaviorpatterns.commandpattern;

public class Order {
    public void makeOder(Command command){
        command.execute();
    }
}

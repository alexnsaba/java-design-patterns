package com.alex.behaviorpatterns.commandpattern;

public class OrderManager {
    String clientName;

    public OrderManager(String clientName) {
        this.clientName = clientName;
    }

    public void orderFood(){
        System.out.println(clientName +" is Ordering for food");
    }

    public void orderDrink(){
        System.out.println(clientName +" is Ordering for drinks");
    }
}

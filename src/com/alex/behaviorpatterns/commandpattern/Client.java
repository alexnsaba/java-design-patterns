package com.alex.behaviorpatterns.commandpattern;

public class Client {
    public static void main(String[] args) {
        String clientName = "Alex";

        OrderManager orderManager = new OrderManager(clientName);

        Order foodOrder = new Order();
        Order drinksOrder = new Order();

        foodOrder.makeOder(new OrderFoodCommand(orderManager));
        drinksOrder.makeOder(new OrderDrinksCommand(orderManager));
    }
}

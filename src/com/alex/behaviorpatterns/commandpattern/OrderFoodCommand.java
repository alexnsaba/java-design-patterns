package com.alex.behaviorpatterns.commandpattern;

public class OrderFoodCommand implements Command{
    private OrderManager orderManager;

    public OrderFoodCommand(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    @Override
    public void execute() {
        orderManager.orderFood();
    }
}

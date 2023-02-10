package com.alex.behaviorpatterns.commandpattern;

public class OrderDrinksCommand implements Command{
    private OrderManager orderManager;

    public OrderDrinksCommand(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    @Override
    public void execute() {
        orderManager.orderDrink();
    }
}

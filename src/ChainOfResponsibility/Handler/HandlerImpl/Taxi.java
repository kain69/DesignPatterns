package ChainOfResponsibility.Handler.HandlerImpl;

import ChainOfResponsibility.Handler.Handler;
import ChainOfResponsibility.Order;

public class Taxi extends Handler {
    private final String number;

    public Taxi(String number) {
        this.number = number;
    }

    @Override
    public void handle(Order order) {
        if (checkIsBusy()) {
            System.out.printf("Машина № %s не может принять заказ\n", number);
            super.handle(order);
        }
        else {
            System.out.printf("Машина № %s выезжает на заказ %s", number, order.getId());
        }
    }

    private boolean checkIsBusy() {
        return Math.random() < 0.85;
    }
}

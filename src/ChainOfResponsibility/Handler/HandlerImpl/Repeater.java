package ChainOfResponsibility.Handler.HandlerImpl;

import ChainOfResponsibility.Handler.Handler;
import ChainOfResponsibility.Order;

public class Repeater extends Handler {
    private Order order;

    @Override
    public void handle(Order order) {
        if (this.order == order) {
            System.out.println("Все машины заняты, продолжаем поиск...");
        }
        else {
            this.order = order;
        }
        super.handle(order);
    }
}

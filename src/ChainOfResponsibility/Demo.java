package ChainOfResponsibility;

import ChainOfResponsibility.Handler.Handler;
import ChainOfResponsibility.Handler.HandlerImpl.Repeater;
import ChainOfResponsibility.Handler.HandlerImpl.Taxi;

public class Demo {
    public static void main(String[] args) {
        Handler handler = new Repeater();

        handler.bind(new Taxi("AM001P77"))
                .bind(new Taxi("AM002P77"))
                .bind(new Taxi("AM003P77"))
                .bind(new Taxi("AM004P77"))
                .bind(new Taxi("AM005P77"))
                .bind(handler);

        Order order = new Order("#1");
        handler.handle(order);
    }
}
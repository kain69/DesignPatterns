package Observer;

import Observer.Channel.ChannelImpl.NewsChannel;

public class Demo {
    public static void main(String[] args) {
        NewsPortal portal = new NewsPortal();

        NewsChannel channel1 = new NewsChannel("Первый канал");
        portal.add(channel1);
        NewsChannel channel2 = new NewsChannel("Второй канал");
        portal.add(channel2);

        portal.setNews("Сегодня был изучен паттерн Наблюдатель!");
    }
}
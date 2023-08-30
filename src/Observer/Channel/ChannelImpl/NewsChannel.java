package Observer.Channel.ChannelImpl;

import Observer.Channel.Channel;

public class NewsChannel implements Channel {
    private final String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s, получена новость: %s\n", name, message);
    }
}

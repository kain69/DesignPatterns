package Observer;

import Observer.Channel.Channel;

import java.util.ArrayList;
import java.util.List;

public class NewsPortal {
    private final List<Channel> channelList = new ArrayList<>();
    private String news;

    public void add(Channel channel) {
        channelList.add(channel);
    }

    public void remove(Channel channel) {
        channelList.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : channelList) {
            channel.update(news);
        }
    }
}

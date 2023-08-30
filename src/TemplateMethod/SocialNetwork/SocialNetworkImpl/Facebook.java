package TemplateMethod.SocialNetwork.SocialNetworkImpl;

import TemplateMethod.SocialNetwork.SocialNetwork;

public class Facebook extends SocialNetwork {
    public Facebook(String login, String password) {
        super(login, password);
    }

    @Override
    protected boolean login(String login, String password) {
        System.out.println("Успешный вход в учетную запись Facebook");
        return true;
    }

    @Override
    protected void publish(String message) {
        System.out.printf("Пост в Facebook опубликован: %s\n", message);
    }

    @Override
    protected void logout() {
        System.out.println("Выход из учетной записи Facebook");
    }
}

package TemplateMethod.SocialNetwork.SocialNetworkImpl;

import TemplateMethod.SocialNetwork.SocialNetwork;

public class VK extends SocialNetwork {
    public VK(String login, String password) {
        super(login, password);
    }

    @Override
    protected boolean login(String login, String password) {
        System.out.println("Успешный вход в учетную запись VK");
        return true;
    }

    @Override
    protected void publish(String message) {
        System.out.printf("Пост в VK опубликован: %s\n", message);
    }

    @Override
    protected void logout() {
        System.out.println("Выход из учетной записи VK");
    }
}

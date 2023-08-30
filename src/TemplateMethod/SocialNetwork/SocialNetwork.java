package TemplateMethod.SocialNetwork;

public abstract class SocialNetwork {

    private final String login;
    private final String password;

    public SocialNetwork(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createPost(String message) {
        boolean loginSuccessfully = login(login, password);
        if (loginSuccessfully) {
            publish(message);
            logout();
        }
    }

    protected abstract boolean login(String login, String password);

    protected abstract void publish(String message);

    protected abstract void logout();

}

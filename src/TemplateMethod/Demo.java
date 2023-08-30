package TemplateMethod;

import TemplateMethod.SocialNetwork.SocialNetwork;
import TemplateMethod.SocialNetwork.SocialNetworkImpl.Facebook;
import TemplateMethod.SocialNetwork.SocialNetworkImpl.VK;

public class Demo {
    public static void main(String[] args) {
        SocialNetwork vk = new VK("vlad", "qwerty");
        vk.createPost("Post1");

        SocialNetwork facebook = new Facebook("vlad", "qwerty");
        facebook.createPost("Post2");
    }
}
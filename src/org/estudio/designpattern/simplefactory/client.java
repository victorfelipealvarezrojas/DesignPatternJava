package org.estudio.designpattern.simplefactory;

public class client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println("post = " + post);
    }
}

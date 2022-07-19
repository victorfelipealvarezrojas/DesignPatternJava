package org.estudio.designpattern.simplefactory;


/**
 * crea los distintos post del sitio
 */
public class PostFactory {
    public static Post createPost(String type){
        switch (type){
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw  new IllegalArgumentException("Post Type is unown");
        }
    }
}

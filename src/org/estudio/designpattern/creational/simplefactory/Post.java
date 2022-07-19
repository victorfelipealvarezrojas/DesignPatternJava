package org.estudio.designpattern.creational.simplefactory;

import java.time.LocalDateTime;

/**
 * Abstract post class. Represent a generic post on a web site.
 */
public abstract class Post {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime crestedOn;
    private LocalDateTime publishedOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCrestedOn() {
        return crestedOn;
    }

    public void setCrestedOn(LocalDateTime crestedOn) {
        this.crestedOn = crestedOn;
    }

    public LocalDateTime getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
    }
}

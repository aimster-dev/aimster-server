package com.aimster.aimsterserver.dao;

public class Example {

    private Long id;

    private String text;

    public Example(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Example{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}

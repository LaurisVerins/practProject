package com.java7.practical.project.sample;

public class Books {
    private Integer id;
    private String title;
    private String author;
    private int age;
    private int pages;

    public Books(Integer id, String title, String author, int age, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.age = age;
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

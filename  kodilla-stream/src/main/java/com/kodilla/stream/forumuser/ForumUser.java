package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private int id;
    private String name;
    private char sex;
    private LocalDate birthDate;
    private int totalPosts;

    public ForumUser(int id, String name, char sex, LocalDate birthDate, int totalPosts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.totalPosts = totalPosts;
    }

    public String toString() {
        return id + " " + name + " " + sex + " " + birthDate + " " + totalPosts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getTotalPosts() {
        return totalPosts;
    }
}

package org.launchcode.models;

import java.time.LocalDate;

public class User {

    private static int nextId = 1;

    private final int id;
    private String username;
    private String email;
    private String password;
    private final LocalDate dateRegistered;

    public User(String email, String username, String password) {
        this.id = nextId;
        this.email = email;
        this.username = username;
        this.password = password;
        this.dateRegistered = LocalDate.now();
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }
}

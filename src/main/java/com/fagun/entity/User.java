package com.fagun.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class User {

    @Id
    private String id = UUID.randomUUID().toString();

    private String firstName = "Fagun";
    private String lastName = "Patel";
    private String username = "fagunpatel";
    private String password = "123";
    private Boolean active = true;
    private String roles = "ROLE_USER";

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String firstName, String lastName, String username, boolean active, String roles, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.active = active;
        this.roles = roles;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", active=" + active +
                ", roles='" + roles + '\'' +
                '}';
    }
}

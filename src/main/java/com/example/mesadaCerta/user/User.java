package com.example.mesadaCerta.user;

import com.example.mesadaCerta.user.records.RegisterUserRequestDTO;
import jakarta.persistence.*;

@Table(name = "tb_users")
@Entity(name = "tb_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Boolean active;

    public User() {
    }

    public User(RegisterUserRequestDTO registerRequest) {
        this.username = registerRequest.username();
        this.firstName = registerRequest.firstName();
        this.lastName = registerRequest.lastName();
        this.email = registerRequest.email();
        this.password = registerRequest.password();
        this.active = registerRequest.active();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}

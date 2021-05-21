package com.api.backend.APITestService;

public class User {
    private Long id;
    private String UserName;
    private int password;
    private String Rol;

    public User() {
    }

    public User(Long id, String userName, int password, String rol) {
        this.id = id;
        UserName = userName;
        this.password = password;
        Rol = rol;
    }

    public User(String userName, int password, String rol) {
        UserName = userName;
        this.password = password;
        Rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", password=" + password +
                ", Rol='" + Rol + '\'' +
                '}';
    }
}

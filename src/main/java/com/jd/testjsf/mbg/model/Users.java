package com.jd.testjsf.mbg.model;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private Integer age;

    private static final long serialVersionUID = 1L;
    public Users(String name, String password, Integer age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public Users(Integer id, String name, String password, Integer age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", age=").append(age);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
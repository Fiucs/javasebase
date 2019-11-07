package com.classWork1;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String passwd;
    private static final long SerialVersionUID=123435L;

    public User() {
    }

    public User(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


}

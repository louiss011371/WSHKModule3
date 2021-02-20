package com.example.wshk;

public class WSHKAPI {
    static String url = "https://wshk1920.herokuapp.com/api/";

    static String loginString() {
        return url + "login";
    }
    static String registerString() {
        return url + "/register";
    }
    static String listUsers() { return url + "users"; };
    static String listUser(int id) { return url + "users/" + id; }
}

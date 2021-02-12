package com.singleton;

public class Main {

    public static void main(String[] args) {
        /*
        * Get app instance
        * */
        App app = App.getInstance();
        app.getStatus();
    }
}

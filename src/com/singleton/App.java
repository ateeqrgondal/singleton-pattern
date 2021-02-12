package com.singleton;

public class App {

    private static App instance;
    private App() { }

    public static App getInstance () {
        if (instance == null) {
            return new App();
        }
        return instance;
    }

    public void getStatus () {
        System.out.println("Your awesome app is running");
    }

}

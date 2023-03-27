package com.sub.patterns.presentation.frontController;

public class Dispatcher {

    private HomeView homeView;
    private WorkView workView;

    public Dispatcher() {
        homeView = new HomeView();
        workView = new WorkView();
    }

    public void dispatch(String request) {
        switch (request) {
            case "HOME" -> homeView.show();
            case "WORK" -> workView.show();
            default -> System.out.println("Not found");
        }
    }

}

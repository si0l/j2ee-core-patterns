package com.sub.patterns.presentation.frontController;

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticated() {
        System.out.println("authenticated");

        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Logging request: " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticated()) {
            dispatcher.dispatch(request);
        }
    }

}

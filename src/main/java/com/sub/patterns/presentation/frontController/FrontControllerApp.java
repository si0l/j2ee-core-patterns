package com.sub.patterns.presentation.frontController;

public class FrontControllerApp {

    public static void main(String[] args) {
        FrontController controller = new FrontController();
        controller.dispatchRequest("HOME");
        controller.dispatchRequest("WORK");
        controller.dispatchRequest("OTHER");
    }
}

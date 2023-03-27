package com.sub.patterns.interceptingFilter;

public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {

        System.out.println("Log request: " + request);
    }

}

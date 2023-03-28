package com.sub.patterns.business.transferObjectAssembler;

public class ToaApp {
    public static void main(String[] args) {

        System.out.println(new ProjectDetailsAssembler().getProjectDetails("1"));
    }
}

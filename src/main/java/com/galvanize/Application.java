package com.galvanize;

public class Application {


    public static void main(String[] args) {

        if(args.length < 1) {
            System.out.println("Whoops, we need some input here.");
        }

        String firstArgument = args[0];
        String secondArgument = args[1];
        System.out.println( firstArgument + " " + secondArgument);
    }

}

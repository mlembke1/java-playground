package com.galvanize;

public class ForLoop {
    void printNumbers(){
        for(int i= 2; i <= 6; i++ ){
            System.out.println(i);
        }
    };

    public static void main(String[] args) {
        ForLoop object = new ForLoop();
        object.printNumbers();
    };

}

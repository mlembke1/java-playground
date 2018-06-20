package com.galvanize;

public class WhileLoop {
    void printNumbers(int input){
        while(input < 51){
            System.out.println(input);
            input++;
        };
    };

    public static void main(String[] args) {
        WhileLoop object = new WhileLoop();
        object.printNumbers(45);
    };

}

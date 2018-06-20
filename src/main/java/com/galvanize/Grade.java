package com.galvanize;

public class Grade {
    String grade(int input) {
        String g;
        if (input >= 90 && input <= 100){
            g = "A";
        } else if (input >= 80 && input <= 89){
            g = "B";
        } else if (input >= 70 && input <= 79) {
            g = "C";
        } else if (input >= 60 && input <= 69){
            g = "D";
        } else {
            g = "F";
        };
        return g;
    };

    public static void main(String[] args) {
        Grade cool = new Grade();
        System.out.println(cool.grade(77));
    }

}

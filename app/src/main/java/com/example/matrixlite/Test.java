package com.example.matrixlite;

public class Test {

    public static boolean NameValid(String name){
        if (!name.matches("^{4,16}$")) return false;
        return true;
    }

    public static boolean NumberLeng(String leng){

        if(leng.length() < 5) return false;
        if(!leng.matches(".*[0-9].*")) return false;
        return true;
    }
}

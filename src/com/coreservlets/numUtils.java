package com.coreservlets;

/**
 * Created by brian on 02/12/2015.
 */
public class numUtils {

    public static int getMin(int num1, int num2, int num3){

        if(num1 < num2 && num1 < num3)
            return num1;
        else if(num2< num1 && num2 < num3)
            return num2;
        else return num3;
    }

    public static int getMax(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3)
            return num1;
        else if(num2 > num1 && num2 > num3)
            return num2;
        else return num3;
    }

    public static int getProduct(int num1, int num2, int num3){
        return num1*num2*num3;
    }
}

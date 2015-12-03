package com.coreservlets;

import java.io.Serializable;

/**
 * Created by brian on 02/12/2015.
 */
public class numInfo implements Serializable {
    private final int mMin, mMax, mProduct, mNum0, mNum1, mNum2, mNum3, mNum4;
    private final String mEnd;

    public numInfo(int num0, int num1, int num2, int num3, int num4, String end){
        mNum0 = num0;
        mNum1 = num1;
        mNum2 = num2;
        mNum3 = num3;
        mNum4 = num4;
        mEnd = end;
        mMin = numUtils.getMin(num1,num2,num3);
        mMax = numUtils.getMax(num1,num2,num3);
        mProduct = numUtils.getProduct(num1,num2,num3);
    }
    public numInfo(int num0, int num1, int num2, int num3, int num4){

        this(num0, num1, num2, num3, num4,"done");
    }
    public int getmNum0(){return (mNum0);}
    public int getmNum1(){return (mNum1);}
    public int getmNum2(){return (mNum2);}
    public int getmNum3(){return (mNum3);}
    public int getmNum4(){return (mNum4);}

    public int getmMin(){return (mMin);}
    public int getmMax(){return (mMax);}
    public int getmProduct(){return (mProduct);}
}

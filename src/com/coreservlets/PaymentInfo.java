package com.coreservlets;

import java.io.Serializable;

/** Represents the monthly payments and total payment amount
 *  for loans with a given principal, interest rate, and period. 
 *  Used by LoanCalculatorActivity and RotationsActivity.
 *  It is Serializable so that it can be stored in a Bundle 
 *  (as done in RotationsActivity).
 *  <p>
 *  From <a href="http://www.coreservlets.com/android-tutorial/">
 *  the coreservlets.com Android programming tutorial series</a>.
 */

public class PaymentInfo implements Serializable {
    private final double mLoanAmount, mAnnualInterestRateInPercent, 
                         mMonthlyPayment, mTotalPayments;
    private final int mData0, mData1,mData2,mData3,mData4;
    private final long mLoanPeriodInMonths;
    private final String mCurrencySymbol;
    
    public PaymentInfo(double loanAmount, double annualInterestRateInPercent,
                       long loanPeriodInMonths,int num0, int num1, int num2, int num3, int num4, String currencySymbol) {
        mLoanAmount = loanAmount;
        mAnnualInterestRateInPercent = annualInterestRateInPercent;
        mLoanPeriodInMonths = loanPeriodInMonths;
        mCurrencySymbol = currencySymbol;
        mData0 = num0;
        mData1 = num1;
        mData2 = num2;
        mData3 = num3;
        mData4 = num4;
        mMonthlyPayment = LoanUtils.monthlyPayment(loanAmount, 
                                                   annualInterestRateInPercent, 
                                                   loanPeriodInMonths);
        mTotalPayments = mMonthlyPayment * mLoanPeriodInMonths;
    }
    
    public PaymentInfo(double loanAmount, double annualInterestRateInPercent,
                       long loanPeriodInMonths, int num0,int num1, int num2, int num3, int num4) {
        this(loanAmount, annualInterestRateInPercent, loanPeriodInMonths,num0,num1,num2,num3,num4, "$");
    }

    public double getLoanAmount() {
        return(mLoanAmount);
    }
    public int getNum0(){return (mData0);}
    public int getNum1(){return (mData1);}
    public int getNum2(){return (mData2);}
    public int getNum3(){return (mData3);}
    public int getNum4(){return (mData4);}
    
    public String getFormattedLoanAmount() {
        return(String.format("%s%,.2f", mCurrencySymbol, mLoanAmount));
    }

    public double getAnnualInterestRateInPercent() {
        return(mAnnualInterestRateInPercent);
    }
    
    public String getFormattedAnnualInterestRateInPercent() {
        return(String.format("%,.2f%%", mAnnualInterestRateInPercent));
    }

    public long getLoanPeriodInMonths() {
        return(mLoanPeriodInMonths);
    }
    
    public String getFormattedLoanPeriodInMonths() {
        return(String.format("%s", mLoanPeriodInMonths));
    }
    
    public String getCurrencySymbol() {
        return(mCurrencySymbol);
    }

    public double getMonthlyPayment() {
        return (mMonthlyPayment);
    }
    
    public String getFormattedMonthlyPayment() {
        return(String.format("%s%,.2f", mCurrencySymbol, mMonthlyPayment));
    }

    public double getTotalPayments() {
        return (mTotalPayments);
    }

    public String getFormattedTotalPayments() {
        return(String.format("%s%,.2f", mCurrencySymbol, mTotalPayments));
    }
}

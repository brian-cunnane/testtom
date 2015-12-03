package com.coreservlets; 

import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loan-calculator")
public class LoanCalculator extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inputString = request.getParameter("numbers");
        // Example input: { "amount": 100000, "rate": 5.5, "months": 360 };
        // Example String: String inputString = "{ \"amount\": 100000, \"rate\": 5.5, \"months\": 360 }";
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num0 = 0;
        double loanAmount = 200000;
        double annualInterestRateInPercent = 5.5;
        long loanPeriodInMonths = 360;
        try {//create a json object with the above values
            JSONObject inputValues = new JSONObject(inputString);
            loanAmount = inputValues.getDouble("amount");
            num0 = inputValues.getInt("data0");
            num1 = inputValues.getInt("data1");
            num2 = inputValues.getInt("data2");
            num3 = inputValues.getInt("data3");
            num4 = inputValues.getInt("data4");
            annualInterestRateInPercent = inputValues.getDouble("rate");
            loanPeriodInMonths = inputValues.getLong("months");
        } catch (Exception e) {  // NullPointerException and JSONException
            // Use default values assigned before the try block
        }

        PaymentInfo info = new PaymentInfo(loanAmount, annualInterestRateInPercent, loanPeriodInMonths,num0,num1,num2,num3,num4);
        PrintWriter out = response.getWriter();
        out.println(new JSONObject(info));

       /*String newInputString = request.getParameter("numbers");
        /*int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num0 = 5;
        try{
            JSONObject newInputValues = new JSONObject(newInputString);
            num1 = newInputValues.getInt("data1");
            num2 = newInputValues.getInt("data2");
            num3 = newInputValues.getInt("data3");
            num4 = newInputValues.getInt("data4");
            num0 = newInputValues.getInt("data0");
        }
        catch(Exception E){E.printStackTrace();}

        numInfo numberInfo = new numInfo(num0,num1,num2,num3,num4);
        out.println(new JSONObject(numberInfo));
        //out.println(request.getParameter("numbers"));
        //out.println("{\"num0\":\"1234\"}");
*/

    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

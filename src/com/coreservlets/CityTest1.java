package com.coreservlets;

import org.json.*;

public class CityTest1 {
  public static void main(String[] args) {
    City sf = CityUtils.getCity("San Francisco");
    JSONObject sfJSON = new JSONObject(sf);
    System.out.println("JSON version of SF is:\n" +
                       sfJSON);
  }
}

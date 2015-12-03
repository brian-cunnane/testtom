package com.coreservlets;

import org.json.*;
import java.util.*;

public class CityTest3 {
  public static void main(String[] args) {
    Map<String,String[]> cities = 
      CityUtils.getCityTypeMap();
    JSONObject citiesJSON = 
      new JSONObject(cities);
    System.out.println("JSON version of map of " +
                       "US cities is:\n" +
                       citiesJSON);
  }
}

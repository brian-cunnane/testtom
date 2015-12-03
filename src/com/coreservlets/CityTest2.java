package com.coreservlets;

import org.json.*;
import java.util.*;

public class CityTest2 {
  public static void main(String[] args) {
    List<City> biggestUSCities = 
      CityUtils.findCities("top-5-cities");
    JSONArray citiesJSON = 
      new JSONArray(biggestUSCities);
    System.out.println("JSON version of biggest " +
                       "US cities is:\n" +
                       citiesJSON);
  }
}

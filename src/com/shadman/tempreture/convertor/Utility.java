package com.shadman.tempreture.convertor;

public class Utility {
	  // converts to celsius
	  public static float convertFahrenheitToCelsius(float fahrenheit) {
	    return ((fahrenheit - 32) * 5 / 9);
	  }

	  // converts to fahrenheit
	  public static float convertCelsiusToFahrenheit(float celsius) {
	    return ((celsius * 9) / 5) + 32;
	  }
	} 
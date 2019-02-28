package com.liu.thread.forexit;

public class EvenGenerator extends IntGenerator {
	  private int currentEvenValue = 0;
	  public int next() {
	    ++currentEvenValue; // Danger point here!
	    ++currentEvenValue;
//		  currentEvenValue += 2;
	    return currentEvenValue;
	  }
	  public static void main(String[] args) {
	    EvenChecker.test(new EvenGenerator());
	  }
	}
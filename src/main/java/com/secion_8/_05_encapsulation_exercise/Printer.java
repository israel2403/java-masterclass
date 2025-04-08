package com.secion_8._05_encapsulation_exercise;

public class Printer {
  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex) {
    this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
    this.duplex = duplex;
  }

  public int addToner(int tonerAmount) {
    int tempAmount = this.tonerLevel + tonerAmount;
    if (tempAmount > 100 || tonerAmount < 0) {
      return -1;
    }
    this.tonerLevel += tonerAmount;
    return this.tonerLevel;
  }

  public int printPages(int pages) {
    int jobPages = (this.duplex) ? (pages / 2 + pages % 2) : pages;
    this.pagesPrinted += jobPages;
    return jobPages;
  }

  public int getPagesPrinted() {
    return this.pagesPrinted;
  }
}
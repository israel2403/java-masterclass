package com.secion_8._04_encapsulation;

public class Main {
  public static void main(String[] args) {
    final EnhancedPlayer player = new EnhancedPlayer("John");
    System.out.println("Player name: " + player.healthRemaining());
  }
}

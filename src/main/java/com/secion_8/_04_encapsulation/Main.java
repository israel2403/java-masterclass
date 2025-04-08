package com.secion_8._04_encapsulation;

public class Main {
  public static void main(String[] args) {
    final Player player = new Player();
    player.name = "Tim";
    player.health = 20;
    player.weapon = "Sword";

    final int damage = 10;
    player.loseHealth(damage);
    System.out.println("Player health remaining: " + player.healthRemaining());

    player.loseHealth(11);
    System.out.println("Player health remaining: " + player.healthRemaining());
  }
}

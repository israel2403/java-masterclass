package com.secion_8._04_encapsulation;

public class Player {
  public String name;
  public int health;
  public String weapon;

  public void loseHealth(int damage) {
    this.health = this.health - damage;
    if (this.health <= 0) {
      System.out.println("Player knocked out of the game");
    }

  }

  public int healthRemaining() {
    return this.health;
  }

  public void regainHealth(int health) {
    this.health = this.health + health;
    if (this.health > 100) {
      System.out.println("Player health is full");
      this.health = 100;
    }
  }

}

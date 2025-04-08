package com.secion_8._04_encapsulation;

public class EnhancedPlayer {
  private String name;
  private int health;
  private String weapon;

  public EnhancedPlayer(final String name) {
    this(name, 100, "Sword");
  }

  public EnhancedPlayer(final String name, final int health, final String weapon) {
    this.name = name;
    if (health < 0) {
      this.health = 1;
    } else if (health > 100) {
      this.health = 100;

    } else {
      this.health = health;
    }
    this.weapon = weapon;
  }

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

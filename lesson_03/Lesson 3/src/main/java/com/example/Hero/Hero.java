package com.example.Hero;

import com.example.Enemy.Enemy;
import java.util.Random;

public abstract class Hero {

  String name;

  public Hero(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract void attackEnemy(Enemy enemy);
//  {
//    Random random = new Random();
//    int damage = random.nextInt(5 - 1 + 1) + 1;
//    enemy.takeDamage(damage);
//    System.out.println("Герой наносит " + damage + " урона");
//  }
}

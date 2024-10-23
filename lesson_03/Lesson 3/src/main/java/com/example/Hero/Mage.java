package com.example.Hero;

import com.example.Enemy.Enemy;
import java.util.Random;

public class Mage extends Hero{

  public Mage(String name) {
    super(name);
  }

  @Override
  public void attackEnemy(Enemy enemy){
    Random random = new Random();
    int damage = random.nextInt(15 - 1 + 1) + 1;
    System.out.println("Маг наносит " + damage + " урона");
    enemy.takeDamage(damage);
  }
}

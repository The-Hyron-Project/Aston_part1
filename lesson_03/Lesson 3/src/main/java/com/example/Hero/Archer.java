package com.example.Hero;

import com.example.Enemy.Enemy;
import java.util.Random;

public class Archer extends Hero{

  public Archer(String name) {
    super(name);
  }

  @Override
  public void attackEnemy(Enemy enemy){
    Random random = new Random();
    int damage = random.nextInt(10 - 1 + 1) + 1;
    System.out.println("Лучник наносит " + damage + " урона");
    enemy.takeDamage(damage);
  }
}

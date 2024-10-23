package com.example.Hero;

import com.example.Enemy.Enemy;
import java.util.Random;

public class Warrior extends Hero{

  public Warrior(String name) {
    super(name);
  }

  @Override
  public void attackEnemy(Enemy enemy){
    Random random = new Random();
    int damage = random.nextInt(25 - 1 + 1) + 1;
    System.out.println("Воин наносит " + damage + " урона");
    enemy.takeDamage(damage);
  }
}

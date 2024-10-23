package com.example.Hero;

import com.example.Enemy.Enemy;
import com.example.Enemy.Mortal;

public abstract class Hero implements Mortal {

  String name;

  public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  int hp;

  public String getName() {
    return name;
  }

  public abstract void attackEnemy(Enemy enemy);

  @Override
  public boolean isAlive() {
    if(hp>0){
      return true;
    }else{
      System.out.println("Враг уже погиб.");
      return false;
    }
  }
//  {
//    Random random = new Random();
//    int damage = random.nextInt(5 - 1 + 1) + 1;
//    enemy.takeDamage(damage);
//    System.out.println("Герой наносит " + damage + " урона");
//  }

  public abstract void takeDamage(int damage);

  public abstract void ultimateAttack(Enemy enemy);
}

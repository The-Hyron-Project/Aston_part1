package com.example.Hero;

import com.example.Enemy.Enemy;
import java.util.Random;

public class Archer extends Hero{


  public Archer(String name, int hp) {
    super(name, hp);
  }

  @Override
  public void attackEnemy(Enemy enemy){
    if (isAlive()) {
    Random random = new Random();
    int damage = random.nextInt(10 - 1 + 1) + 1;
    System.out.println("Лучник " + name + " наносит " + damage + " урона");
    enemy.takeDamage(damage, this);
    } else {
      System.out.println("Лучник " + name + " погиб.");
    }
  }

  public void attackEnemyWithArrow(Enemy enemy){
    if (isAlive()) {
      Random random = new Random();
      int damage = random.nextInt(5 - 1 + 1) + 1;
      System.out.println("Лучник " + name + " наносит " + damage + " урона стрелой.");
      enemy.takeDamage(damage, this);
    } else {
      System.out.println("Лучник " + name + " погиб.");
    }
  }

  @Override
  public void takeDamage(int damage){
    if(isAlive()){
      if(hp>damage){
        hp=hp-damage;
        System.out.println("Лучник " + name + " получает " + damage + " урона. У лучника осталось " + hp + " очков здоровья.");
      }else{
        hp=0;
        System.out.println("Лучник " + name + " погибает.");
      }
    }
  }

  @Override
  public boolean isAlive() {
    if(hp>0){
      return true;
    }else{
      System.out.println("Лучник " + name + " уже погиб.");
      return false;
    }
  }

  @Override
  public void ultimateAttack(Enemy enemy) {
    if (isAlive()) {
      Random random = new Random();
      int damage = random.nextInt(110 - 31 + 1) + 31;
      System.out.println("Лучник " + name + " наносит " + damage + " урона через ультимативную атаку.");
      enemy.takeDamage(damage, this);
    } else {
      System.out.println("Лучник " + name + " погиб.");
    }
  }
}

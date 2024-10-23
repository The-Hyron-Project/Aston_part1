package com.example.Hero;

import com.example.Enemy.Enemy;
import java.util.Random;

public class Mage extends Hero{


  public Mage(String name, int hp) {
    super(name, hp);
  }

  @Override
  public void attackEnemy(Enemy enemy) {
    if (isAlive()) {
      Random random = new Random();
      int damage = random.nextInt(15 - 1 + 1) + 1;
      System.out.println("Маг " + name + " наносит " + damage + " урона");
      enemy.takeDamage(damage, this);
    } else {
      System.out.println("Маг " + name + " погиб.");
    }
  }

  public void attackEnemyWithMagic(Enemy enemy) {
    if (isAlive()) {
      Random random = new Random();
      int damage = random.nextInt(150 - 1 + 1) + 1;
      System.out.println("Маг " + name + " наносит " + damage + " урона магией.");
      enemy.takeDamage(damage, this);
    } else {
      System.out.println("Маг " + name + " погиб.");
    }
  }

  @Override
  public void takeDamage(int damage){
    if(isAlive()){
      if(hp>damage){
        hp=hp-damage;
        System.out.println("Маг " + name + " получает " + damage + " урона. У мага осталось " + hp + " очков здоровья.");
      }else{
        hp=0;
        System.out.println("Маг " + name + " погибает.");
      }
    }
  }

  @Override
  public boolean isAlive() {
    if(hp>0){
      return true;
    }else{
      System.out.println("Маг " + name + " уже погиб.");
      return false;
    }
  }

  @Override
  public void ultimateAttack(Enemy enemy) {
    if (isAlive()) {
      Random random = new Random();
      int damage = random.nextInt(175 - 55 + 1) + 55;
      System.out.println("Маг " + name + " наносит " + damage + " урона через ультимативную атаку.");
      enemy.takeDamage(damage, this);
    } else {
      System.out.println("Маг " + name + " погиб.");
    }
  }
}

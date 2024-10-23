package com.example.Hero;

import com.example.Enemy.Enemy;
import java.util.Random;

public class Warrior extends Hero{

  public Warrior(String name, int hp) {
    super(name, hp);
  }

  @Override
  public void attackEnemy(Enemy enemy){
    if(isAlive()){
      Random random = new Random();
      int damage = random.nextInt(25 - 1 + 1) + 1;
      System.out.println("Воин " + name + " наносит " + damage + " урона");
      enemy.takeDamage(damage, this);
    }else{
      System.out.println("Воин " + name + " погиб.");
    }
  }

  @Override
  public void takeDamage(int damage){
    if(isAlive()){
      if(hp>damage){
        hp=hp-damage;
        System.out.println("Воин " + name + " получает " + damage + " урона. У воина осталось " + hp + " очков здоровья.");
      }else{
        hp=0;
        System.out.println("Воин " + name + " погибает.");
      }
    }
  }

  @Override
  public void ultimateAttack(Enemy enemy) {
    if(isAlive()){
      Random random = new Random();
      int damage = random.nextInt(125 - 75 + 1) + 75;
      System.out.println("Воин " + name + " наносит " + damage + " урона через ультимативную атаку.");
      enemy.takeDamage(damage, this);
    }else{
      System.out.println("Воин " + name + " погиб.");
    }
  }

  @Override
  public boolean isAlive() {
    if(hp>0){
      return true;
    }else{
      System.out.println("Воин " + name + " уже погиб.");
      return false;
    }
  }

  public void attackMultipleEnemies(Enemy enemy1, Enemy enemy2, Enemy enemy3){
    if(isAlive()){
      Random random = new Random();
      int damage = random.nextInt(125 - 75 + 1) + 75;
      System.out.println("Воин " + name + " наносит " + damage + " урона первому врагу.");
      enemy1.takeDamage(damage, this);
      damage = random.nextInt(125 - 75 + 1) + 75;
      System.out.println("Воин " + name + " наносит " + damage + " урона второму врагу.");
      enemy2.takeDamage(damage, this);
      damage = random.nextInt(125 - 75 + 1) + 75;
      System.out.println("Воин " + name + " наносит " + damage + " урона третьему врагу.");
      enemy3.takeDamage(damage, this);
    }else{
      System.out.println("Воин " + name + " погиб.");
    }
  }
}

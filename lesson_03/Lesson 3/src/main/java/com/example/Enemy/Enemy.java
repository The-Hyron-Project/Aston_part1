package com.example.Enemy;

import com.example.Hero.Hero;
import java.util.Random;

public class Enemy implements Mortal{
  int hp;

  public Enemy(int hp) {
    this.hp = hp;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void takeDamage(int damage, Hero hero){
    if(isAlive()){
      if(hp>damage){
        hp=hp-damage;
        System.out.println("Враг получает " + damage + " урона. У врага осталось " + hp + " очков здоровья.");
        returnDamage(hero);
      }else{
        hp=0;
        System.out.println("Враг погибает.");
      }
    }
  }

  public void returnDamage(Hero hero){
    if(isAlive()){
      Random random = new Random();
      int returnDamage = random.nextInt(25 - 1 + 1) + 1;
      System.out.println("Враг наносит " + returnDamage + " ответного урона");
      hero.takeDamage(returnDamage);
    }else{
      System.out.println("Враг погиб.");
    }
  }

  @Override
  public boolean isAlive() {
    if(hp>0){
      return true;
    }else{
      System.out.println("Враг уже погиб.");
      return false;
    }
  }
}

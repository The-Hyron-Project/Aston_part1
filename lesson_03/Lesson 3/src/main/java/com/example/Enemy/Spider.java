package com.example.Enemy;

import com.example.Hero.Hero;
import java.util.Random;

public class Spider extends Enemy{

  public Spider(int hp) {
    super(hp);
  }

  public void takeDamage(int damage, Hero hero){
    if(isAlive()){
      if(hp>damage){
        hp=hp-damage;
        System.out.println("Шелоб получает " + damage + " урона. У Шелоб осталось " + hp + " очков здоровья.");
        returnDamage(hero);
      }else{
        hp=0;
        System.out.println("Шелоб погибает.");
      }
    }
  }

  public void returnDamage(Hero hero){
    if(isAlive()){
      Random random = new Random();
      int returnDamage = random.nextInt(55 - 11 + 1) + 11;
      System.out.println("Шелоб наносит " + returnDamage + " ответного урона");
      hero.takeDamage(returnDamage);
    }else{
      System.out.println("Шелоб погиб.");
    }
  }

  @Override
  public boolean isAlive() {
    if(hp>0){
      return true;
    }else{
      System.out.println("Шелоб уже погиб.");
      return false;
    }
  }
}

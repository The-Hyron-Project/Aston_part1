package com.example.Enemy;

import com.example.Hero.Hero;
import java.util.Random;

public class Dragon extends Enemy{

  public Dragon(int hp) {
    super(hp);
  }

  @Override
  public void takeDamage(int damage, Hero hero){
    if(isAlive()){
      if(hp>damage){
        hp=hp-damage;
        System.out.println("Дракон получает " + damage + " урона. У дракона осталось " + hp + " очков здоровья.");
        returnDamage(hero);
      }else{
        hp=0;
        System.out.println("Дракон погибает.");
      }
    }
  }

  @Override
  public void returnDamage(Hero hero){
    if(isAlive()){
      Random random = new Random();
      int returnDamage = random.nextInt(25 - 1 + 1) + 1;
      System.out.println("Дракон наносит " + returnDamage + " ответного урона");
      hero.takeDamage(returnDamage);
    }else{
      System.out.println("Дракон погиб.");
    }
  }

  @Override
  public boolean isAlive() {
    if(hp>0){
      return true;
    }else{
      System.out.println("Дракон уже погиб.");
      return false;
    }
  }
}

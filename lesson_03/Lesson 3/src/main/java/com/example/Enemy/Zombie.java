package com.example.Enemy;

import com.example.Hero.Hero;
import java.util.Random;

public class Zombie extends Enemy{

  public Zombie(int hp) {
    super(hp);
  }

  @Override
  public void takeDamage(int damage, Hero hero){
    if(isAlive()){
      if(hp>damage){
        hp=hp-damage;
        System.out.println("Зомби получает " + damage + " урона. У зомби осталось " + hp + " очков здоровья.");
        returnDamage(hero);
      }else{
        System.out.println("Зомби погибает.");
        Random random = new Random();
        hp = random.nextInt(150 - 0 + 1) + 0;
        if(hp!=0){
          System.out.println("Зомби воскресает с " + hp + " очков здоровья.");
          returnDamage(hero);
        }
      }
    }
  }

  @Override
  public void returnDamage(Hero hero){
    if(isAlive()){
      Random random = new Random();
      int returnDamage = random.nextInt(15 - 1 + 1) + 1;
      System.out.println("Зомби наносит " + returnDamage + " ответного урона");
      hero.takeDamage(returnDamage);
    }else{
      System.out.println("Зомби погиб.");
    }
  }

  @Override
  public boolean isAlive() {
    if(hp>0){
      return true;
    }else{
      System.out.println("Зомби уже погиб.");
      return false;
    }
  }
}

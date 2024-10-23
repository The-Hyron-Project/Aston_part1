package com.example.Enemy;

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

  public void takeDamage(int damage){
    if(isAlive()){
      if(hp>damage){
        hp=hp-damage;
        System.out.println("Враг получает " + damage + " урона. У врага осталось " + hp + " очков здоровья.");
      }else{
        hp=0;
        System.out.println("Враг погибает.");
      }
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

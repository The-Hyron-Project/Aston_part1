package com.example;

import com.example.Enemy.Enemy;
import com.example.Hero.Archer;
import com.example.Hero.Mage;
import com.example.Hero.Warrior;

public class BattleGround {

  public static void main(String[] args) {
    Enemy enemy = new Enemy(100);
    Warrior warrior = new Warrior("Warrior");
    warrior.attackEnemy(enemy);
    Archer archer = new Archer("Archer");
    archer.attackEnemy(enemy);
    Mage mage = new Mage("Mage");
    mage.attackEnemy(enemy);
  }
}
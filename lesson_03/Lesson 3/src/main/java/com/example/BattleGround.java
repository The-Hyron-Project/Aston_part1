package com.example;

import com.example.Enemy.Dragon;
import com.example.Enemy.Enemy;
import com.example.Enemy.Spider;
import com.example.Enemy.Zombie;
import com.example.Hero.Archer;
import com.example.Hero.Mage;
import com.example.Hero.Warrior;

public class BattleGround {

  public static void main(String[] args) {
    Enemy enemy = new Enemy(1000);
    System.out.println("---------------------------------");
    Warrior warrior = new Warrior("Warrior", 200);
    warrior.attackEnemy(enemy);
    warrior.ultimateAttack(enemy);
    System.out.println("---------------------------------");
    Archer archer = new Archer("Archer", 75);
    archer.attackEnemy(enemy);
    archer.ultimateAttack(enemy);
    System.out.println("---------------------------------");
    Mage mage = new Mage("Mage", 100);
    mage.attackEnemy(enemy);
    mage.ultimateAttack(enemy);
    System.out.println("---------------------------------");
    Dragon dragon = new Dragon(1500);
    Spider spider = new Spider(500);
    Zombie zombie = new Zombie(50);
    warrior.attackEnemy(dragon);
    warrior.ultimateAttack(dragon);
    System.out.println("---------------------------------");
    warrior.attackEnemy(spider);
    warrior.ultimateAttack(spider);
    System.out.println("---------------------------------");
    warrior.attackEnemy(zombie);
    warrior.ultimateAttack(zombie);
    System.out.println("---------------------------------");
    warrior.attackMultipleEnemies(dragon,spider,zombie);
    archer.attackEnemyWithArrow(zombie);
    mage.attackEnemyWithMagic(spider);

  }
}
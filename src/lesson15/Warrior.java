package lesson15;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ударил мечом " + enemy.getName() );
        enemy.takeDamage(getDamage());
    }
}

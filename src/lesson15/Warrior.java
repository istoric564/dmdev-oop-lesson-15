package lesson15;

import Lesson18.weapon.MeleeWeapon;

import java.util.Random;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " ударил мечом " + enemy.getName() );
        enemy.takeDamage(getDamage());
    }
}

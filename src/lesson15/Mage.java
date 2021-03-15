package lesson15;

import Lesson18.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {
    public Mage(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName() + " бросает фаербол в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

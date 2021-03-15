package lesson15;

import java.util.Random;

public class Archer extends Hero {
    public Archer(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName() + " выпустил три стрелы в " + enemy.getName() );
        enemy.takeDamage(getDamage());
    }
}

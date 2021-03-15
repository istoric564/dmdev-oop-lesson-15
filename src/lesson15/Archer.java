package lesson15;

import Lesson18.weapon.RangeWeapon;

import java.util.Random;

public class Archer<T extends RangeWeapon> extends Hero<T> {
    private Wolf wolf;

    public Archer(String name, int damage, int health) {
        super(name, damage, health);
        this.wolf = new Wolf("Wold", 7);

    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName() + " выпустил три стрелы в " + enemy.getName() );
        wolf.attackEnemy(enemy);
    }
    private class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
        public void attackEnemy(Enemy enemy){
            System.out.println(name + " и " + Archer.this.getName() + " наносят урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}

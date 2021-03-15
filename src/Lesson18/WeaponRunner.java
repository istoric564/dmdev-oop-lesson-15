package Lesson18;

import Lesson18.weapon.Bow;
import Lesson18.weapon.Sword;
import Lesson18.weapon.Weapon;
import lesson15.Archer;
import lesson15.Hero;
import lesson15.Warrior;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Legolas", 15,100);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Boromir",18,100);
        warrior.setWeapon(new Sword());

        printWeaponDamage(archer);
    }
//    ? extends Weapon (все до оружия) super
    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero){

        System.out.println(hero.getWeapon().getDamage());
    }
}

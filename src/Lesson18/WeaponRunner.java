package Lesson18;

import Lesson18.weapon.Bow;
import Lesson18.weapon.Sword;
import lesson15.Archer;
import lesson15.Warrior;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Legolas", 15,100);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Boromir",18,100);
        warrior.setWeapon(new Sword());
    }
}

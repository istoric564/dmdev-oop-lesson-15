package lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero mage = new Mage("Gendalf", 25, 100);
        Hero warrior = new Warrior("Boromir", 20, 100);
        Hero archer = new Archer("Legolas",  15, 100);
        Enemy enemy = new Enemy("Zombi", 100);
        attackEnemy(enemy, mage, warrior, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()){
                    hero.attackEnemy(enemy);
                }

            }
        }
    }
}

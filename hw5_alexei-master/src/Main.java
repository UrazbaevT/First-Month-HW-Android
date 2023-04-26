public class Main {
    public static void main(String[] args) {

        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero" + (i + 1) + " health: " + createHeroes()[i].getHealth() + "; Hero: " + (i + 1) + " heroes damage; " + createHeroes()[i].getDamage() + "; Hero " + (i + 1) + " UltimateSkill: " + createHeroes()[i].getUltimateSkill());
        }

        Hero heroes = new Hero(20, 100, "Blessing of the god of war - Ares");
        System.out.println("Hero:" + " damage: " + heroes.getDamage() + " ; Health: " + heroes.getHealth() + " ; Ultimate Skill: " + heroes.getUltimateSkill());
        Hero heroes2 = new Hero(30, 130);
        System.out.println("HeroS2: " + " Damage: " + heroes2.getDamage() + "; Health: " + heroes2.getHealth());

        Boss boss = new Boss();
        boss.setBossDamage(35);
        boss.setBossHealth(400);
        boss.setTypeOfDefence("Physic Type Of Defence");
        System.out.println("Boss: " + " BossDamage: " + boss.getBossDamage() + " ; BossHealth: " + boss.getBossHealth() + " ; Type Of Defence : " + boss.getTypeOfDefence());
    }


    public static Hero heroWithUltimate(int damage, int health, String ultimateAbility) {
        Hero hero = new Hero(health, damage, ultimateAbility);
        return hero;
    }


    public static Hero withoutUltimate(int damage, int health) {
        Hero hero = new Hero(damage, health);
        return hero;
    }

    public static Hero[] createHeroes() {

        Hero hero3 = withoutUltimate(20, 100);
        Hero hero4 = heroWithUltimate(15, 200, "Speed of Hermes");
        Hero hero5 = heroWithUltimate(35, 300, "foresight");

        Hero[] heroesOfWorld = {hero3, hero4, hero5};
        return heroesOfWorld;
    }
}
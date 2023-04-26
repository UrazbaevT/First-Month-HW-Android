package kg.geektech.game.players;


import kg.geektech.game.genaral.RPG_Game;

public class IronMan extends Hero {

    public IronMan(int health, int damage, String name) {
        super(health, damage, SuperAbility.IRON_MAN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int ability = RPG_Game.random.nextInt(12);
        switch (ability) {
            case 0 -> {
                if (this.getHealth() > 0) {
                    boss.setHealth(boss.getHealth() - 100);
                    System.out.println("Железный человек выстрелил в босса лазером");
                }
            }
            case 1 -> {
                for (int i = 0; i < heroes.length; i++) {
                    if (this.getHealth() > 0 && heroes[i].getHealth() > 0 && this != heroes[i]) {
                        heroes[i].setDamage(heroes[i].getDamage() + 10);
                    }
                }
                System.out.println("Железный человек снабдил свою команду новым оружием, их урон увеличен на 20");
            }
            case 2 -> {
                for (int i = 0; i < heroes.length; i++) {
                    if (heroes[i].getHealth() > 0 && this != heroes[i] && this.getHealth() > 0) {
                        heroes[i].setHealth(heroes[i].getHealth() + 50);
                    }
                }
                System.out.println("Железный человек вызвал своих лечебных дронов и увеличил их здоровье на 50");
            }
        }
    }
}
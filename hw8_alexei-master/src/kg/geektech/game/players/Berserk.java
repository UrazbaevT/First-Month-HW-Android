package kg.geektech.game.players;

import kg.geektech.game.genaral.RPG_Game;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int getDamageOfBerserk = boss.getDamage() + this.getDamage();
        System.out.println("Берсерк нанёс заблокированный удар: " + getDamageOfBerserk);
        boss.setHealth(boss.getHealth() - getDamageOfBerserk);
    }
}

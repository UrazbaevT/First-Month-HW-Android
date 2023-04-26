public class Boss extends GameEntity {

    Weapon weapon = new Weapon();

    public String printInfo() {
        return "Boss Health: " + getHealth() + "; Boss damage: " + getDamage() + "; Boss weapon: " + weapon.getNameOfWeapon("Infinity Gauntlet") + "; Boss weapon type: " + weapon.getWeapon();
    }
}
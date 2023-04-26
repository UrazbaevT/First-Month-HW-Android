public class Hero {
    int damage;
    int health;
    String ultimateSkill;

    public Hero(int theDamage, int theHealth, String theUltimateSkill){
        damage = theDamage;
        health = theHealth;
        ultimateSkill = theUltimateSkill;
    }
    public Hero(int damage, int health){
        this.damage = damage;
        this.health = health;
    }

    public int getHealth() {

        return this.health;
    }

    public int getDamage() {

        return this.damage;
    }

    public String getUltimateSkill(){

        return this.ultimateSkill;
    }
}

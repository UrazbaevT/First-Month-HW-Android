public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String typeOfDefence;

    public int getBossHealth() {
        return this.bossHealth;
    }
    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }
    public int getBossDamage() {
        return this.bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getTypeOfDefence() {
        return typeOfDefence;
    }
    public void setTypeOfDefence(String typeOfDefence) {
        this.typeOfDefence = typeOfDefence;
    }
}

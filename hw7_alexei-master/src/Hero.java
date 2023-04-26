public abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    private String abilityType;

    public String getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(String abilityType) {
        this.abilityType = abilityType;
    }
}

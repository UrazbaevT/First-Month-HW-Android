public class Warrior extends Hero{

    @Override
    public void applySuperAbility() {
        setAbilityType("CRITICAL DAMAGE!!!");
        System.out.println("Warrior применил суперспособность " + getAbilityType());
    }
}

public class Medic extends Hero{
    public static void increaseExperience(){
        int healPoint = 0;
        healPoint = healPoint + (healPoint/10);
    }

    @Override
    public void applySuperAbility() {
        setAbilityType("SUPER TREATMENT!!!");
        System.out.println("Medic применил суперспособность " + getAbilityType());
    }
}

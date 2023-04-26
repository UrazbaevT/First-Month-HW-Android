public class Magic extends Hero{

    @Override
    public void applySuperAbility() {
        setAbilityType("MAGIC BEAM!!!");
        System.out.println("Magic применил суперспособность " + getAbilityType());
    }
}

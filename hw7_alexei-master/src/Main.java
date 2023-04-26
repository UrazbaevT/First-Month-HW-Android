public class Main {
    public static void main(String[] args) {
        HavingSuperAbility havingSuperAbility[] = {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < havingSuperAbility.length; i++) {
            havingSuperAbility[i].applySuperAbility();
            if (havingSuperAbility[i] instanceof Medic){
                Medic medic = (Medic) havingSuperAbility[i];
                medic.increaseExperience();
            }
        }
    }
}
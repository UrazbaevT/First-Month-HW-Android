import java.util.Random;

public class Main {

    public static int bossHealth = 1000;
    public static int bossDamage = 50;
    public static String bossDefenceType;

    public static int[] heroesHealth = {260, 270, 20, 260, 200, 300, 250, 220};
    public static int[] heroesDamage = {25, 20, 15, 0, 15, 10, 15, 20};
    public static String[] heroesAttackType = {"1. Physical", "2. Magical", "3. Kinetic", "4. Medic", "5. Lucky", "6. Golem", "7. Berserk", "8. Thor"};
    public static int roundNumber = 0;


    public static void main(String[] args) {
        printStatistics();
        while (!isGameFinished()) {
            playRound();
        }
    }


    public static void playRound() {
        roundNumber++;
        chooseBossDefence();
        treatMedic();
        lucky();
        Thor();
        defenceGolem();
        berserkShoot();
        bossHits();
        heroesHit();
        printStatistics();
    }


    public static void printStatistics() {
        System.out.println("ROUND " + roundNumber + " ------------------------");
        String defence;
        /*if(bossDefenceType == null){
            defence = "No defence";
        }else{
            defence = bossDefenceType;
        }*/
        System.out.println("! Boss health !: " + bossHealth + "; damage: " + bossDamage + "; boss defence: " + (bossDefenceType == null ? "No defence" : bossDefenceType));
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i] + " health: " + heroesHealth[i] + "; damage: " + heroesDamage[i]);
        }
    }

    public static void chooseBossDefence() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefenceType = heroesAttackType[randomIndex];
    }

    public static void lucky() {
        Random random = new Random();
        boolean chance = random.nextBoolean();
        if (heroesHealth[4] > 0 && chance) {
            heroesHealth[4] = heroesHealth[4] + bossDamage - bossDamage / 5;
        }




        System.out.println("Уклоняется? : " + chance);

    }

    public static void defenceGolem() {
        int damage = bossDamage / 5;
        int allHealht = 0;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (i == 5) {
                continue;
            } else if (heroesHealth[i] > 0) {
                allHealht++;
                heroesHealth[i] += damage;

            }
            heroesHealth[5] -= damage * allHealht;
            System.out.println("Принимает: " + damage * allHealht);
            break;
        }
    }

    public static void treatMedic() {
        if (heroesHealth[3] > 0 && heroesHealth[3] < 100) {
            int healAmount = new Random().nextInt(30);
            for (int i = 0; i < heroesHealth.length - 1; i++) {
                if (heroesHealth[i] < 100 && heroesHealth[i] > 0) {
                    heroesHealth[i] += healAmount; // heroesHealth[i] = heroesHealth[i] + healAmount;
                    System.out.println("Medic heals " + heroesAttackType[i] + " for " + healAmount + " health units.");
                    break;
                }
            }
        }
    }

    public static boolean isGameFinished() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
       /*if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0 && heroesHealth[2] <= 0) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;*/
        boolean allHeroesDead = true;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    public static void bossHits() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] - bossDamage < 0) {
                heroesHealth[i] = 0;
            } else {
                heroesHealth[i] = heroesHealth[i] - bossDamage;
            }


        }
    }

    public static void heroesHit() {
        for (int i = 0; i < heroesDamage.length; i++) {
            int hit = heroesDamage[i];
            if (heroesAttackType[i] == bossDefenceType) {
                Random random = new Random();
                int coeff = random.nextInt(6) + 2;
                hit = heroesDamage[i] * coeff;
                System.out.println("Critical damage: " + hit);
            }
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                if (bossHealth - hit < 0) {
                    bossHealth = 0;
                } else {
                    bossHealth = bossHealth - hit;
                }
            }
        }
    }

    public static void Thor() {
        Random random = new Random();
        boolean Thor = random.nextBoolean();
        if (Thor) {
            bossDamage = 0;
            System.out.println("Boss оглушён");
        } else {
            bossDamage = 50;
        }
    }


    public static void berserkShoot() {
        Random random = new Random();
        int randomDamage = random.nextInt(15) + 1;
        int randomC = random.nextInt(3) + 1;
        if (heroesHealth[4] > 0 && bossHealth > 0) {
            switch (randomC) {
                case 1:
                    heroesDamage[4] = (heroesDamage[4] + bossDamage) - randomDamage;
                    System.out.println("Берсерк урон критический");
                    System.out.println("При потерии увеличений урон у берсерка" + randomDamage);
                    break;
                case 2:
                    bossDamage = 50;
                    break;
                case 3:
                    bossDamage = 50;
                    break;
            }
        }
    }
}
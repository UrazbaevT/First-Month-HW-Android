public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);
        boss.weapon.setNameOfWeapon("Infinity Gauntlet");
        boss.weapon.setWeapon(WeaponType.MAGICAL_WEAPON);
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(450);
        skeleton.setDamage(25);
        skeleton.setArrows(15);
        skeleton.weapon.setNameOfWeapon("Shoot arrows");
        skeleton.weapon.setWeapon(WeaponType.HOT_WEAPON);
        System.out.println("Skeleton health: " + skeleton.getHealth() + "; Skeleton damage: "+ skeleton.getDamage() + "; Skeleton arrows: " + skeleton.getArrows()
                + "; Skeleton weapon: " + skeleton.weapon.getWeapon() + "; Skeleton weapon type: " + skeleton.weapon.getNameOfWeapon("Shoot arrows"));

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(400);
        skeleton2.setDamage(20);
        skeleton2.setArrows(20);
        skeleton2.weapon.setNameOfWeapon("Shoot arrows");
        skeleton2.weapon.setWeapon(WeaponType.HOT_WEAPON);
        System.out.println(skeleton2.printInfo());
    }
}
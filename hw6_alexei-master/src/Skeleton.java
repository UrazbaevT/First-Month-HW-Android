public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return "Skeleton Health: " + getHealth() + "; Skeleton damage: " + getDamage() + "; Skeleton weapon: " + weapon.getNameOfWeapon("Shoot arrows") + "; Skeleton weapon type: " + weapon.getWeapon() + "; Arrows: " + this.arrows;
    }
}

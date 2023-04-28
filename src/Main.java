

interface HavingSuperAbility {
    void applySuperAbility();
}
abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }
}
class Magic extends Hero {
    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbilityType + ";");
    }
}
class Medic extends Hero {
    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbilityType + ";");
    }
}
class Warrior extends Hero {
    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + superAbilityType + ";");
    }
}
class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[]{
                new Magic(450, 47, "TELEPORTATION"),
                new Medic(250, 34, "HEALING"),
                new Warrior(300, 42, "CRITICALDAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
 }
}}

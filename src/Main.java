public class Main {
    public static void main(String[] args){

        Boss theBoss = new Boss();
        theBoss.setBossHealth(1000);
        theBoss.setBossDamage(100);
        theBoss.setBossDefence("Physical");
        System.out.println("BOSS HEALTH IS " + theBoss.getBossHealth() +
                ", DAMAGE " + theBoss.getBossDamage() + ", DEFENCE " + theBoss.getBossDefence());

        Hero[] heroes = createHeroes();
        for (Hero hero: heroes) {
            System.out.println("Super Power: " + hero.getHeroesSuperPower());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Health: " + hero.getHealth());
        }
    }

    public static Hero[] createHeroes(){
        Hero firstHero = new Hero(100, 15, "Magic");
        Hero seconHero = new Hero(160, 25, "Kinetic");
        Hero thirdHero = new Hero(190, 30, "Fly");
        Hero[] heroes = {firstHero, seconHero, thirdHero};
        return heroes;

    }
}
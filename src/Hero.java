public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String heroesSuperPower;

    public Hero(int heroesHealth, int heroesDamage, String heroesSuperPower){
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.heroesSuperPower = heroesSuperPower;
    }

    public Hero(int heroesHealth, int heroesDamage){
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getHealth(){
        return heroesHealth;
    }

    public int getDamage(){
        return heroesDamage;
    }

    public String getHeroesSuperPower() {
        return heroesSuperPower;
    }
}

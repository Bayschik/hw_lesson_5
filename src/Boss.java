public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefence;




    //GETTERS
    public int getBossHealth(){
        return bossHealth;
    }

    public int getBossDamage(){
        return bossDamage;
    }

    public String getBossDefence(){
        return bossDefence;
    }

    //SETTERS
    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }
}

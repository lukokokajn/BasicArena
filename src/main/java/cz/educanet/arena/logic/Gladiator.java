package cz.educanet.arena.logic;

import java.util.Random;

public class Gladiator {
    /**
     * Name of the gladiator
     */
    private String name;
    private int hp;
    private int basehp;
    private int dmgmin;
    private int dmgmax;

    public void setHp(int a){
        hp=a;
    }
    public int getHp() {
        return hp;
    }

    public void setDmgmin(int dmgmin) {
        this.dmgmin = dmgmin;
    }

    public int getDmgmin() {
        return dmgmin;
    }

    public void setDmgmax(int dmgmax) {
        this.dmgmax = dmgmax;
    }

    public int getDmgmax() {
        return dmgmax;
    }
    // TODO: Add the rest of the properties
    // TODO: Generate/create getters and setters for these properties

    public Gladiator(){
        name = "";
        hp = 10;
        basehp = 10;
        dmgmin = 0;
        dmgmax = 10;
    }

    public void setBasehp(int basehp) {
        this.basehp = basehp;
    }

    public int getBasehp() {
        return basehp;
    }

    /**
     * @return true if hp is <= 0, else false
     */
    public boolean isDead() {
        if(hp <= 0){
            return true;
        }
        return false;
   }

   public String tostring(){
        String str = name + " [";
        int i;
       for (i = 0; i < hp; i = i + 5) {
           str = str + "#";
       }
       for (int j = i; j < basehp; j = j + 5) {
           str = str + " ";
       }
       str = str + "]";
       return str;
   }

    /**
     * Generates a random value between min. damage and max. damage and deals it to the enemy.
     * @param enemy Enemy gladiator
     */
    public void dealDamage(Gladiator enemy) {
        Random random = new Random();
        int damage = random.nextInt(dmgmax - dmgmin) + dmgmin;
        int hpenemy = enemy.getHp();
        enemy.setHp(hpenemy - damage);
        //Zalgoren útočí s úderem za 27 hp
        System.out.println(name + " útočí s úderem za " + damage + " hp");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

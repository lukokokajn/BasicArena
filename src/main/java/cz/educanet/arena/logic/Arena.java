package cz.educanet.arena.logic;

/**
 * Represents the arena.
 */
public class Arena {

    private Gladiator gladiator1;
    private Gladiator gladiator2;
    /**
     * Represents the current round. This property is incremented each round.
     */
    private int round = 0;

    /**
     * Makes the gladiators fight one round.
     */
    public void fight() {
        round++;
        System.out.println("---------- " + round + ". kolo ---------");
        // Gladiator 1 should deal (random) damage to Gladiator 2
        gladiator1.dealDamage(gladiator2);
        // Gladiator 2 should deal (random) damage to Gladiator 1
        if(!gladiator2.isDead()){
            gladiator2.dealDamage(gladiator1);
        }
        System.out.println(gladiator1.tostring());
        System.out.println(gladiator2.tostring());
    }

    /**
     * @return the winner, null if none.
     */
    public Gladiator getWinner() {
        if(gladiator1.isDead()){
            System.out.println(gladiator1.getName() + " utrpěl poškození a zemřel");
            System.out.println("Vítěz " + gladiator2.getName());
            return gladiator2;
        }
        if (gladiator2.isDead()){
            System.out.println(gladiator2.getName() + " utrpěl poškození a zemřel");
            System.out.println("Vítěz " + gladiator1.getName());
            return gladiator1;
        }
        return null;
    }

    public void setGladiator1(Gladiator gladiator1) {
        this.gladiator1 = gladiator1;
    }

    public void setGladiator2(Gladiator gladiator2) {
        this.gladiator2 = gladiator2;
    }
}

package cz.educanet.arena.data;

import cz.educanet.arena.logic.Gladiator;

import java.io.*;

/**
 * Utils class that saves and loads gladiators.
 */
public class GladiatorDatabase {

    /**
     * @param filename path to the gladiator file.
     * @return loaded Gladiator
     */
    public static Gladiator loadGladiator(String filename) {
        Gladiator glad1 = new Gladiator();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            try {
                String str = br.readLine();
                String[] pole = str.split(";");
                glad1.setName(pole[0]);
                glad1.setHp(Integer.parseInt(pole[1]));
                glad1.setBasehp(glad1.getHp());
                glad1.setDmgmin(Integer.parseInt(pole[2]));
                glad1.setDmgmax(Integer.parseInt(pole[3]));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return glad1;
    }

    /**
     * Saves the gladiator.
     * @param filename path to save too.
     * @param gladiator Gladiator to save.
     */
    public static void saveGladiator(String filename, Gladiator gladiator) {
        // TODO:
        throw new UnsupportedOperationException();
    }

}

package me.tim;

import hamster.Hamster;
import hamster.Territorium;
import me.tim.app.impl.TimAlgorithm;

import java.io.File;

/**
 * Start-Klasse des Hamsters.
 *
 * @author Tim
 * @since 24.11.2022
 */
public class Bootstrap extends Hamster {
    static {
        File f = new File("Territorien/default.ter");
        if (!f.exists()) {
            System.err.println("Default Terrain couldn't be loaded!");
        }
        Territorium.ladeTerritorium(f.getPath());
    }

    public Bootstrap() {
        super(1, 1, 1, 1);
        new TimAlgorithm(this).run();
    }

    public static void main(String[] args) {
        new Bootstrap();
    }
}

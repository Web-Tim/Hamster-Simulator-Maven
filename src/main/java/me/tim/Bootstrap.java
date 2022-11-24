package me.tim;

import hamster.Hamster;
import me.tim.app.impl.TimAlgorithm;

/**
 * Start-Klasse des Hamsters.
 *
 * @author Tim
 * @since 24.11.2022
 */
public class Bootstrap extends Hamster {
    public Bootstrap() {
        super(1, 1, 1, 1);
        new TimAlgorithm(this).run();
    }

    public static void main(String[] args) {
        new Bootstrap();
    }
}

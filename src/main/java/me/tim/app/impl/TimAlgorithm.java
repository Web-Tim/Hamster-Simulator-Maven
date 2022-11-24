package me.tim.app.impl;

import hamster.Hamster;
import me.tim.app.Algorithm;

/**
 * Tim-Algorithmus (erbt von der Algorithmus Klasse)
 *
 * @author Tim
 * @since 24.11.2022
 */
public class TimAlgorithm extends Algorithm {
    public TimAlgorithm(Hamster hamster) {
        super(hamster);
    }

    @Override
    public void run() {
        this.turnRight();
    }
}

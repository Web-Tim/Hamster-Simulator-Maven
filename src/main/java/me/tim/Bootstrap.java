package me.tim;

import hamster.Hamster;

/**
 * Start-Klasse des Hamsters.
 *
 * @author Tim
 * @since 24.11.2022
 */
public class Bootstrap extends Hamster {
    public Bootstrap() {
        super(1, 1, 1, 1);
    }

    public static void main(String[] args) {
        new Bootstrap();
    }
}

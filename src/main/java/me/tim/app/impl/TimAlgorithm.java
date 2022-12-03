package me.tim.app.impl;

import hamster.Hamster;
import me.tim.app.Algorithm;
import me.tim.util.Vec2i;

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
        this.wegSuche();
    }

    private void checkWalk(Direction direction) {
        if (hamster.vornFrei()) {
            hamster.vor();
        }else {
            this.turn(direction);
        }
    }

    public void wegSuche() {
        Vec2i position = new Vec2i(hamster.getSpalte(), hamster.getReihe());
        while (hamster.getAnzahlKoerner() <= 3) {
            if (hamster.kornDa()) hamster.nimm();

            if (!this.rechtsFrei() && !this.linksFrei() && !hamster.vornFrei()) {
                this.umkehren();
            }

            if (!this.linksFrei()) {
                this.checkWalk(Direction.RIGHT);
            }else {
                this.turnLeft();
                this.checkWalk(Direction.RIGHT);
            }
            System.out.println(position.getX() + ":" + position.getY());
            System.out.println("Tick completed, Total Rotations: " + this.getRotations());
        }
        System.out.println("Der hamster hat " + hamster.getAnzahlKoerner() + " körner!");
        System.exit(0);
    }
}

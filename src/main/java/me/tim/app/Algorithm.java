package me.tim.app;

import hamster.Hamster;

/**
 * Abstrakte Klasse zur definition eines Algorithmus
 *
 * @author Tim
 * @since 24.11.2022
 */
@SuppressWarnings("unused")
public abstract class Algorithm {
    protected Hamster hamster;

    public Algorithm(Hamster hamster) {
        this.hamster = hamster;
    }

    public abstract void run();

    protected void turn(Direction direction) {
        switch (direction) {
            case LEFT:
                this.hamster.linksUm();
                break;
            case RIGHT:
                // 3*Links = Rechts
                for (int i = 0; i < 3; i++) {
                    this.hamster.linksUm();
                }
                break;
        }
    }

    protected void turnRight() {
        this.turn(Direction.RIGHT);
    }

    protected void turnLeft() {
        this.turn(Direction.LEFT);
    }

    protected void moveForward(int fields) {
        for (int i = 0; i < fields; i++) {
            this.hamster.vor();
        }
    }

    protected enum Direction {
        LEFT,
        RIGHT
    }
}

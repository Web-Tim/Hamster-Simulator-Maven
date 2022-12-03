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
    private int rotations;

    public Algorithm(Hamster hamster) {
        this.hamster = hamster;
    }

    public abstract void run();

    protected void turn(Direction direction) {
        switch (direction) {
            case LEFT:
                this.hamster.linksUm();
                this.rotations++;
                break;
            case RIGHT:
                // 3*Links = Rechts
                for (int i = 0; i < 3; i++) {
                    this.hamster.linksUm();
                    this.rotations++;
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

    protected void umkehren(){
        for(int n=0; n<2; n++){
            this.turnLeft();
        }
    }

    protected boolean linksFrei(){
        this.turnLeft();
        if (hamster.vornFrei())
        {
            this.turnRight();
            return true;
        }
        else
        {
            this.turnRight();
            return false;
        }
    }

    protected boolean rechtsFrei(){
        this.turn(Direction.RIGHT);
        if (hamster.vornFrei())
        {
            this.turnLeft();
            return true;
        }
        else
        {
            this.turnLeft();
            return false;
        }
    }

    protected boolean linksKorn(){
        this.turnLeft();
        hamster.vor();
        if(hamster.kornDa()){
            umkehren();
            hamster.vor();
            this.turnLeft();
            return true;
        }
        else return false;
    }
    protected boolean rechtsKorn(){
        this.turnRight();
        hamster.vor();
        if(hamster.kornDa()){
            umkehren();
            hamster.vor();
            this.turnRight();
            return true;
        }
        else return false;
    }

    protected int getRotations() {
        return this.rotations;
    }

    protected enum Direction {
        LEFT,
        RIGHT
    }
}

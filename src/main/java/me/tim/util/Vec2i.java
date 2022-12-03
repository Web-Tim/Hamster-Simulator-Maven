package me.tim.util;

@SuppressWarnings("unused")
public class Vec2i {
    private int x, y;

    public Vec2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vec2i vec2i) {
        this.setX(vec2i.getX());
        this.setY(vec2i.getY());
    }

    public void set(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

package ie.tudublin;

import processing.core.PVector;

public class Player {

    private PVector pos;
    private float rotation;
    int col;
    private float width;
    private float height;
    private float HalfH;

    YASC yasc;

    public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRotation() {
        return rotation;
    }
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getHalfH() {
        return HalfH;
    }
    public void setHalfH(float halfH) {
        HalfH = halfH;
    }
    public Player(YASC yasc, float x, float y, float rotation, int col, float width) {
        this.yasc = yasc;
        this.pos = new PVector(x, y);
        this.rotation = rotation;
        this.col = col;
        this.width = width;
        this.HalfH = width * 0.5f;
    }

    public void render() {
        yasc.circle(pos.x, pos.y, width);
    }
    
    
}

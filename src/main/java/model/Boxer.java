package model;

public class Boxer {
    private int kick;
    private int block;

    public Boxer(){
        this.kick = 0;
        this.block = 0;
    }

    public void resetChosen(){
        this.kick = 0;
        this.block = 0;
    }

    public int getKick() {
        return kick;
    }

    public void setKick(int kick) {
        this.kick = kick;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }
}

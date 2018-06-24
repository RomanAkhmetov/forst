package dev.akhmetov;

public class Game {
    public int game;
    public double leftCoeff;
    public double rightCoeff;
    public double midCoeff;
    public String res;


    public Game(int game,double leftCoeff,double rightCoeff,double midCoeff,String res){
        this.game=game;
        this.leftCoeff=leftCoeff;
        this.rightCoeff=rightCoeff;
        this.midCoeff=midCoeff;
        this.res=res;
    }
}

package dev.akhmetov;

public class Bet {

    public int game;
    public int bet;
    public String res;


    public Bet(int game, int bet, String res){
        this.game=game;
        this.bet=bet;
        this.res=res;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void setRes(String res) {
        this.res = res;
    }



}

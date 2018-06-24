package dev.akhmetov;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("Количество ставок: ");
        int betAmount = in.nextInt();
        Bet[] betArray= new Bet[betAmount];


        for(int i=0;i<betAmount;i++){
          //  System.out.print("Ставка["+(i+1)+"]: ");
            int game=in.nextInt();
            int bet=in.nextInt();
            String res=in.nextLine();
            betArray[i]=new Bet(game,bet,res);
        }



        int gameAmount = in.nextInt();
        Game[] gameArray= new Game[gameAmount];

        for(int i=0;i<betAmount;i++){
             int game=i+1;
             System.out.print(game+" ");
             double leftCoeff=in.nextDouble();
             double rightCoeff=in.nextDouble();
             double midCoeff=in.nextDouble();
             String res=in.nextLine();
             gameArray[i]=new Game(game,leftCoeff,rightCoeff,midCoeff,res);
        }

        System.out.println(start(betArray,gameArray));

    }

    public static int start(Bet[] betArray,Game[] gameArray){
        double score=0.0;
        for(int i=0;i<betArray.length;i++){
            boolean eq=(gameArray[betArray[i].game-1].res).equals(betArray[i].res);
            if(eq) {
                String result=betArray[i].res;
                if(result.equals(" L")){
                   score+=(gameArray[betArray[i].game-1].leftCoeff)*betArray[i].bet-betArray[i].bet;
                }

                if(result.equals(" R")){
                    score+=(gameArray[betArray[i].game-1].rightCoeff)*betArray[i].bet-betArray[i].bet;
                }

                if(result.equals(" D")){
                    score+=(gameArray[betArray[i].game-1].midCoeff)*betArray[i].bet-betArray[i].bet;
                }

            }else{
                score-=betArray[i].bet;
            }
        }
        return (int)score;
    }
}

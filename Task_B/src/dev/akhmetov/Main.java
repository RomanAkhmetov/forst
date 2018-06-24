package dev.akhmetov;

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] hextets;
        String ipString="";
        ipString=in.nextLine();
        hextets=ipString.split("::");
        System.out.print(" "+analize(hextets,ipString));
    }


        public static String analize(String[] hextets,String ipString){
            int hexToRepair=0;
            String[] hexToAmount;
            String[] repairArray;
            int i=0;
            StringBuffer sb;
            String newIp="";


            hexToAmount=ipString.split(":");

            if(hextets.length==1){
                for (String hextet : hexToAmount) {
                    newIp+=hextet+"#";
                }
                newIp+="#";
            }else if(hextets.length==2) {
                for (String hextet : hexToAmount) {
                    newIp+=hextet+"#";
                }
            }else{
                newIp="##";
            }


            String strAfter = newIp.replace("##", generate(hexToAmount.length));
            strAfter=strAfter.substring(0);
            String strAfter2 = strAfter.replace("#", ":");
            repairArray=strAfter2.split(":");

            for(i=0;i<repairArray.length;i++){
                if(repairArray[i].length()<4){
                    sb = new StringBuffer(repairArray[i]).reverse();
                    while(sb.length()<4){
                        sb.append("0");
                    }
                    repairArray[i]=sb.reverse().toString();
                }
            }

            String str = String.join(":", repairArray);
            return str;
        }



        public static String generate(int hexToAmount){
            String pattern="#0000";
            String finalize="";
            int hexAmount=8-hexToAmount;
            for(int i=0;i<hexAmount;i++){
                finalize+=pattern;
            }
            return finalize;
        }

}




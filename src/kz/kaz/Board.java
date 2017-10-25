package kz.kaz;
public class Board{
    public static void main(String []args){
        int heads =0;
        int thails =0;
        for(int x=0;x<10000;x++){
            if(Math.random()<0.5){
                thails=thails+1;
            } else{
                heads=heads+1;

            }
        }
        System.out.println("Heads total:"+ heads);
        System.out.println("Thails total:"+ thails);
    }

}
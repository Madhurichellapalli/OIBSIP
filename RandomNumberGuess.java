import javax.swing.*;
import java.util.*;
public class RandomNumberGuess{
    public static void main(String args[]){
        int min=1;
        int max=100;
        Random random=new Random();
        System.out.println("\nRandom value of type double between "+min+ " to " +max+ " : ");
        int gnum=random.nextInt(max-min+1) + min;
        int rounds=3;
        int score=100;
        int attempt=5;
        System.out.println("\nYou have 3 rounds");
        for(int i = rounds; i > 0; i--) {
            System.out.println("\nYou are in round "+(rounds-(i-1)) + "\n");
            for(int j=attempt;j>0;j--){
                 System.out.println("\nYou are in attempt "+(attempt-(j-1)));
                 JFrame f= new JFrame();
                 String userin=JOptionPane.showInputDialog(f, "Enter number should be in range 1 to 100");
                 int guess_num=Integer.parseInt(userin);
                 if(guess_num==gnum)
                 {
                    System.out.println("\nYour guessing number "+guess_num+" is correct");
                    i=1;
                    break;
                 }
                 else if(guess_num > gnum){
                     System.out.println("\nYour guessing number "+guess_num+" is greater than generated number");
                     score-=5;
                 }
                 else{
                     System.out.println("\nYour guessing number "+guess_num+" is smaller than generated number");
                     score-=5;
                 }

            }
            System.out.println();
            if(i==1){
                break;
            }
        }
        System.out.println("\nYour total score is :"+score);
    }
}
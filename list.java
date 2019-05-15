import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Scanner;



public class list {
    public static void main(String[] args){
        ArrayList<Integer> Scores = new ArrayList<Integer>();

        //Scanner in = new Scanner(System.in);
        int score;
        Scores.add(10);
        Scores.add(9);
        Scores.add(100);
        Scores.add(27);



        //Scores.add(Scanner.nextInt());
        Collections.sort(Scores);
        System.out.println(Scores);
    }
}

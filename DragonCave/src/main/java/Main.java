import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Dragon Land!!");
        System.out.println("You start exploring the new land and come across two caves....");
        System.out.println("In one cave you will find a friendly dragon that is very generous and wants to share his treasure!");
        System.out.println("But in the other, there's a dragon just dying to cook you up and eat you....");
        System.out.println("Which cave will you choose?");
        System.out.println("Type 1 or 2");
        Scanner getInput = new Scanner(System.in);
        int input = getInput.nextInt();
        if(input==1){
            System.out.println("You enter the cave and come upon a dragon relaxing back on a pile of gold");
            System.out.println("He then says to you 'Hello my friend! Care for some gold?'");
            System.out.println("You graciously accept and leave the cave unscathed with much more riches than before");
        }else{
            System.out.println("As you enter the cave you notice things are starting to get warmer");
            System.out.println("You then round a corner into the treasure hold.....");
            System.out.println("....and get burnt to a crisp");
            System.out.println("YOU'RE DINNER!!!");
        }
    }
}


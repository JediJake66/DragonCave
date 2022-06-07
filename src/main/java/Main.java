import java.util.Objects;
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
        String input="";
        try {
            input = getInput.next();
            Integer.parseInt(input);
        }catch(Exception e){
            System.out.println("Caught Exception: Input not a number");
        }
        if(Objects.equals(input, "1")){
            System.out.println("You enter the cave and come upon a dragon relaxing back on a pile of gold");
            System.out.println("He then says to you 'Hello my friend! Care for some gold?'");
            System.out.println("You graciously accept and leave the cave unscathed with much more riches than before");
        }else if(input.equalsIgnoreCase("cheat")){
            System.out.println("You execute order 66 and send a battalion of clone troopers into both caves");
            System.out.println("These dragons just so happen to be force-wielders....");
            System.out.println("The troopers unalive both dragons and you keep all the treasure!");
        }else if(input.equals("2")){
            System.out.println("As you enter the cave you notice things are starting to get warmer");
            System.out.println("You then round a corner into the treasure hold.....");
            System.out.println("....and get burnt to a crisp");
            System.out.println("YOU'RE DINNER!!!");
        }else if(Integer.parseInt(input)>2){
            System.out.println("The instructions specified 1 or 2.");
            System.out.println("You get to escape with you life but no treasure.");
        }
        System.out.println("GAME OVER");
    }
}


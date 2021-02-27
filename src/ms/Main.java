package ms;
import ms.enemies.Troll;
import ms.methods.Movement;
import ms.methods.UseFullMethods;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner scanner = new Scanner(System.in);
        UseFullMethods useFullMethods = new UseFullMethods();
        Player player = new Player();
        Movement movement = new Movement();
        Troll troll = new Troll();
        System.out.println("Type your name: ");
        String commandString = scanner.nextLine();

        player.setCharacterName(commandString);

        System.out.println("Hi " + player.getCharacterName());

        System.out.println("\t" + "**" + "\t" + "Welcome To SilentHill" + "\t" + "**");
        printSilentHillSign();
        System.out.println();
        useFullMethods.printDirections();
        System.out.println("Type where u want to go ?");
        commandString = scanner.nextLine();
        movement.firstOptionDown(commandString);
        commandString = scanner.nextLine();
        movement.takeMeToHospital(commandString,player);
        commandString = scanner.nextLine();


        troll.isSpecialAttack(random,player);

        while (troll.getHp()!=0){
            movement.StartFightWithTroll(player,commandString,troll);
            System.out.println("WAITING FOR TROLL ATTACK");
            troll.isSpecialAttack(random,player);

        }
        printStats(player);



    }

    public static void printSilentHillSign() {
        int levels = 3;


        for (int i = 0; i < levels; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("*");
        for (int i = 0; i < levels - 1; i++) {
            System.out.println("*");

        }

    }
    public static void printStats(Player player){
        System.out.println("Mana: "+player.getMp());
        System.out.println("Hp: "+player.getHp());
    }
}






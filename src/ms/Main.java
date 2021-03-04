package ms;
import ms.enemies.Troll;
import ms.items.ItemsFromStore;
import ms.items.Market;
import ms.methods.Movement;
import ms.methods.UseFullMethods;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        List<ItemsFromStore> itemsFromStores = new ArrayList<>();
        Random random= new Random();
        Scanner scanner = new Scanner(System.in);
        UseFullMethods useFullMethods = new UseFullMethods();
        Player player = new Player();
setPlayerStatsOnBeginning(player);
        Movement movement = new Movement();
        Troll troll = new Troll();
player.setEq(itemsFromStores);
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
        if (commandString.equalsIgnoreCase("left")){
            System.out.println("Something is coming from hospital prepare to fight!!");
            while (troll.getHp()!=0){
                movement.takeMeToLeft(player);
                commandString = scanner.nextLine();
                movement.StartFightWithTroll(player,commandString,troll);
                System.out.println("WAITING FOR TROLL ATTACK");
                troll.isSpecialAttack(random,player,troll);
            }
        }




//---------------------------------------------------------------------------------------------------
        //AFTER FIGHT CHECK IF LVL UP
        troll.addExpFromTrollToPlayer(troll,player);
        checkIfLvlUp(player);
        printStats(player);
        System.out.println("You can go: ");
        useFullMethods.printDirections();
        System.out.println("On the left is "+Places.MARKET);
        System.out.println("On the right is abandoned "+Places.FACTORY);
        commandString = scanner.nextLine();
        setPlayerStatsAfterFight(player);
        //-----------------------------------------------------------
        // left after boss
        if (commandString.equalsIgnoreCase("left")){
            movement.leftAfterTrollFight(player);
            market.getMarketAssortment();
            printSilentHillSign();
            System.out.println("TYPE VALUE IN CURLY BRACERS TO BUY ITEM");
commandString=scanner.nextLine();
            movement.buyItemsFromShop(player,commandString);
            System.out.println("if u want to see eq type 'eq'");
            System.out.println("You can go to church nether");
            commandString=scanner.nextLine();
            if (commandString.equalsIgnoreCase("eq")){
                showEquipment(player,commandString);
                System.out.println("If u want to use items type its name like 'health potion'");

                commandString=scanner.nextLine();
                wearEquipment(player,commandString);
                System.out.println("type s to show stats");
                commandString = scanner.nextLine();
                movement.playerShowStats(player,commandString);

            } else if (commandString.equalsIgnoreCase(Places.CHURCH.toString())){

            }
//--------------------------------------------------------------------------
            //right after boss
        } else if (commandString.equalsIgnoreCase("right")){

        }




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
        System.out.println("EXP: "+player.getExperience()+"/100");
        System.out.println("LVL: "+player.getLevel());
        System.out.println("GOLD: "+player.getGold());
    }
    public static void checkIfLvlUp(Player player){
        if (player.getExperience()==100){
            player.setLevel(player.getLevel()+1);
            System.out.println("LVL UP!!!"+" Max Healed");
            player.setHp(player.getHp()+(100-player.getHp()));
        }

    }
    public static void showEquipment(Player player,String command){
        if (command.equalsIgnoreCase("eq")){
            for (ItemsFromStore ie:player.getEq()){
                System.out.println(ie);
            }

        }
    }
    public static void wearEquipment(Player player,String command){
        if (player.getEq().contains(ItemsFromStore.FIRE_SWORD)&&command.equalsIgnoreCase("fire sword")) {
            System.out.println("You are using " + ItemsFromStore.FIRE_SWORD);
            player.setNormalDmg(player.getNormalDmg() + 20);
            player.setNormalDmg(player.getSpecialDmg() + 25);
            player.getEq().remove(ItemsFromStore.FIRE_SWORD);
            System.out.println("YOUR NORMAL DMG == "+player.getNormalDmg());
            System.out.println("YOUR SPECIAL DMG == "+player.getSpecialDmg());
        }else if (player.getEq().contains(ItemsFromStore.HEALTH_POTION)&&command.equalsIgnoreCase("health potion")){
            System.out.println("You are using "+ItemsFromStore.HEALTH_POTION);
            player.setHp(player.getHp()+50);
            player.getEq().remove(ItemsFromStore.HEALTH_POTION);
            System.out.println("YOUR HP == "+player.getHp());
        }else if (player.getEq().contains(ItemsFromStore.MANA_POTION)&&command.equalsIgnoreCase("mana potion")){
            System.out.println("You are using "+ItemsFromStore.MANA_POTION);
            player.setMp(player.getMp()+50);
            player.getEq().remove(ItemsFromStore.MANA_POTION);
            System.out.println("YOUR MP == "+player.getMp());
        }else if (player.getEq().contains(ItemsFromStore.SWORD)&&command.equalsIgnoreCase("sword")){
            System.out.println("You are using "+ItemsFromStore.SWORD);
            player.setNormalDmg(player.getNormalDmg()+10);
            player.setSpecialDmg(player.getSpecialDmg()+15);
            player.getEq().remove(ItemsFromStore.SWORD);
            System.out.println("YOUR NORMAL DMG == "+player.getNormalDmg());
            System.out.println("YOUR SPECIAL DMG == "+player.getSpecialDmg());

        }else if (player.getEq().contains(ItemsFromStore.SWORD_OF_JUSTICE)&&command.equalsIgnoreCase("sword of justice")){
            System.out.println("You are using "+ItemsFromStore.SWORD_OF_JUSTICE);
            player.setNormalDmg(player.getNormalDmg()+35);
            player.setSpecialDmg(player.getSpecialDmg()+45);
            player.getEq().remove(ItemsFromStore.SWORD_OF_JUSTICE);
            System.out.println("YOUR NORMAL DMG == "+player.getNormalDmg());
            System.out.println("YOUR SPECIAL DMG == "+player.getSpecialDmg());
        }
    }
    public static void setPlayerStatsOnBeginning(Player player){
        player.setHp(100);
        player.setMp(100);
        player.setSpecialDmg(20);
        player.setNormalDmg(15);
    }
    public static void setPlayerStatsAfterFight(Player player){
        player.setHp(player.getHp());
        player.setMp(player.getMp());
        player.setNormalDmg(player.getNormalDmg());
        player.setSpecialDmg(player.getSpecialDmg());
    }
}






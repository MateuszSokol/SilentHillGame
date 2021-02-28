package ms.methods;

import ms.Directions;
import ms.Places;
import ms.Player;
import ms.enemies.Enemy;
import ms.enemies.Troll;
import ms.items.ItemsFromStore;
import ms.items.Market;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Movement implements Battle {

    public void takeMeToLeft(String command, Player currentPlayer) {

        if (command.equalsIgnoreCase("left")) {
            System.out.println("Something is coming from hospital prepare to fight!!");
            System.out.println("type 1 to normalAttack");
            System.out.println("type 2 to specialAttack == -5 mana " + currentPlayer.getMp());
            System.out.println(" NORMAL DMG: " + currentPlayer.getNormalDmg());
            System.out.println(" SPECIAL DMG: " + currentPlayer.getSpecialDmg());

        } else {
            System.out.println("You can't go there");
        }
    }


    @Override
    public void StartFight(Player currentPlayer, Enemy enemy, String command) {

    }

    @Override
    public void StartFightWithTroll(Player currentPlayer, String command, Troll troll) {

        if (command.equalsIgnoreCase("1")) {

            int trollHpNow = troll.getHp();

            troll.setHp(trollHpNow - currentPlayer.getNormalDmg());
            System.out.println("TROLL HP: " + trollHpNow);

            System.out.println("YOU DEAL: " + currentPlayer.getNormalDmg() + " DMG");

        } else if (command.equalsIgnoreCase("2")) {
            System.out.println("TROLL HP: " + troll.getHp());
            int trollHpNow = troll.getHp();

            troll.setHp(trollHpNow - currentPlayer.getSpecialDmg());
            System.out.println("TROLL HP: " + trollHpNow);
            System.out.println("YOU DEAL: " + currentPlayer.getSpecialDmg() + " DMG");
            currentPlayer.setMp(currentPlayer.getMp() - 5);

        }


    }

    public void rightAfterTrollFight(String command, Player currentPlayer) {

    }

    public void leftAfterTrollFight(Player currentPlayer) {
        System.out.println("Welcome to Market !!! *@#!");
        System.out.println("Your gold balance is: " + currentPlayer.getGold());


    }

    public void buyItemsFromShop(Player player, String command) {
        System.out.println("IF YOU WANT TO CLOSE SHOP TYPE : 'EXIT' ");

        if (command.equalsIgnoreCase("1") && player.getGold() == 50) {

            player.getEq().add(ItemsFromStore.HEALTH_POTION);
            System.out.println("You have bought:" + ItemsFromStore.HEALTH_POTION);
        } else if (command.equalsIgnoreCase("2") && player.getGold() == 50) {
            player.getEq().add(ItemsFromStore.MANA_POTION);;
            System.out.println("You have bought:" + ItemsFromStore.MANA_POTION);
        } else if (command.equalsIgnoreCase("3") && player.getGold() == 100) {
            player.getEq().add(ItemsFromStore.SWORD);
            System.out.println("You have bought:" + ItemsFromStore.SWORD);
        } else if (command.equalsIgnoreCase("4") && player.getGold() == 300) {
            player.getEq().add(ItemsFromStore.FIRE_SWORD);
            System.out.println("You have bought:" + ItemsFromStore.FIRE_SWORD);
        } else if (command.equalsIgnoreCase("5") && player.getGold() == 500) {
            player.getEq().add(ItemsFromStore.SWORD_OF_JUSTICE);
            System.out.println("You have bought:" + ItemsFromStore.SWORD_OF_JUSTICE);

        }
        }
    }



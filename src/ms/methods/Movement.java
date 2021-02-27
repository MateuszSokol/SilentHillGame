package ms.methods;

import ms.Directions;
import ms.Places;
import ms.Player;
import ms.enemies.Enemy;
import ms.enemies.Troll;

import java.util.Random;

public  class Movement implements Battle{
    public void firstOptionDown(String command) {

        if (command.equalsIgnoreCase("down")) {
            System.out.println("On your right side is Hospital you can go there or u can go forward: ");

            System.out.println("Type: "+Places.HOSPITAL);

        } else {
            System.out.println("you can't go there");
        }
    }
    public void takeMeToHospital(String command, Player currentPlayer){

        if (command.equalsIgnoreCase("Hospital")){
            System.out.println("Something is coming from operating room prepare!!");
            System.out.println("type 1 to normalAttack");
            System.out.println("type 2 to specialAttack == -5 mana "+currentPlayer.getMp());
            System.out.println(" NORMAL DMG: "+currentPlayer.getNormalDmg());
            System.out.println(" SPECIAL DMG: "+currentPlayer.getSpecialDmg());

        }else{
            System.out.println("You can't go there");
        }
    }


    @Override
    public void StartFight(Player currentPlayer, Enemy enemy, String command) {

    }

    @Override
    public void StartFightWithTroll(Player currentPlayer, String command, Troll troll) {

        if (command.equalsIgnoreCase("1")){

            int trollHpNow = troll.getHp();

            troll.setHp(trollHpNow-currentPlayer.getNormalDmg());
            System.out.println("TROLL HP: "+trollHpNow);

            System.out.println("YOU DEAL: "+currentPlayer.getNormalDmg()+" DMG");

        }else if (command.equalsIgnoreCase("2")){
            System.out.println("TROLL HP: "+ troll.getHp());
            int trollHpNow = troll.getHp();

            troll.setHp(trollHpNow-currentPlayer.getSpecialDmg());
            System.out.println("TROLL HP: "+trollHpNow);
            System.out.println("YOU DEAL: "+ currentPlayer.getSpecialDmg()+" DMG");
            currentPlayer.setMp(currentPlayer.getMp()-5);

        }


    }
}

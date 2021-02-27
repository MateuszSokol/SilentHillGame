package ms.enemies;

import ms.Player;

import java.util.Random;

public class Troll extends Enemy{
    private int hp =100;
    private int EXP = 50;
@Override
    public void setEXP(int exp) {
        EXP = exp;

    }

    @Override
    public void setHp(int hp) {
        this.hp =hp ;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getEXP() {
        return EXP;
    }


    @Override
    public Player normalAtt(Player currentPlayer) {

      return currentPlayer.setHp(currentPlayer.getHp()-10);
    }

    @Override
    public Player specialAtt(Player currentPlayer) {
        return currentPlayer.setHp(currentPlayer.getHp()-20);
    }
    public void isSpecialAttack(Random random,Player player){
        int randomFrom0to1 =random.nextInt(2);

        if (randomFrom0to1==1){
            System.out.println("SPECIAL ATTACK "+"ROLL: "+randomFrom0to1);
            player.setHp(player.getHp()-10);
            System.out.println(player.getHp());
            System.out.println(player.getCharacterName()+"HP: "+player.getHp());
        }else {
            System.out.println("NORMAL ATTACK "+randomFrom0to1);
            player.setHp(player.getHp()-5);
            System.out.println(player.getHp());
            System.out.println(player.getCharacterName()+"HP: "+player.getHp());
        }

    }



}

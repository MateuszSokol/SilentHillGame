package ms.enemies;

import ms.Player;

import java.util.Random;

public class Troll extends Enemy{
    private int hp =100;
    private int EXP = 50;

    public int getGoldFromTroll() {
        return 50;
    }

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




    public void isSpecialAttack(Random random,Player player,Troll troll){
        int randomFrom0to1 =random.nextInt(2);

        if (troll.getHp()>0) {
            if (randomFrom0to1 == 1) {
                System.out.println("TROLL SPECIAL ATTACK !!");
                player.setHp(player.getHp() - 10);
            } else {
                System.out.println("TROLL NORMAL ATTACK " );
                player.setHp(player.getHp() - 5);
            }
            System.out.println(player.getCharacterName() +"\t"+ "HP: " + player.getHp());

        }
    }

public void addExpFromTrollToPlayer(Troll troll,Player player){
    if (troll.getHp()<=0){
        player.setExperience(player.getExperience()+troll.getEXP());
        addGoldToPlayer(troll,player);
    }
}
public static void addGoldToPlayer(Troll troll,Player player){
        player.setGold(troll.getGoldFromTroll()+player.getGold());
}

}

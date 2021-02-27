package ms;

public class Player {
   private long gold;
    private String characterName;
    protected int level;
    private int hp;
    private final int normalDmg;
    private final int specialDmg;
    private  int mp;

    public Player() {
        hp = 100;
        gold=0;
        normalDmg=10;
        specialDmg=20;
        mp = 100;
    }


    public void setMp(int mp) {
        this.mp = mp;
    }

    public Player setHp(int hp) {
        this.hp = hp;
        return this;
    }

    public int getNormalDmg() {
        return normalDmg;
    }


    public int getSpecialDmg() {
        return specialDmg;
    }



    public int getMp() {
        return mp;
    }


    private Directions directions;

    public long getGold() {
        return gold;
    }

    public Player setGold(long gold) {
        this.gold = gold;
        return this;
    }

    public String getCharacterName() {
        return characterName;
    }

    public Player setCharacterName(String characterName) {
        this.characterName = characterName;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Player setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getHp() {
        return hp;
    }


    public Directions getDirections() {
        return directions;
    }

    public Player setDirections(Directions directions) {
        this.directions = directions;
        return this;
    }
}

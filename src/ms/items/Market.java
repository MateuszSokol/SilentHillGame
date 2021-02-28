package ms.items;

import java.util.Arrays;
import java.util.HashSet;

public class Market {

    public void getMarketAssortment() {
        System.out.println("Market Assortment");

        getMarketPrices();
    }

    public static void getMarketPrices(){
        System.out.println("1"+"GOLD 50 =="+ItemsFromStore.HEALTH_POTION);
        System.out.println("2"+"GOLD 50 =="+ItemsFromStore.MANA_POTION);
        System.out.println("3"+"GOLD 100 =="+ItemsFromStore.SWORD);
        System.out.println("4"+"GOLD 300 =="+ItemsFromStore.FIRE_SWORD);
        System.out.println("5"+"GOLD 500 =="+ItemsFromStore.SWORD_OF_JUSTICE);

    }

}

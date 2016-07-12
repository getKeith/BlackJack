package com.company;

import java.util.ArrayList;

/**
 * Created by Keith on 6/28/2016.
 */
public class Player {

    private ArrayList<Card> pHand = new ArrayList<Card>();
    private int money = 100;
    private String choice;
    private int bet;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void addToHand(Card c)
    {
        this.pHand.add(c);
    }

    public ArrayList<Card> getPHand()
    {
        return pHand;
    }

}

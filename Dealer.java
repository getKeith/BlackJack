package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Keith on 6/28/2016.
 */
public class Dealer {

    private final int BLACKJACK = 21;
    private ArrayList<Card> dHand = new ArrayList<Card>();
    private static Random rng = new Random();
    private ArrayList<Card> deck = new ArrayList<Card>();
    private Card cards = new Card();

    public Dealer() {deck = cards.getDeck();}

    public Card dealCard()
    {
        int index = rng.nextInt(deck.size());
        Card card = deck.get(index);
        return card;
    }

    public void addToHand(Card c) {this.dHand.add(c);}

    public ArrayList<Card> getDHand()
    {
        return dHand;
    }

    public int getValueOfHand(ArrayList<Card> al)
    {
        int amount = 0;

        for(Card c : al)
        {
            amount = amount + c.getValue();
        }
        return amount;
    }

    public boolean playBlackJack()
    {

        Scanner keyboard = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Player player = new Player();

        player.getPHand().add(dealer.dealCard());
        player.getPHand().add(dealer.dealCard());

        dealer.getDHand().add(dealer.dealCard());
        dealer.getDHand().add(dealer.dealCard());

        System.out.println("Players hand: " + player.getPHand());
        System.out.println("Dealers hand: " + dealer.getDHand());

        if(dealer.getValueOfHand(dealer.getDHand()) ==  BLACKJACK)
            return false;
        if(dealer.getValueOfHand(player.getPHand()) ==  BLACKJACK)
            return true;
        if(dealer.getValueOfHand(dealer.getDHand()) >  BLACKJACK)
            return true;
        if(dealer.getValueOfHand(player.getPHand()) >  BLACKJACK)
            return false;

        while (true)
        {
            System.out.println("Player, hit or stand?(H/S)");
            player.setChoice(keyboard.nextLine());
            if(player.getChoice().equals("S") || player.getChoice().equals("s"))
            {
                break;
            }
            if(player.getChoice().equals("H")| player.getChoice().equals("h"))
            {
                player.getPHand().add(dealer.dealCard());
                System.out.println("Players hand: " + player.getPHand());
                System.out.println("Dealers hand: " + dealer.getDHand());

                if(dealer.getValueOfHand(player.getPHand()) > BLACKJACK)
                {
                    return false;
                }
            }
            if(dealer.getValueOfHand(player.getPHand()) > BLACKJACK)
            {
                return false;
            }
        }

        while(dealer.getValueOfHand(dealer.getDHand()) <= 16)
        {
            dealer.getDHand().add(dealer.dealCard());
            System.out.println("Players hand: " + player.getPHand());
            System.out.println("Dealers hand: " + dealer.getDHand());

            if(dealer.getValueOfHand(dealer.getDHand()) > BLACKJACK)
            {
                return true;
            }
            if(dealer.getValueOfHand(dealer.getDHand()) >= dealer.getValueOfHand(player.getPHand()))
            {
                return false;
            }
            else
                break;
        }
        return true;
      }
}

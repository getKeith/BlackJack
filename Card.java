package com.company;

import java.util.ArrayList;

/**
 * Created by Keith on 6/28/2016.
 */
public class Card {

    private static ArrayList<Card> deck = new ArrayList<Card>();

    private static final String SPADES = "spades";
    private static final String CLUBS = "clubs";
    private static final String HEARTS = "hearts";
    private static final String DIAMONDS = "diamonds";

    private static final int ACE = 1;
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;

    private String suit = "";
    private int value = 0;

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public Card(){}

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public ArrayList shuffleDeck()
    {
        /*
         *appending spades
         */
        for(int i=1; i <= 13; i++) {
            if( i==1 )
            {
                Card card = new Card(SPADES,ACE);
                this.deck.add(card);
            }
            else if ( i==11 )
            {
                Card card = new Card(SPADES,JACK);
                this.deck.add(card);
            }
            else if ( i==12 )
            {
                Card card = new Card(SPADES,QUEEN);
                this.deck.add(card);
            }
            else if ( i==13 )
            {
                Card card = new Card(SPADES,KING);
                this.deck.add(card);
            }
            else{
                Card card = new Card(SPADES,i);
                this.deck.add(card);
            }
        }
        /*
         *appending clubs
         */
        for(int i=1; i <= 13; i++) {
            if( i==1 )
            {
                Card card = new Card(CLUBS,ACE);
                this.deck.add(card);
            }
            else if ( i==11 )
            {
                Card card = new Card(CLUBS,JACK);
                this.deck.add(card);
            }
            else if ( i==12 )
            {
                Card card = new Card(CLUBS,QUEEN);
                this.deck.add(card);
            }
            else if ( i==13 )
            {
                Card card = new Card(CLUBS,KING);
                this.deck.add(card);
            }
            else{
                Card card = new Card(CLUBS,i);
                this.deck.add(card);
            }
        }
        /*
         *appending hearts
         */
        for(int i=1; i <= 13; i++) {
            if( i==1 )
            {
                Card card = new Card(HEARTS,ACE);
                this.deck.add(card);
            }
            else if ( i==11 )
            {
                Card card = new Card(HEARTS,JACK);
                this.deck.add(card);
            }
            else if ( i==12 )
            {
                Card card = new Card(HEARTS,QUEEN);
                this.deck.add(card);
            }
            else if ( i==13 )
            {
                Card card = new Card(HEARTS,KING);
                this.deck.add(card);
            }
            else{
                Card card = new Card(HEARTS,i);
                this.deck.add(card);
            }
        }
        /*
         *appending diamonds
         */
        for(int i=1; i <= 13; i++) {
            if( i==1 )
            {
                Card card = new Card(DIAMONDS,ACE);
                this.deck.add(card);
            }
            else if ( i==11 )
            {
                Card card = new Card(DIAMONDS,JACK);
                this.deck.add(card);
            }
            else if ( i==12 )
            {
                Card card = new Card(DIAMONDS,QUEEN);
                this.deck.add(card);
            }
            else if ( i==13 )
            {
                Card card = new Card(DIAMONDS,KING);
                this.deck.add(card);
            }
            else{
                Card card = new Card(DIAMONDS,i);
                this.deck.add(card);
            }
        }
        return deck;
    }

    public ArrayList<Card> getDeck() {
        this.deck = shuffleDeck();
        return deck;
    }

    public String toString()
    {
        if( getValue()==1 )
        {
            return "Ace of " + getSuit();
        }
        else if ( getValue()==11 )
        {
            return "Jack of " + getSuit();
        }
        else if ( getValue()==12 )
        {
            return "Queen of " + getSuit();
        }
        else if ( getValue()==13 )
        {
            return "King of " + getSuit();
        }
        else
        {
            return getValue() + " of " + getSuit();
        }

    }
}

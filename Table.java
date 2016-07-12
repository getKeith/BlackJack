package com.company;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Player player = new Player();
        Dealer dealer = new Dealer();
        String choice = "";

        do
        {
            if(player.getMoney() ==0)
                break;

            player.setBet(0);

            while(player.getBet() <=0 || player.getBet() > player.getMoney())
            {
                System.out.println("Player, please make a bet");
                player.setBet(keyboard.nextInt());
            }

            boolean userWins = dealer.playBlackJack();

            if(userWins)
            {
                player.setMoney(player.getMoney() + player.getBet());
                System.out.println("You win! Money: " + player.getMoney());
            }
            else if(!userWins)
            {
                player.setMoney(player.getMoney() - player.getBet());
                System.out.println("You lose :( Money: " + player.getMoney());
            }
            else if(player.getMoney() == 0)
                break;

            System.out.println("Play again?");

            keyboard.nextLine();
            choice = keyboard.nextLine();

        }while(!choice.equalsIgnoreCase("n"));
    }
}

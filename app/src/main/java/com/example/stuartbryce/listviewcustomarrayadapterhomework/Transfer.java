package com.example.stuartbryce.listviewcustomarrayadapterhomework;

/**
 * Created by stuartbryce on 2017-07-05.
 */

public class Transfer {

    public String playerName;
    public String buyingClub;
    public int rank;
    public int price;

    public Transfer(int rank, String playerName, String club, int price){
        this.playerName = playerName;
        this.rank = rank;
        this.price = price;
        this.buyingClub = club;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Integer getRank() {
        return rank;
    }

    public String getBuyingClub() {
        return buyingClub;
    }

    public Integer getPrice() {
        return price;
    }
}

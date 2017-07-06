package com.example.stuartbryce.listviewcustomarrayadapterhomework;

/**
 * Created by stuartbryce on 2017-07-05.
 */

public class Transfer {

    public String playerName;
    public String buyingClub;
    public int rank;
    public int price;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    private int imageId;

    public Transfer(int rank, String playerName, String club, int price, int imageId){
        this.playerName = playerName;
        this.rank = rank;
        this.price = price;
        this.buyingClub = club;
        this.imageId = imageId;
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

    public String getPrettyPrice(){
        StringBuilder sb = new StringBuilder();
        sb.append("£");
        sb.append(getPrice());
        sb.append("m");
        return sb.toString();
    }
}

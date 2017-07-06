package com.example.stuartbryce.listviewcustomarrayadapterhomework;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by stuartbryce on 2017-07-05.
 */

public class TopTransfers2017 {

    ArrayList<Transfer> transfers;

    public TopTransfers2017(){
        transfers = new ArrayList<>();
        transfers.add(new Transfer(1, "Alexandre Lacazette", "Arsenal", 45, R.drawable.lacazette));
        transfers.add(new Transfer(2, "Bernardo Silva", "Manchester City", 44, R.drawable.silva));
        transfers.add(new Transfer(3, "Vinicius Junior", "Real Madrid", 40, R.drawable.junior));
        transfers.add(new Transfer(4, "Mohamed Salah", "Liverpool", 37, R.drawable.salah));
        transfers.add(new Transfer(5, "Corentin Tolisso", "Bayern Munich", 36, R.drawable.tolisso));
        transfers.add(new Transfer(6, "Ederson", "Manchester City", 34, R.drawable.ederson));
        transfers.add(new Transfer(7, "Andre Silva", "AC Milan", 34, R.drawable.silva));
        transfers.add(new Transfer(8, "Victor Lindelhof", "Manchester United", 31, R.drawable.lindelhof));
        transfers.add(new Transfer(9, "Antonio Rudiger", "Chelsea", 29, R.drawable.rudiger));
        transfers.add(new Transfer(10, "Jordan Pickford", "Everton", 25, R.drawable.pickford));
        transfers.add(new Transfer(11, "Michael Keane", "Everton", 25, R.drawable.keane));
    }

    public ArrayList<Transfer> getTransfers() {
        return transfers;
    }
}

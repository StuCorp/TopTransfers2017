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
        transfers.add(new Transfer(1, "Alexandre Lacazette", "Arsenal", 45));
        transfers.add(new Transfer(2, "Bernardo Silva", "Manchester City", 44));
        transfers.add(new Transfer(3, "Vinicius Junior", "Real Madrid", 40));
        transfers.add(new Transfer(4, "Mohamed Salah", "Liverpool", 37));
        transfers.add(new Transfer(5, "Corentin Tolisso", "Bayern Munich", 36));
        transfers.add(new Transfer(6, "Ederson", "Manchester City", 34));
        transfers.add(new Transfer(7, "Andre Silva", "AC Milan", 34));
        transfers.add(new Transfer(8, "Victor Lindelhof Silva", "Manchester United", 31));
        transfers.add(new Transfer(9, "Antonio Rudiger", "Chelsea", 29));
        transfers.add(new Transfer(10, "Jordan Pickford", "Everton", 25));
        transfers.add(new Transfer(11, "Michael Keane", "Everton", 25));
    }

    public ArrayList<Transfer> getTransfers() {
        return transfers;
    }
}

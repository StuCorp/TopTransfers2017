package com.example.stuartbryce.listviewcustomarrayadapterhomework;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by stuartbryce on 2017-07-05.
 */

public class TopTransfersTest {

    @Test
    public void testTopTransfers(){
        TopTransfers2017 transfers2017 = new TopTransfers2017();
        ArrayList<Transfer> transfers = new ArrayList<>();
        assertEquals(transfers, transfers2017.getTransfers());
    }
}

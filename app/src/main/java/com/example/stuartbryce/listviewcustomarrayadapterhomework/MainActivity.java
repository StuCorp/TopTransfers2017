package com.example.stuartbryce.listviewcustomarrayadapterhomework;

import android.content.Intent;
import android.graphics.Movie;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Transfer currentTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Transfer currentTransfer = null;

        TopTransfers2017 topTransfers = new TopTransfers2017();
        ArrayList<Transfer> transfers = topTransfers.getTransfers();

        TopTransfersAdapter topTransfersAdapter = new TopTransfersAdapter(this, transfers);

        ListView listView = (ListView) findViewById(R.id.transfer_list);
        listView.setAdapter(topTransfersAdapter);
    }

    public void clickPlayer(View listItem) {
        Transfer transfer = (Transfer) listItem.getTag();
        currentTransfer = transfer;
        StringBuilder sb = new StringBuilder();
//        sb.append(transfer.getPlayerName());
        sb.append("| Age: ");
        sb.append("\n| Nationality: ");
//        sb.append("\n| Caps: ");
        sb.append(transfer.getBuyingClub());

        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);
        snackbar.show();
        snackbar.setAction("Find out more", this);


         }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "SEE YA PAL", Toast.LENGTH_SHORT).show();
//        Transfer transfer = (Transfer) v.getTag();

        StringBuilder sb = new StringBuilder();
        sb.append("http://www.google.com/#q=");
        sb.append(currentTransfer.getPlayerName());

        Uri uri = Uri.parse(sb.toString());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


}

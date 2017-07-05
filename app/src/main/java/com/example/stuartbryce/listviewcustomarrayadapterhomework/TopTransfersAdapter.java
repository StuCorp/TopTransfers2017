package com.example.stuartbryce.listviewcustomarrayadapterhomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.stuartbryce.listviewcustomarrayadapterhomework.R.id.price;

/**
 * Created by stuartbryce on 2017-07-05.
 */

class TopTransfersAdapter extends ArrayAdapter<Transfer> {

    public TopTransfersAdapter(Context context, ArrayList<Transfer> transfers){
        super(context,0,transfers);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.transfer_item, parent, false);
        }

        Transfer currentTransfer = getItem(position);

        TextView rank = (TextView) listItemView.findViewById(R.id.rank);
        rank.setText(currentTransfer.getRank().toString());

        TextView playerName = (TextView) listItemView.findViewById(R.id.player);
        playerName.setText(currentTransfer.getPlayerName());

        TextView club = (TextView) listItemView.findViewById(R.id.club);
        club.setText(currentTransfer.getBuyingClub());

        TextView price = (TextView) listItemView.findViewById(R.id.price);
        StringBuilder sb = new StringBuilder();
        sb.append("£");
        sb.append(currentTransfer.getPrice().toString());
        sb.append("m");
        price.setText(sb);

        listItemView.setTag(currentTransfer);

        return listItemView;
    }


}

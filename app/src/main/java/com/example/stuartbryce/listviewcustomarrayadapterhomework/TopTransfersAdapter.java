package com.example.stuartbryce.listviewcustomarrayadapterhomework;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.name;
import static com.example.stuartbryce.listviewcustomarrayadapterhomework.R.drawable.lacazette;
import static com.example.stuartbryce.listviewcustomarrayadapterhomework.R.id.image;
import static com.example.stuartbryce.listviewcustomarrayadapterhomework.R.id.price;
import static com.example.stuartbryce.listviewcustomarrayadapterhomework.R.id.transfer_list;

/**
 * Created by stuartbryce on 2017-07-05.
 */

class TopTransfersAdapter extends ArrayAdapter<Transfer> {

    Context context;

    public TopTransfersAdapter(Context context, ArrayList<Transfer> transfers){
        super(context,0,transfers);
        this.context = context;
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
        price.setText(currentTransfer.getPrettyPrice());

        ImageView imageView= (ImageView)listItemView.findViewById(R.id.img);
        imageView.setImageResource(currentTransfer.getImageId());

        TextView likes = (TextView) listItemView.findViewById(R.id.player_likes);
        Integer playerLikes = currentTransfer.getRank();
        likes.setText(playerLikes.toString());


        listItemView.setTag(currentTransfer);

        return listItemView;
    }


}

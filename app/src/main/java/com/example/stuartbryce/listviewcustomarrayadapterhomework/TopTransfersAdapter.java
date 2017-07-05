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
        StringBuilder sb = new StringBuilder();
        sb.append("£");
        sb.append(currentTransfer.getPrice().toString());
        sb.append("m");
        price.setText(sb);

//        ImageView image = (ImageView) listItemView.findViewById(R.id.img);
//        image.setImageResource(R.drawable.lacazette);

//        int id = getResources().getIdentifier("/Users/stuartbryce/codeclan_work/classwerk/week_8/day_3/ListViewCustomArrayAdapterHomework/app/src/main/java/com/example/stuartbryce/listviewcustomarrayadapterhomework:drawable/" + StringGenerated, null, null);
//        imageview.setImageResource(id);

        String[] splitName = currentTransfer.getPlayerName().split(" ");
        String imgName = splitName[splitName.length-1].toLowerCase();


        String uri = "@drawable/" + imgName;  // where myresource (without the extension) is the file

        int imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());

        ImageView imageView= (ImageView)listItemView.findViewById(R.id.img);
        Drawable res = context.getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);

        listItemView.setTag(currentTransfer);

        return listItemView;
    }


}

package com.example.dell.cafeagua;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mercedeswyss on 16/03/17.
 */

public class MainMenuAdapter extends ArrayAdapter<String> {

    Activity activity;
    LayoutInflater layoutInflater;

    public MainMenuAdapter(Activity context, int resource, String[] objects) {
        super(context, resource, objects);

        this.activity = context;
        this.layoutInflater = context.getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.main_list_item, null);

            ImageView picture = (ImageView) convertView.findViewById(R.id.ivPicture);
            switch (position){
                case 0:
                    picture.setImageResource(R.drawable.cappuccino);
                    break;
                case 1:
                    picture.setImageResource(R.drawable.latte);
                    break;
                case 2:
                    picture.setImageResource(R.drawable.macchiato);
                    break;
                case 3:
                    picture.setImageResource(R.drawable.mocha);
                    break;
            }

            TextView description = (TextView) convertView.findViewById(R.id.tvDescription);
            description.setText(getItem(position));
        }

        return convertView;
    }

}

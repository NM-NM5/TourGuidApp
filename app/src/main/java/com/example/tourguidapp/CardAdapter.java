package com.example.tourguidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter<Card> {

    public CardAdapter(Context context, ArrayList<Card> cards) {
        super(context, 0, cards);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        Card card = getItem(position);

        ImageView image = listItemView.findViewById(R.id.card_image);
        TextView title = listItemView.findViewById(R.id.card_title);
        TextView bio = listItemView.findViewById(R.id.card_bio);
        TextView phone = listItemView.findViewById(R.id.card_phone);

        image.setImageResource(card.getImageId());
        title.setText(card.getTitleNameId());
        bio.setText(card.getBioId());

        if (card.has_phone()) {
            phone.setText(card.getPhoneNumberId());
            phone.setVisibility(View.VISIBLE);
        } else {
            phone.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

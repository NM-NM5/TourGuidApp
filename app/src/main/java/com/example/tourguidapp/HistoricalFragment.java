package com.example.tourguidapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        final ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(R.drawable.h_image_01, R.string.h_title_01, R.string.h_Bio_01, R.string.h_Maps_01));
        cards.add(new Card(R.drawable.h_image_02, R.string.h_title_02, R.string.h_Bio_02, R.string.h_Maps_02));
        cards.add(new Card(R.drawable.h_image_03, R.string.h_title_03, R.string.h_Bio_03, R.string.h_Maps_03));
        cards.add(new Card(R.drawable.h_image_04, R.string.h_title_04, R.string.h_Bio_04, R.string.h_Maps_04));
        cards.add(new Card(R.drawable.h_image_05, R.string.h_title_05, R.string.h_Bio_05, R.string.h_Maps_05));
        cards.add(new Card(R.drawable.h_image_06, R.string.h_title_06, R.string.h_Bio_06, R.string.h_Maps_06));

        CardAdapter adapter = new CardAdapter(getActivity(), cards);
        ListView lv = rootView.findViewById(R.id.list_view);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Card card = cards.get(position);
                String maps = getResources().getString(card.getMapsId());
                Uri uri = Uri.parse("google.streetview:cbll" + maps);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return rootView;
    }
}

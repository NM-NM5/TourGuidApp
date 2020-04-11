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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        final ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(R.drawable.hotel_image_01, R.string.hotel_title_01, R.string.hotel_Bio_01, R.string.hotel_Phone_01, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.hotel_image_02, R.string.hotel_title_02, R.string.hotel_Bio_02, R.string.hotel_Phone_02, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.hotel_image_03, R.string.hotel_title_03, R.string.hotel_Bio_03, R.string.hotel_Phone_03, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.ic_launcher_background, R.string.hotel_title_04, R.string.hotel_Bio_04, R.string.hotel_Phone_04, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.ic_launcher_background, R.string.hotel_title_05, R.string.hotel_Bio_05, R.string.hotel_Phone_05, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.ic_launcher_background, R.string.hotel_title_06, R.string.hotel_Bio_06, R.string.hotel_Phone_06, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.ic_launcher_background, R.string.hotel_title_07, R.string.hotel_Bio_07, R.string.hotel_Phone_07, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.ic_launcher_background, R.string.hotel_title_08, R.string.hotel_Bio_08, R.string.hotel_Phone_08, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.ic_launcher_background, R.string.hotel_title_09, R.string.hotel_Bio_09, R.string.hotel_Phone_09, R.string.hotel_Maps_01));
        cards.add(new Card(R.drawable.ic_launcher_background, R.string.hotel_title_10, R.string.hotel_Bio_10, R.string.hotel_Phone_10, R.string.hotel_Maps_01));

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

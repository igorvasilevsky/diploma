package com.example.lenovo.redbarmolo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/*
public class DrinkMaterialFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView drinkRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_drink_material2, container, false);
        String[] drinkNames = new String[Drink.drinks.length];
        for (int i = 0; i < drinkNames.length; i++) {
            drinkNames[i] = Drink.drinks[i].getName();
        }
        int[] drinkImages = new int[Drink.drinks.length];
        for (int i = 0; i < drinkImages.length; i++) {
            drinkNames[i] = Drink.drinks[i].getImageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(drinkNames, drinkImages);
        drinkRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        drinkRecycler.setLayoutManager(layoutManager);
        return drinkRecycler;
    }
}*/
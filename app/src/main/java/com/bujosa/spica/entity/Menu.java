package com.bujosa.spica.entity;

import com.bujosa.spica.FavoritesListTravelActivity;
import com.bujosa.spica.MainActivity;
import com.bujosa.spica.R;
import com.bujosa.spica.TravelActivity;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String description;
    private int resourceImageView;
    private Class clase;

    public Menu(String description, int resourceImageView, Class clase) {
        this.description = description;
        this.resourceImageView = resourceImageView;
        this.clase = clase;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getResourceImageView(){
        return resourceImageView;
    }

    public void setResourceImageView(int resourceImageView){
        this.resourceImageView = resourceImageView;
    }

    public Class getClase(){
        return clase;
    }

    public void setClase(Class clase){
        this.clase = clase;
    }

    public static List<Menu> generateMenu(){
        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu("Viajes Disponibles", R.drawable.travel, TravelActivity.class));
        menu.add(new Menu("Viajes Favoritos", R.drawable.travel_selection, FavoritesListTravelActivity.class));
        return menu;
    }
}

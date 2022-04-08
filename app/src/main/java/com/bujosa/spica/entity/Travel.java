package com.bujosa.spica.entity;
import android.util.Log;

import com.bujosa.spica.MainActivity;
import com.bujosa.spica.R;
import java.util.ArrayList;
import java.util.List;
import com.squareup.picasso.Picasso;

public class Travel {
    private String title;
    private String description;
    private String key;
    private int price;
    private String place;
    private String startDate;
    private String endDate;
    private Boolean isFavorite;
    private String image;

    public Travel(String description, int price, String place, String startDate, String endDate, String title, String key, Boolean isFavorite, String image) {
        this.description = description;
        this.title = title;
        this.key = key;
        this.isFavorite = isFavorite;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.place = place;
        this.image = image;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static List<Travel> generateTravels() {
        List<Travel> travels = new ArrayList<>();
        travels.add(new Travel("Republica Dominicana Un lugar maravilloso", 2000, "Santo Domingo",
                "2022-04-08", "2022-04-12", "Hotel Buena ventura", "1", false,
                "https://fotografias.lasexta.com/clipping/cmsimages01/2021/06/30/86B5E23C-A2F3-41B9-A384-9BFC8303FDE3/97.jpg"  ));
        travels.add(new Travel("Puerto Rico un lugar que no te puedes perder", 2500, "San Juan",
                "2022-04-09", "2022-04-11", "Hotel Columbia", "2", false,
                "https://riosmauricio.com/wp-content/uploads/2021/06/Puerto-Rico-una-de-las-mejores-jurisdicciones-para-proteger-activos.jpeg"  ));

        Log.i("Hola", "" + travels.size());
        return travels;
    }
}

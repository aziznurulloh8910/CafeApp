package com.bsoandroid.foodapp;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Kopi Hitam", "Kopi hitam ternyata memiliki segudang manfaat untuk tubuh jika dikonsumsi sebagaimana mestinya Bermanfaat untuk kesehatan karena kopi hitam mengandung antioksidan", 3000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Caphuchino", "Caphuchino ternyata memiliki segudang manfaat untuk tubuh jika dikonsumsi sebagaimana mestinya Bermanfaat untuk kesehatan karena Caphuchino mengandung antioksidan", 3500, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Mie Goreng", "Mie Goreng ternyata memiliki segudang manfaat untuk tubuh jika dikonsumsi sebagaimana mestinya Bermanfaat untuk kesehatan karena bisa menyembuhkan lapar", 12500, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Cireng", "Cireng ternyata memiliki segudang manfaat untuk tubuh jika dikonsumsi sebagaimana mestinya Bermanfaat untuk kesehatan karena bisa menyembuhkan lapar", 1500, context.getDrawable(R.drawable.cireng)));
        return list;
    }
}

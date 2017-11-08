package com.nc.practice.mvc.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Fursa Ilya on 08.11.17.
 */
public class Category implements Serializable {
    private String country;
    private int caloricity;

    public Category(String country, int caloricity) {
        this.country = country;
        this.caloricity = caloricity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCaloricity() {
        return caloricity;
    }

    public void setCaloricity(int caloricity) {
        this.caloricity = caloricity;
    }

    @Override
    public String toString() {
        return "Category{" +
                "country='" + country + '\'' +
                ", caloricity=" + caloricity +
                '}';
    }
}

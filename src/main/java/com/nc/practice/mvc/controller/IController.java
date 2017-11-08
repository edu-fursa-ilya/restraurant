package com.nc.practice.mvc.controller;

import com.nc.practice.mvc.model.Meal;

import java.util.List;

/**
 * Created by Fursa Ilya on 08.11.17.
 */
public interface IController {

    void add(Meal meal);

    void remove(int id);

    void update(int id, Meal newMeal);

    List<Meal> getMenu();

    void printMenu();

    void help();

    int getMenuSize();

    void showErrorMessage();
}

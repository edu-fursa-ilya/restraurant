package com.nc.practice.mvc.controller;

import com.nc.practice.mvc.model.Meal;

import java.util.List;

/**
 * Created by Fursa Ilya on 08.11.17.
 */
public class MainController implements IController {

    private List<Meal> mealList;

    public MainController(List<Meal> mealList) {
        this.mealList = mealList;
    }

    public void add(Meal meal) {
        mealList.add(meal);
    }

    public void remove(int id) {
        mealList.remove(id);
    }

    public void update(int id, Meal newMeal) {
        mealList.add(id, newMeal);
    }

    public List<Meal> getMenu() {
        return mealList;
    }

    public void printMenu() {
        int i = 0;
        System.out.println("MENU  FOR  TODAY");
        for (Meal meal: mealList) {
            System.out.println("-------------------------------------------------");
            System.out.println("Id: " + i++);
            System.out.println("Title: " + meal.getTitle());
            System.out.println("Price: " + meal.getPrice());
            System.out.println("Country: " + meal.getCategory().getCountry());
            System.out.println("Caloricity: " + meal.getCategory().getCaloricity());
        }
    }

    @Override
    public void help() {
        System.out.println("You can use commands such as (add, remove, help, exit, update, print)");
    }

    public int getMenuSize() {
        return mealList.size();
    }

    @Override
    public void showErrorMessage() {
        System.out.println("Opps! seems your command were wrong! Please try again...");
    }
}

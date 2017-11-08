package com.nc.practice.mvc.view;

import com.nc.practice.mvc.controller.MainController;
import com.nc.practice.mvc.model.Category;
import com.nc.practice.mvc.model.Meal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Fursa Ilya on 08.11.17.
 */
public class Main {
    private static List<Meal> mealList;
    private static MainController controller;

    static {
        mealList = new ArrayList<Meal>();
        mealList.add(new Meal("Palak Panir", 100, new Category("India", 100)));
        mealList.add(new Meal("Cappucino 300ml", 130, new Category("France", 40)));
        mealList.add(new Meal("Cappucino 500ml", 200, new Category("France", 60)));
        mealList.add(new Meal("Masala Tea", 100, new Category("India", 10)));
        mealList.add(new Meal("Pizza with Mozarella", 180, new Category("Italy", 240)));
        mealList.add(new Meal("Dal with lentils", 80, new Category("India", 123)));
        mealList.add(new Meal("Tabbouleh salad", 50, new Category("Turkey", 110)));
        mealList.add(new Meal("Risotto", 220, new Category("Italy", 100)));
        controller = new MainController(mealList);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        int id;
        String title;
        String country;
        int caloricity;
        double price;

        do {
            System.out.print("Type your command ->");
            String command = reader.readLine();
            switch (command) {
                case "print":
                    controller.printMenu();
                    break;
                case "exit":
                    flag = false;
                    break;
                case "add":
                    System.out.print("Title -> ");
                    title = reader.readLine();
                    System.out.print("Country -> ");
                    country = reader.readLine();
                    System.out.println("Caloricity -> ");
                    caloricity = Integer.parseInt(reader.readLine());
                    System.out.println("Price -> ");
                    price = Double.parseDouble(reader.readLine());
                    controller.add(new Meal(title, price, new Category(country, caloricity)));
                    break;
                case "remove":
                    System.out.print("Id int menu(0....Inf) -> ");
                    id = Integer.parseInt(reader.readLine());
                    controller.remove(id);
                    break;
                case "help":
                    controller.help();
                    break;
                case "update":
                    System.out.print("Id int menu(0....Inf) -> ");
                    id = Integer.parseInt(reader.readLine());
                    System.out.print("Title -> ");
                    title = reader.readLine();
                    System.out.print("Country -> ");
                    country = reader.readLine();
                    System.out.println("Caloricity -> ");
                    caloricity = Integer.parseInt(reader.readLine());
                    System.out.println("Price -> ");
                    price = Double.parseDouble(reader.readLine());
                    controller.update(id, new Meal(title, price, new Category(country, caloricity)));
                    break;
                default:
                    controller.showErrorMessage();
                    break;
            }

        } while (flag);
    }
}

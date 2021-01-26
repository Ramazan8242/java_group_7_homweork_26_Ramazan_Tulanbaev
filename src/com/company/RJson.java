package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RJson {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static RJson[] truckReader() {
        String fromJson = "";
        try (
                FileReader fr = new FileReader("DatabaseValue.json");
                Scanner scan = new Scanner(fr)
        ) {
            while (scan.hasNextLine()) {
                fromJson += scan.nextLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return gson.fromJson(fromJson, RJson[].class);
    }
}
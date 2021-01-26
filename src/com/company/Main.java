package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./Json.json");
    public static void main(String[] args) {
        KeyAndValue[] fromDatabaseJson = GSON.fromJson(RJson.readJson(WRITE_PATH), KeyAndValue[].class);
        KeyAndValue keyAndValue = new KeyAndValue();
        keyAndValue.readOneRecordByIndex(fromDatabaseJson, 2);
        keyAndValue.checkIfThereIsAnEntryForSuchAndSuchAKey(fromDatabaseJson, "abc");
    }
}
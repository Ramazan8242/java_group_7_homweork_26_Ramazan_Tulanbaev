package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class RJson {
    public static String readJson(Path path) {
        String json = "";
        try (FileReader fr = new FileReader(String.valueOf(path))) {
            int c;
            while ((c = fr.read()) != -1) {
                json += (char) c;
            }
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }
}
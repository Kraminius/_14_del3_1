package org.Game.ChanceCards;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Descriptions {
    public String[] fileReader(int col){
        String[] data = ReadCol(col,"src/main/java/org/Game/ChanceCards/ChanceCardText.csv", ";");
        return data;
    }
    public static String[] ReadCol(int col, String filepath, String delimiter) {
        String data[];
        String currentLine;
        ArrayList<String> colData = new ArrayList<>();

        try
        {
            FileReader read = new FileReader(filepath);
            BufferedReader bread = new BufferedReader(read);
            while((currentLine = bread.readLine()) != null)
            {
                data = currentLine.split(delimiter);
                colData.add(data[col]);
            }

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return colData.toArray(new String[0]);
    }
}

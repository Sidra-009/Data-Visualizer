/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package data.visualizer;

public class DataHandler {

    public static int[] parseInputData(String input) throws Exception {
        String[] parts = input.split(",");
        int[] data = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            data[i] = Integer.parseInt(parts[i].trim());
        }
        return data;
    }
}


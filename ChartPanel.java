/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package data.visualizer;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class ChartPanel extends JPanel {
    private int[] data;

    public ChartPanel(int[] data) {
        this.data = data;
        this.setBackground(Color.WHITE);
    }

    public void updateData(int[] newData) {
        this.data = newData;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (data != null) {
            int width = getWidth() / data.length;
            int maxHeight = getHeight();

            for (int i = 0; i < data.length; i++) {
                int barHeight = (int) (((double) data[i] / maxValue()) * maxHeight);
                g.setColor(Color.BLUE);
                g.fillRect(i * width, getHeight() - barHeight, width - 5, barHeight);

                g.setColor(Color.BLACK);
                g.drawRect(i * width, getHeight() - barHeight, width - 5, barHeight);
            }
        }
    }

    private int maxValue() {
        int max = data[0];
        for (int value : data) {
            if (value > max) max = value;
        }
        return max;
    }
}




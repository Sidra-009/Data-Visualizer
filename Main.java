package data.visualizer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Main Frame
        JFrame frame = new JFrame("Data Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLayout(new BorderLayout());

        // Title
        JLabel title = new JLabel("Data Visualizer (Sorting & Searching)", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        frame.add(title, BorderLayout.NORTH);

        // Visualization Panel
        JPanel visualizationPanel = new JPanel();
        visualizationPanel.setBackground(Color.WHITE);
        frame.add(visualizationPanel, BorderLayout.CENTER);

        // Data Input Panel
        JPanel inputPanel = new JPanel(new FlowLayout());
        JTextField inputField = new JTextField(20);
        JButton submitButton = new JButton("Submit Data");
        inputPanel.add(new JLabel("Enter Data (comma-separated):"));
        inputPanel.add(inputField);
        inputPanel.add(submitButton);
        frame.add(inputPanel, BorderLayout.NORTH);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton sortButton = new JButton("Visualize Sorting");
        JButton searchButton = new JButton("Visualize Searching");
        buttonPanel.add(sortButton);
        buttonPanel.add(searchButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // LinkedList for Data Storage
        LinkedList linkedList = new LinkedList();

        // Submit Button Action
        submitButton.addActionListener(e -> {
            try {
                String input = inputField.getText();
                linkedList.clear();
                for (int value : DataHandler.parseInputData(input)) {
                    linkedList.add(value);
                }
                JOptionPane.showMessageDialog(frame, "Data submitted successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input! Please enter integers separated by commas.");
            }
        });

        // Sort Button Action
        sortButton.addActionListener(e -> {
            if (!linkedList.isEmpty()) {
                ChartPanel chart = new ChartPanel(linkedList.toArray());
                frame.setContentPane(chart);
                frame.validate();
                Algorithms.bubbleSort(linkedList, chart); // Visualize Bubble Sort
            } else {
                JOptionPane.showMessageDialog(frame, "Please submit data first!");
            }
        });

        // Search Button Action
        searchButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Searching Visualization Coming Soon!");
        });

        // Display Frame
        frame.setVisible(true);
    }
}



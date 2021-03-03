package com.Swing;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    static JFrame jFrame = getFrame(); // наша форма
    static JPanel jPanel = new JPanel(); // наша панель

    public static void main(String[] args) {
        jFrame.add(jPanel); // добавляем панель на форму

        //Множественный выбор - JCheckBox
        jPanel.add(new JCheckBox("Check"));

        // компоненты одиночного выбора
        JRadioButton jRadioButton1 = new JRadioButton("1"); // создаётся
        JRadioButton jRadioButton2 = new JRadioButton("2");
        jRadioButton2.setSelected(true); // выбирается по умолчанию
        ButtonGroup buttonGroup = new ButtonGroup(); // создаём группу
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton1); // добавляем эти кнопки на панель
        jPanel.add(jRadioButton2);
        Border border = BorderFactory.createEtchedBorder(); // границы блока
        Border border1 = BorderFactory.createTitledBorder(border, "title");

        // список выбора
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("-1");
        comboBox.addItem("-2");
        comboBox.addItem("-3");
        jPanel.add(comboBox);

        jPanel.setBorder(border1);
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(); // создается форма
        jFrame.setVisible(true); // влючаем видимость
        jFrame.setBounds(750,250,500,500); // размеры
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход
        return jFrame;
    }
}

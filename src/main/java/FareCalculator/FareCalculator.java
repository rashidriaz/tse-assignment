package FareCalculator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FareCalculator {

    private final JPanel panel;

    private final JComboBox<String> departCombo;


    private final JCheckBox economy;
    private final JCheckBox AC;

    private final JComboBox<String> arrCombo;

    private final JTextField seatText;

    private final JTextField totalFareText;


    public static void main(String[] args) {

        new FareCalculator();

    }

    public FareCalculator() {

        JFrame frame = new JFrame("Fare Calculator");
        frame.setLayout(new GridLayout(0, 1));
        panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();


        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Background");
        JMenuItem red = new JMenuItem("RED");
        JMenuItem green = new JMenuItem("Green");
        JMenuItem yellow = new JMenuItem("Yellow");
        menu.add(red);
        menu.add(green);
        menu.add(yellow);
        menuBar.add(menu);

        GridLayout grdLayout = new GridLayout(0, 2);

        red.addActionListener(e -> {
            panel.setBackground(Color.red);
            panel1.setBackground(Color.red);
            panel2.setBackground(Color.red);
            panel3.setBackground(Color.red);
        });

        green.addActionListener(e -> {
            panel.setBackground(Color.green);
            panel1.setBackground(Color.green);
            panel2.setBackground(Color.green);
            panel3.setBackground(Color.green);
        });

        yellow.addActionListener(e -> {
            panel.setBackground(Color.yellow);
            panel1.setBackground(Color.yellow);
            panel2.setBackground(Color.yellow);
            panel3.setBackground(Color.yellow);
        });

        JLabel departLabel = new JLabel("Departure City: ");
        departCombo = new JComboBox<>();
        departCombo.addItem("Lahore");
        departCombo.addItem("Peshawar");

        JLabel aClass = new JLabel("Class");
        economy = new JCheckBox("Economy");
        AC = new JCheckBox("AC");
        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(economy);
        bGroup.add(AC);


        JLabel arrLabel = new JLabel("Arrival City: ");
        arrCombo = new JComboBox<>();
        arrCombo.addItem("Islamabad");
        arrCombo.addItem("Gujranwala");
        arrCombo.addItem("Faisalabad");

        JLabel seatLabel = new JLabel("Total Seats");
        seatText = new JTextField("");

        JButton computeFare = new JButton("Compute Fare");

        computeFare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int eco, acClass, seatNum;

                try {
                    if (seatText.getText().equals("")) {
                        totalFareText.setText("missing input. Try Again");
                    } else {
                        seatNum = Integer.parseInt(seatText.getText().trim());
                        if (departCombo.getSelectedItem() == "Lahore") {
                            if (arrCombo.getSelectedItem() == "Islamabad") {
                                eco = 500;
                                acClass = 1000;
                                if (economy.isSelected()) {
                                    totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (AC.isSelected()) {
                                    totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    totalFareText.setText("missing input. Try Again");
                                }
                            } else if (arrCombo.getSelectedItem() == "Gujranwala") {
                                eco = 600;
                                acClass = 1500;
                                if (economy.isSelected()) {
                                    totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (AC.isSelected()) {
                                    totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    totalFareText.setText("missing input. Try Again");
                                }
                            } else if (arrCombo.getSelectedItem() == "Faisalabad") {
                                eco = 700;
                                acClass = 200;
                                if (economy.isSelected()) {
                                    totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (AC.isSelected()) {
                                    totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    totalFareText.setText("missing input. Try Again");
                                }
                            }
                            FileWriter file = new FileWriter("output.txt");
                            file.write(totalFareText.getText());
                            file.close();
                        } else if (departCombo.getSelectedItem() == "Peshawar") {
                            if (arrCombo.getSelectedItem() == "Islamabad") {
                                eco = 500;
                                acClass = 1000;
                                if (economy.isSelected()) {
                                    totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (AC.isSelected()) {
                                    totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    totalFareText.setText("missing input. Try Again");
                                }
                            } else if (arrCombo.getSelectedItem() == "Gujranwala") {
                                eco = 600;
                                acClass = 1500;
                                if (economy.isSelected()) {
                                    totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (AC.isSelected()) {
                                    totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    totalFareText.setText("missing input. Try Again");
                                }
                            } else if (arrCombo.getSelectedItem() == "Faisalabad") {
                                eco = 700;
                                acClass = 200;
                                if (economy.isSelected()) {
                                    totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (AC.isSelected()) {
                                    totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    totalFareText.setText("missing input. Try Again");
                                }
                            }
                            FileWriter file = new FileWriter("output.txt");
                            file.write(totalFareText.getText());
                            file.close();
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        JLabel totalFare = new JLabel("Total Fare");
        totalFareText = new JTextField("");

        frame.add(panel);
        frame.add(panel1);
        frame.add(panel3);
        frame.add(panel2);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 0, 30));
        panel3.setBorder(BorderFactory.createEmptyBorder(30, 30, 0, 30));
        panel.setLayout(grdLayout);
        panel.add(departLabel);
        panel.add(departCombo);
        panel1.add(aClass);
        panel1.add(economy);
        panel1.add(AC);
        panel.add(arrLabel);
        panel.add(arrCombo);
        panel.add(seatLabel);
        panel.add(seatText);
        panel2.setLayout(new FlowLayout());
        panel2.add(computeFare);
        panel3.add(totalFare);
        panel3.add(totalFareText);
        panel3.setLayout(new GridLayout(0, 2));

        frame.setBounds(0, 0, 800, 550);
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}

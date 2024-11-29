package Modul6.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu{
    JButton perekaman, pencarian, exit;
    public MainMenu(){
        JFrame frame = new JFrame();
        frame.setTitle("Main Menu");
        frame.setSize(700, 700);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS)); 
        main.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel judul =new JLabel("Main Menu"); 
        
        perekaman = new JButton("Perekaman");
        pencarian = new JButton("pencarian");
        exit = new JButton("Exit");
        
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.add(main);

        perekaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new Penduduk.Frame();
                frame.dispose();
            }
        });


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        });

        main.add(judul);
        main.add(perekaman);
        main.add(pencarian);
        main.add(exit);

        frame.add(centerPanel);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new MainMenu();
    }
}

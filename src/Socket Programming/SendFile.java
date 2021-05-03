package Frist;

import Frist.TextFileServer;
import ananda.Introduce;
import ananda.Send;
import ananda.FileServer;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SendFile extends JFrame{
    
     public SendFile()
     {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 750);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
       
        
        ImageIcon img = new ImageIcon("file.png");
        JButton txt = new JButton("Text-File");
        txt.setIcon(img);
        txt.setBounds(620, 250, 120, 50);
        add(txt);
        
        ImageIcon img1 = new ImageIcon("file.png");
        JButton zip = new JButton("Zip-File");
        zip.setIcon(img1);
        zip.setBounds(620, 380, 120, 50);
        add(zip);
        
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new TextFileServer().main(null);
            }
        });
         
        zip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);   
                new FileServer().main(null);               
            }
        });   
         
        ImageIcon i1 = new ImageIcon("home.png");
        JButton home = new JButton("Home");
        home.setIcon(i1);
        home.setBounds(1200, 630, 120, 50);
        add(home);    
        
        ImageIcon i2 = new ImageIcon("Back2.png");
        JButton back = new JButton("Back");
        back.setIcon(i2);
        back.setBounds(20, 630, 120, 50);
        add(back); 
        
        home.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Introduce();
               setVisible(false);
            }
        });
        
        
        back.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Send();
               setVisible(false);
            }
        });
         
        
        ImageIcon shr = new ImageIcon("download.jpg");
        JLabel sr = new JLabel("Share it");
        sr.setIcon(shr);
        sr.setBounds(0, 0, 1400, 750);
        add(sr);
       
        Container con = getContentPane();
        con.setBackground(Color.GREEN);
        
    }
    
   
    
}

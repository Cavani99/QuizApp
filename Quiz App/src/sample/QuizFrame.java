package sample;

import javax.swing.*;
import java.awt.*;



public class QuizFrame extends  JFrame  {

    QuizFrame(){

    //Main Frame options
        this.setTitle("Quiz");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 800); // set dimension

    //The Background
    Color blue = new Color(0, 7, 28);
    this.getContentPane().setBackground(blue);

    //the Starting frame image
    String pic = "Quiz App/quiztime.jpg";
    ImageIcon image = new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(700, 600, Image.SCALE_SMOOTH));
    JLabel quizPicture = new JLabel(image);
        quizPicture.setSize(200, 300);
    this.add(quizPicture, BorderLayout.NORTH);

    //the button
    Panel p = new Panel();
    Color blue2 = new Color(2, 14, 47);
    Button start = new Button("Start Quiz");
        start.setPreferredSize(new Dimension(300, 70));
        start.addActionListener( new QuizPanel());  //actionPerformed
        start.setBackground(blue2);
        start.setForeground(Color.white);
        p.add(start);
    this.add(p, BorderLayout.CENTER);

    this.setResizable(false);
    this.setVisible(true);
}




}

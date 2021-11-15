import javax.swing.*;
import java.awt.*;

public class Game {

    public static void main(String[] args) {
        new Game();

        JFrame window = new JFrame();

        JPanel mainTitlePanel = new JPanel();
        JPanel startButtonPanel = new JPanel();

        JButton startButton = new JButton("START");

        JLabel mainTitleLabel = new JLabel("EMPTINESS");

        Container con = new Container();

        Font mainTitleFont = new Font("Times New Roman",Font.PLAIN,90);
        Font startButtonFont = new Font("IMPACT",Font.PLAIN,40);
//WINDOW_________________________________________________________
        window.setSize(800,600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setResizable(false);
        window.setVisible(true);
        con = window.getContentPane();
//PANEL__________________________________________________________
        mainTitlePanel.setBounds(100,100,600,100);
        mainTitlePanel.setBackground(Color.black);
        con.add(mainTitlePanel);

        startButtonPanel.setBounds(320,400,150,70);
        startButtonPanel.setBackground(Color.black);
//LABEL__________________________________________________________
        mainTitleLabel.setForeground(Color.white);
        mainTitleLabel.setFont(mainTitleFont);
        mainTitlePanel.add(mainTitleLabel);

        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setBorderPainted(false);
        startButton.setFont(startButtonFont);
        startButtonPanel.add(startButton);
        con.add(startButtonPanel);




    }

    void Game(){

    }

}

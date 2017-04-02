import javax.swing.*;
import java.awt.*;

public class Przycisk {
    public static void main(String[] args){
        Przycisk gui = new Przycisk();
        gui.doRoboty();
    }

    public void doRoboty(){
    JFrame ramka = new JFrame("PISZCZ");
    JPanel panel = new JPanel();
    JTextArea tekst = new JTextArea(10,20);
    JScrollPane przewijanie = new JScrollPane(tekst);

    tekst.setLineWrap(true);
    przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);


    panel.setBackground(Color.lightGray);
    panel.add(przewijanie);



    ramka.getContentPane().add(BorderLayout.NORTH, panel);
    ramka.setSize(400,300);
    ramka.setVisible(true);
    }
}

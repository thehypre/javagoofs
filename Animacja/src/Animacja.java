import javax.swing.*;
import java.awt.*;

public class Animacja {
    int x = 13;
    int y = 13;

    public static void main(String[] args){
        Animacja gui = new Animacja();
        gui.doStart();
    }

    public void doStart(){
        JFrame ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MojPanelRysunkowy panel = new MojPanelRysunkowy();

        ramka.getContentPane().add(panel);
        ramka.setSize(600,600);
        ramka.setVisible(true);

        for (int i = 0; i <100; i++){
            x = x+4;
            y = y+4;

            panel.repaint();

            try{
                Thread.sleep(50);
            } catch (Exception ex) {}
        }
    }

    class MojPanelRysunkowy extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.lightGray);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            Graphics2D g2d = (Graphics2D) g;

            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color cStart = new Color(red, green, blue);

            red = (int) (Math.random() * 256);
            green = (int) (Math.random() * 256);
            blue = (int) (Math.random() * 256);
            Color cEnd = new Color(red, green, blue);

            GradientPaint gradient = new GradientPaint(x,y,cStart,x+200,y+200,cEnd);

            g2d.setPaint(gradient);
            g2d.fillOval(x,y,150,150);
        }
    }
}

/*
Create a continuous color wheel using DrawingPanel and additive RGB mixing.
Basic project guidelines
o   Use a 512 x 512 drawing panel.
o   Fill the panel with your wheel.
o   At least 32 spokes.  Check out fillArc.*
*/
import java.awt.*;
import javax.swing.*;

public class ColorWheelFinal extends JPanel {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(552, 552);
        Graphics g = panel.getGraphics();
        double lightness = 50;

        HSLColor hsl = new HSLColor(0, 100, (int)Math.round(lightness));
        int radius = 256;
        for (int i = 0; i < 256; i++) { 
        	int hue = 0;
            for (int j = 0; j < 1440; j++) { 

                Color rgb = hsl.getRGB();
                g.setColor(rgb);//sets color to rgb
                g.drawArc(20 + i, 20 + i, radius*2, radius*2, j , 4); 
                hue++;
                hsl = new HSLColor(hue, 100, (int)Math.round(lightness));
            }
            lightness += 0.1953125;
            hsl = new HSLColor(hue, 100, (int)Math.round(lightness));
            radius--;
       }
    }
}

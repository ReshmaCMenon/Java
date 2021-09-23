import java.awt.*;
import java.applet.Applet;
public class AppletHouse extends Applet {
    
    
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawRect(250,250,500,350);
        g.fillRect(250,250,500,350);
        
        g.setColor(Color.cyan);
        g.drawRect(300,300,70,100);
        g.fillRect(300,300,70,100);
        g.setColor(Color.cyan);
        g.drawRect(630,300,70,100);
        g.fillRect(630,300,70,100);
        g.setColor(Color.blue);
        g.drawRect(450,300,100,300);
        g.fillRect(450,300,100,300);
        
        
        
        int xpoints[]={180,500,830,180};
        int ypoints[]={250,150,250,250};
        g.setColor(Color.gray);
        g.drawPolygon(xpoints ,ypoints,3);
        g.fillPolygon(xpoints,ypoints,3);
    }

    // TODO overwrite start(), stop() and destroy() methods
}

/*
<applet code="AppletHouse.class" width="500" height="300">
</applet>
*/
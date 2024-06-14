import java.awt.*;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Enemy extends JPanel {
  Random randomnumber = new Random();
  int x=randomnumber.nextInt(500);
  int y=0;
  Image image;
  
  Enemy(){
    try{
        image = ImageIO.read(new File("asteroid.png"));
    }
    catch(Exception e){

    }
  }
   public void paintComponent (Graphics g)
  {
    
    super.paintComponent(g);
    g.drawImage(image, x, y,100,100, this);
   // g.setColor(Color.red);
   // g.fillRect(x, y, 100,100);
  
  }
  public void update()
  { 
  y=y+1;
  }

}



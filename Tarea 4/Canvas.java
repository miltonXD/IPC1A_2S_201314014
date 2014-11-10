import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel{

	private static final long serialVersionUID = 1L;
	Circle circle = new Circle();
     WallJump saltar= new WallJump();
	
	public Canvas()
	{
		
	}

        @Override
 	public void paint(Graphics g) {
  		update(g);	
  		g.setColor(Color.black);
		 g.fillRect(0, 0, getSize().width, getSize().height);	
		 circle.Draw(g);
                 saltar.Draw(g);
		 repaint();
 	}
	
        @Override
 	public void update (Graphics g){	
		 circle.Update(); 
                 saltar.Update();
	 }

}


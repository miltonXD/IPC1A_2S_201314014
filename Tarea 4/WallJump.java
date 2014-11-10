import java.awt.Color;
import java.awt.Graphics;


public class WallJump extends Circle{
    Color color;
	public WallJump(){
		
		size = 70;
		color = Color.GREEN;
		ace=5f;
	}
        
    @Override
	public void WallDerecha(){
		if(positionX+size > 785)
			{
				ace=-3f;
                    CambiarColor();
			}
	}
        
    @Override
	public void WallIzquierda(){
		if(positionX+size == 0)
		{
			ace=3f;
					CambiarColorS();
			}
        }
	
	public void CambiarColor()
	{
		color = Color.blue;
	}
	public void CambiarColorS()
	{
		color = Color.red;
	}
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(positionX,positionY,size,size);
	}
}

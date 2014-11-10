import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	
	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float gravity;
	public float jumpImpulse;
	public float ace;

	public Circle()
	{
		size = 20;
		gravity = 0;
		ace=0.1f;
	}
	
	public void Update()
	{
		
        AplicarVelocidad();
		WallDerecha();
        WallIzquierda();
		ActualizarPosicion();
	}
	
	public void ActualizarPosicion()
	{
		positionX = (int)velocityX;
		positionY = (int)velocityY;
	}
	
	public void WallDerecha(){
		if(positionX+size > 785)
			{
			System.out.println("detecte pared");
			}
	}
        
	public void WallIzquierda(){
		if(positionX+size == 0)
		{
			System.out.println("detecte pared");
	       }
	}
	
	public void AplicarVelocidad()
	{
		velocityX=velocityX+ace;
              
	}
        
 	public void Draw (Graphics g){		 
 		
 		 g.setColor(Color.RED);
		 g.fillOval(positionX,positionY,size,size);
 	}

}
import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Ship extends Actor{

	public Ship(){
		this.setImage("Images/SpaceShip.png");
		this.setRotation(270);
	}
	
	public void act(){
		if(Greenfoot.isKeyDown("up")){
			this.move(3);
		}
		if(Greenfoot.isKeyDown("left")){
			this.setLocation(this.getX()-3, this.getY());
		}
		if(Greenfoot.isKeyDown("right")){
			this.setLocation(this.getX()+3, this.getY());
		}
		if(Greenfoot.isKeyDown("down")){
			this.move(-3);
		}
	}
}
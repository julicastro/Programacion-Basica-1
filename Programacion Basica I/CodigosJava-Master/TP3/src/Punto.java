public class Punto{

	private int x;
	private int y;
	
	public Punto(int x, int y){
		this.x=x;
		this.y=y;
		if(this.x==0 && this.y==0){
			System.out.println("el punto en el origen");
		}
		if(this.x!=0 && this.y==0){
			System.out.println("el punto en el eje X");
		}
		if(this.x==0 && this.y!=0){
			System.out.println("el punto en el eje Y");
		}
		if(this.x!=0 && this.y!=0){
			System.out.println("el punto en el eje XY");
		}
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
	
	
	
	
	
	
}
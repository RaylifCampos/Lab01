public class Coordenada { 
	private double x; 
	private double y;
	private Coordenada c;
	public Coordenada( ){
		x=0;
		y=0;
	}
	public Coordenada(double x, double y ){
		this.x = x;
		this.y = y;
	}
	//Constructor
	public Coordenada(Coordenada c ){
		this.c=c;
	}
	void setX(double x) {
		this.x=x;
	}

	void setY(double y){
		this.y=y;
	}
	double getX(){
		return x;
	}
	double getY(){
		return y;
	}
	double distancia(Coordenada c){
		double DistX,DistY,distancia;
		DistX=c.getX();
		DistY=c.getY();
		distancia=DistX-DistY;
		if (distancia<0){
			distancia=distancia*-1;
		}
		return distancia;
	}
	//Metodo de clase que calcula la distancia euclideana
	static double distancia(Coordenada c1, Coordenada c2){
		double DistX,DistY,distancia;
		DistX=c1.getX()-c2.getX();
		DistY=c1.getY()-c2.getY();
		//	Obtener valores absolutos
		if (DistX<0){
			DistX=DistX*-1;
		}if (DistY<0){
			DistY=DistX*-1;
		}
		distancia=Math.sqrt(DistX*DistX+DistY*DistY);
		return distancia;
	}

	public String toString(){
		return "("+x + ";" + y + ")";
	}
}




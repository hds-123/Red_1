package sre.com.javalec.Mult;

public class Mult {

	int x_num=0;
	int y_num=0;
	int z_num=0;
	
	public Mult(int x_num,int y_num, int z_num) {
		super();
		this.x_num=x_num;
		this.y_num=y_num;
		this.z_num=z_num;
		
		
		
	}
	
	public int Mult() {
		int i=x_num*y_num*z_num;
		return i;
		
		
	}
	
}

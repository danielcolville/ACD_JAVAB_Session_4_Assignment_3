package session4;

public class methodOverload {
	int length;
	int width;
	
	public methodOverload(int length,int width) {
		this.length=length;
		this.width=width;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverload sq=new methodOverload(10,5);
		System.out.println("Volume is "+sq.areaVol(20));
	}
	public int areaVol() {
		System.out.println("Calculating area with this for overloaded method");
		return length*width;
	}
	public int areaVol(int height) {
		System.out.println("Calling first method");
		return this.areaVol()*height;
	}

}

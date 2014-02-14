package practicaETs;

public class Grados {
	
	private double gr;
	private int area;
	// constructor 
	 public Grados(double grados){
		 this.gr = grados;
	 }

	public double getGrados() {
		return gr;
	}

	public void setGrados(double grados) {
		this.gr = grados;
	}

	 public double getCentigrado(){
		return  (gr -32) * (5/9.0);
		  
	 }
	 public double getFarenheit(){
		 return ((9/5.0)* gr) +32;
	 }
	 
}

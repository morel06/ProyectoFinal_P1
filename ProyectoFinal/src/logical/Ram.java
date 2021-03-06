package logical;

public class Ram extends Memoria {
	
	private String tipoDDR;
	private float speed;
	private boolean multiCHSUP;
	
	
	//Inicio del Constructor 
	public Ram(float precio, float PrecioVenta, int cant, String Codigo, String marca, String modelo, String TipoProducto, float cantGB, String tipoDDR,
			float speed, boolean multiCHSUP) {
		super(precio, PrecioVenta, cant, Codigo, marca, modelo, TipoProducto, cantGB);
		this.tipoDDR = tipoDDR;
		this.speed = speed;
		this.multiCHSUP = multiCHSUP;
	}
	//Fin del Constructor
	//*****************************
	//Inicio de Getter and Setters
	public String getTipoDDR() {
		return tipoDDR;
	}
	public void setTipoDDR(String tipoDDR) {
		this.tipoDDR = tipoDDR;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public boolean isMultiCHSUP() {
		return multiCHSUP;
	}
	public void setMultiCHSUP(boolean multiCHSUP) {
		this.multiCHSUP = multiCHSUP;
	}
	//Fin de Getter and Setters 
}

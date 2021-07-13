
public class Cuadrado extends FigurasGeometricas{
	private float lado;
	Cuadrado(float lado){
		this.lado=lado;
	}
	
	@Override
	public float area() {
		return this.lado*this.lado;
	}
	
	@Override
	public float perimetro() {
		return this.lado*4;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	

}

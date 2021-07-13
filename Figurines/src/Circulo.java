
public class Circulo extends FigurasGeometricas{
	
	private float radio;
	private float pi=3.1416f;
	
	Circulo(float radio){
		this.radio=radio;
	}
	
	public float area() {
		return this.pi * (this.radio * this.radio);
	}
	
	public float perimetro() {
		return 2 * this.pi * this.radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	
}

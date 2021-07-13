
public class Triangulo extends FigurasGeometricas{
	
	private float base;
	private float altura;
	private float lado;
	
	Triangulo(float base, float altura, float lado){
		this.base=base;
		this.altura=altura;
		this.lado=lado;
	}
	
	public float area() {
		return (this.base*this.altura) /2;
	}
	
	public float perimetro() {
		return this.lado+this.lado+this.base;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	

}

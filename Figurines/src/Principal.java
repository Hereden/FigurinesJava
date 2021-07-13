
public class Principal {
	
	public static void main(String args[]) {
		FigurasGeometricas figura1=new FigurasGeometricas();
		
		System.out.println("El area de la figura 1 es: "+ figura1.area()+ 
				" y su perimetro es: " + figura1.perimetro());
		
		Circulo figura2=new Circulo(12);
		System.out.println("El area de la figura circulo es: "+ figura2.area()+ 
				" y su perimetro es: " + figura2.perimetro());
		
		Cuadrado figura3 = new Cuadrado(15);
		System.out.println("El area de la figura cuadrado es: "+ figura3.area()+ 
				" y su perimetro es: " + figura3.perimetro());
		
		
		Triangulo figura4=new Triangulo(2,1,2);
		System.out.println("El area de la figura triangulo es: "+ figura4.area()+ 
				" y su perimetro es: " + figura4.perimetro());
	}

}

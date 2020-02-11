
import java.util.Scanner;

class Main {

	public static double area(double base, double altura) {
		double area = base * altura;
		return area;
	}
	
	public static double perimetro(double base, double altura) {
		double perimetro = base*2 + altura*2;
		return perimetro;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a base:");
		double Largura= sc.nextDouble();
		System.out.println("Informe a altura:");
		double Comprimento = sc.nextDouble();
		sc.close();
		double perimetro = (Largura *2 + Comprimento * 2);
		double area = (Largura * Comprimento);
		
		System.out.println("Area: "+area);
		System.out.println("Perimetro: "+perimetro);

		}

	}
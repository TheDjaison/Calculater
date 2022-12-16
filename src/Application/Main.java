package Application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Calculater;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Calculater N1 = new Calculater();
		Calculater N2 = new Calculater();
		Calculater R = new Calculater();
		
		
		
		
		System.out.println("Calculadora");
		System.out.println("[+] Digite para realizar uma Adição");
		System.out.println("[-] Digite para realizar uma subtração");
		System.out.println("[*] Digite para realizar uma Multiplicação");
		System.out.println("[X] Digite para visualizar uma taboada");
		System.out.println("[5] Digite para realizar uma Divisão");
		System.out.println("[6] Digite para realizar uma potência");
		System.out.println("[7] Digite para realizar uma RaizQuadrada");
		System.out.println("[8] Digite para realizar uma regra de 3 ");
		char S;
		
		S = sc.next().charAt(0);
		
		if(S == '+') {
			System.out.println("Digite um número: ");
			N1.setN1(sc.nextDouble());
			System.out.println("Digite outro número: ");
			N2.setN2(sc.nextDouble());
			R.setR(N1.getN1()+ N2.getN2());
			System.out.printf(N1.getN1() + " + " + N2.getN2() + " = ",  R.getR());
		}else if(S == '-') {
			System.out.println("Digite um número: ");
			N1.setN1(sc.nextDouble());
			System.out.println("Digite outro número: ");
			N2.setN2(sc.nextDouble());
			R.setR(N1.getN1()- N2.getN2());
			System.out.printf(N1.getN1() + " - " + N2.getN2() + " = %.2f%n" +  R.getR());
		} else if(S == '*') {
			System.out.println("Digite um número: ");
			N1.setN1(sc.nextDouble());
			System.out.println("Digite outro número: ");
			N2.setN2(sc.nextDouble());
			R.setR(N1.getN1() * N2.getN2());
			System.out.println(N1.getN1() + " X " + N2.getN2() + " = %.2f%n" +  R.getR());
		} else if(S == 'X') {
			System.out.println("Qual Taboada deseja visualizar?");
			N1.setN1(sc.nextDouble());
			for(int i = 0; i<10; i++) {
				R.setR(N1.getN1() * i);
				System.out.println(N1.getN1() + " X " + i + " = " + R.getR());
			}
		} else if(S == '/') {
			System.out.println("Digite um número: ");
			N1.setN1(sc.nextDouble());
			System.out.println("Digite outro número: ");
			N2.setN2(sc.nextDouble());
			R.setN1(N1.getN1() / N2.getN2());
			System.out.println(N1.getN1() + " / " + N2.getN2() + " = %.2f%n" +  R.getR());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

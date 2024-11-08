package Vista;

import java.util.Scanner;

public class PedirDatos {
	public static int Pedir() {
		try (Scanner sc = new Scanner(System.in)) {
			return sc.nextInt();
		}catch (java.util.NoSuchElementException e) {
			System.out.println(e);
			System.out.println("Dato prueba 1000");
			return 1000;
		}
	}

	public static int LeerHorasTrabajadas() {
		System.out.println("Horas trabajadas:");
		return Pedir();
	}

	public static int Tarifa() {
		System.out.println("Tarifa:");
		return Pedir();
	}
}

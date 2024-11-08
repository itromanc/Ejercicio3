package Controlador;

import Vista.PedirDatos;
import Vista.Resultados;

public class Calculador {
	int horas; 
	int tarifa;
	double salario;

	public Calculador() {
		horas = PedirDatos.LeerHorasTrabajadas();
		tarifa = PedirDatos.Tarifa();
		CalcularSalario();
		Resultados.MostrarSalario(salario);
	}

	public void CalcularSalario() {
		if (horas > 40) {
			salario = (double) tarifa * 40 + (double) (tarifa * 1.5) * (horas - 40);
		} else {
			salario = (double) tarifa * horas;
		}
	}
}

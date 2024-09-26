package trabajo.pkg2;

import javax.swing.JOptionPane;

public class Trabajoextraclase {

    public static void main(String[] args) {

        //Leer el nombre 
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del (de la) trabajador(a): ");

        //Solicitar el salario semanal
        String Salario = JOptionPane.showInputDialog("Digite el monto de su salario semanal: ");
        //Convertir el valor del salario a un número decimal
        double salarioSemanal = Double.parseDouble(Salario);

        //Salario bruto
        double salarioBruto = salarioSemanal * 4; //semanas del mes

        //Calcular deducciones
        double deducciones = salarioBruto * 0.0934;

        //Salario Neto 
        double salarioNeto = salarioBruto - deducciones;

        //Resultado
        JOptionPane.showMessageDialog(null, "Estimado(a) " + nombre + " el salario de este mes se desglosa de la siguiente manera: salario bruto: " + salarioBruto + "Deducciones: " + deducciones + "Salario neto: " + salarioNeto);

    }

}

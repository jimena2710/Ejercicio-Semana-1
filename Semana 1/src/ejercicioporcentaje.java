import javax.swing.JOptionPane;

public class ejercicioporcentaje {
    
    public static void main (String [] args){
        
        //Solicitar el monto del salario
        String Salario = JOptionPane.showInputDialog("Digite el monto de su salario: ");
        //Convertir el valor del salario a un número con decimales
        double Ingreso = Double.parseDouble(Salario);
        //Solicitar la cuota por alimenatción
        String Cuota = JOptionPane.showInputDialog("Digite su cuota por alimentación: ");
        //Convertir el valor de la cuota por alimentación a un número con decimales
        double Alimentación = Double.parseDouble(Cuota);
        //Calcular el porcenatje de alimentación
        double porcentaje = (Alimentación/Ingreso) *100;
        
        //Calcular el porcentaje restante
        double restante = 100-porcentaje;
        
        //Resultado
        JOptionPane.showMessageDialog(null, "El porcentaje por alimentación es de:" +porcentaje+ "El porcentaje restante es:" +restante);
       
    }
}

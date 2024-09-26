import javax.swing.JOptionPane;
public class edad {

    public static void main(String[] args) {
    
        // Solicitar edad actual 
        String lectura = JOptionPane.showInputDialog("Digite su edad actual:");
        // Convertir el valor ingresado a un número 
        int edad = Integer.parseInt(lectura);
        // Calcular la edad en 5 años
        int edadEnCincoAnos = edad + 5;
        // Mostrar la edad en 5 años
        JOptionPane.showMessageDialog(null, "En 5 años tendrá: " + edadEnCincoAnos + " años.");
    }
}

    

package video_25;

import javax.swing.JOptionPane;

public class Video_25 {

    static int x, y;
    
    public static void main(String[] args) {
        try {
            sumar();
            dividir(5,0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(NumberFormatException n){
            System.out.println(n.getMessage());
        }
    }
    
    public static void sumar()throws NumberFormatException{
        x = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa x: ", 3));
        y = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa y: ",3));
        JOptionPane.showMessageDialog(null, "El resultado de " + x + "+" + y + " es: " + (x+y), "Mostrando Resultado",1);
    }
    
    public static void dividir(int x, int y)throws ArithmeticException{
        if (y==0) {
            throw new ArithmeticException("Error. No se puede dividir entre cero.");
        }else{
            JOptionPane.showMessageDialog(null, "La división de " + x + "/" + y + " es de: " + (x/y),"Mostrando resultados",1);
        }
    }
    
    
}

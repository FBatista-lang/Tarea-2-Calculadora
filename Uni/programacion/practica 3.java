import javax.swing.JOptionPane;

public class persona{
    public static void main(string[] args){

    };
    int edad;
    string nombre,apellido,sexo;


    public void leervalores(){
        nombre = Integer.parseInt(JOptionPane.showInputDialog("Digite el nombre: "));
        apellido = Integer.parseInt(JOptionPane.showInputDialog("Digite el apellido: "));
        sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite el sexo: "));
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite el edad: "));

       
    }
    public void dormir(){
        System.out.println(+nombre+" "+apellido+" que tiene "+edad+" años de edad y es del "+sexo+" esta "+extracted2());

    }

    private void extracted2() {
        dormir();
    }
    public void correr(){
        System.out.println(+nombre+" "+apellido+" que tiene "+edad+" años de edad y es del "+sexo+" esta "+extracted());

    }
    private void extracted() {
        correr();
    }
}
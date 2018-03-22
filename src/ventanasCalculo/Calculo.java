package ventanasCalculo;

import javax.swing.*;
import java.awt.*;

public class Calculo extends JFrame{
    //creacion de los paneles a usar
    private JPanel CalculoVelocidad;
    private JPanel CalculoDistancia;
    private JPanel CalculoTiempo;
    Calculo() {
        super("CALCULOS DE FISICA");
        setSize(450,420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new BorderLayout());

        //primer panel para calculo la velocidad
        CalculoVelocidad cv = new CalculoVelocidad();
        add(cv,BorderLayout.NORTH);

        CalculoDistancia cd = new CalculoDistancia();
        add(cd,BorderLayout.CENTER);

        CalculoTiempo ct = new CalculoTiempo();
        add(ct,BorderLayout.SOUTH);


    }

    public static void main(String []args) {
        Calculo  c = new Calculo();
        c.setVisible(true);

    }

}

package ventanasCalculo;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CalculoVelocidad extends JPanel{
    private JButton calcular;
    private JTextField box1;
    private JTextField box2;
    private JLabel txt1;
    private JLabel txt2;
    CalculoVelocidad(){
        //setPreferredSize(new Dimension(0,100));
        TitledBorder Borde = BorderFactory.createTitledBorder("Calculo de la velocidad");
        //Aplicaremos un color al borde
        Borde.setTitleColor(Color.ORANGE);
        setBorder(Borde);

        setLayout(new BorderLayout());
        //lo siguiente, se creara un contenedor para los componentes que se encuentran debajo de la tabla.
        Container contieneOpc = new Container();

        contieneOpc.setLayout(new GridBagLayout());
        //creamos el el objeto restricciones
        GridBagConstraints gbc1 = new GridBagConstraints();

        txt1 = new JLabel("");
        gbc1.gridx = 2;
        gbc1.gridy = 0;
        gbc1.ipadx = 0;
        gbc1.ipady = 0;
        contieneOpc.add(txt1,gbc1);

        box1 = new JTextField ("");
        box1.setEditable(false);
        gbc1.gridx = 2;
        gbc1.gridy = 0;
        gbc1.ipadx = 100;
        gbc1.ipady = 0;
        gbc1.insets.set(0,0,0,0);
        contieneOpc.add(box1,gbc1);

        /*box2 = new JTextField();
        gbc1.gridx = 2;
        gbc1.gridy = 4;
        gbc1.ipadx = 0;
        contieneOpc.add(box1,gbc1);

        /*txt2 = new JLabel("DIGITA EL TIEMPO");
        gbc1.gridx = 1;
        gbc1.gridy = 1;
        gbc1.ipadx = 0;
        gbc1.ipady = 0;
        contieneOpc.add(txt2,gbc1);
        */





        add(contieneOpc);

    }



}

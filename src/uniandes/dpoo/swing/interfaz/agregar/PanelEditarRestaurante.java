package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	txtNombre = new JTextField("Nombre: ");

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	//"Calificacion del Restaurante (1-5)"
    	cbbCalificacion = new JComboBox<>();
    	for(int i = 1; i <= 5; i++) {
            cbbCalificacion.addItem(String.valueOf(i));
        }
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
    	cbbVisitado = new JComboBox<>();
    	cbbVisitado.addItem("Si");
    	cbbVisitado.addItem("No");
    	

        // Agregar todos los elementos al panel
        // TODO completar
    	add(txtNombre);
    	add(cbbCalificacion);
    	add(cbbVisitado);
    	

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
   
        return "Si".equals(cbbCalificacion.getSelectedItem());
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	
        return txtNombre.getText();
    }
}

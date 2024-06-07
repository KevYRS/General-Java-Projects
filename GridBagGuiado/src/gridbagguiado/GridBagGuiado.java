package gridbagguiado;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Kevin
 */
public class GridBagGuiado extends Frame{
    
    Panel panel;
    
    public GridBagGuiado(){
        Button botAceptar,botCancelar;
        panel = new Panel();
        panel.setBackground( Color.white );
        add( panel );
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gridbag = new GridBagLayout();
        panel.setLayout( gridbag );
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
         Label labTitulo = new Label( "GridBag Layout" );
        labTitulo.setAlignment( Label.CENTER );
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints( labTitulo,gbc );
        panel.add( labTitulo );
        TextField txtNombre = new TextField( "Nombre:",25 );
         gbc.gridwidth = GridBagConstraints.RELATIVE;
         gridbag.setConstraints( txtNombre,gbc );
         panel.add( txtNombre );
         TextField txtDireccion = new TextField( "Direccion:",25 );
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        gridbag.setConstraints( txtDireccion,gbc );

        panel.add( txtDireccion );
 
        TextArea txtComent = new TextArea( 3,25 );
        txtComent.setEditable( true );
        txtComent.setText( "Comentarios:" );

        gridbag.setConstraints( txtComent,gbc );
        panel.add( txtComent );
 
        botAceptar = new Button( "Aceptar" );
        botCancelar = new Button( "Cancelar" );

        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = GridBagConstraints.RELATIVE;

        gridbag.setConstraints( botAceptar,gbc );

        panel.add( botAceptar );

        gbc.gridwidth = GridBagConstraints.RELATIVE;

        gbc.gridheight = 1;

        gridbag.setConstraints( botCancelar,gbc );

        panel.add( botCancelar );
        
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gridbag.setConstraints( botAceptar,gbc );
        gbc.gridx = 0;
        gbc.gridy = 3;
        gridbag.setConstraints( botCancelar,gbc );
gbc.weighty = 1.0;
gbc.fill = GridBagConstraints.VERTICAL;
gbc.gridheight = 2;
gbc.gridwidth = GridBagConstraints.RELATIVE;
gridbag.setConstraints( botAceptar,gbc );
panel.add( botAceptar );
gbc.fill = GridBagConstraints.NONE;
gbc.gridheight = 1;
gridbag.setConstraints( botCancelar,gbc );
panel.add( botCancelar );


gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridwidth = GridBagConstraints.RELATIVE;
gridbag.setConstraints (botAceptar, gbc);

panel.add( botAceptar );
gbc.gridheight = 1;
gridbag.setConstraints( botCancelar,gbc );

panel.add( botCancelar );


gbc.fill = GridBagConstraints.NONE;
gbc.anchor = GridBagConstraints.WEST;
gbc.gridwidth = GridBagConstraints.RELATIVE;
gridbag.setConstraints( botAceptar,gbc );

panel.add( botAceptar );
gbc.anchor = GridBagConstraints.CENTER;
gbc.gridheight = 1;
gridbag.setConstraints( botCancelar,gbc );

panel.add( botCancelar );


gbc.fill = GridBagConstraints.NONE;
gbc.ipadx = 50;
gbc.gridwidth = GridBagConstraints.RELATIVE;
gridbag.setConstraints( botAceptar,gbc );

panel.add( botAceptar );
gbc.gridheight = 1;
gridbag.setConstraints( botCancelar,gbc );

panel.add( botCancelar );


gbc.insets = new Insets( 15,0,0,0 );
gbc.fill = GridBagConstraints.NONE;
gbc.gridwidth = GridBagConstraints.RELATIVE;
gridbag.setConstraints( botAceptar,gbc );

panel.add( botAceptar );
gbc.gridheight = 1;
gridbag.setConstraints( botCancelar,gbc );

panel.add( botCancelar );


        addWindowListener( new WindowAdapter() {
            public void windowClosing( WindowEvent evt ) {
                System.exit( 0 );
                }
            } );
        } 
    public static void main(String[] args) {
        
        GridBagGuiado miFrame = new GridBagGuiado();
    
        miFrame.setTitle( "Tutorial de Java, AWT" );
        miFrame.pack();
        miFrame.setVisible( true );
        
    }
}

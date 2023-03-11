package Convertidor_Alura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Principal {

	JFrame frmConvertidorAluralatan;
	ButtonGroup grupo =new ButtonGroup();
	int xOffset,yOffset;
	Realizado_Por realizado = new Realizado_Por();
	public Principal() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmConvertidorAluralatan = new JFrame();
		//frmConvertidorAluralatan.setTitle("Convertidor - AluraLatan");
		frmConvertidorAluralatan.setBounds(100, 100, 315, 181);
		frmConvertidorAluralatan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertidorAluralatan.getContentPane().setLayout(null);
		frmConvertidorAluralatan.setResizable(false);
		frmConvertidorAluralatan.setLocationRelativeTo(null);  //centra la ventana
		frmConvertidorAluralatan.setUndecorated(true);         //efecto de trasparencia unido con el color de fondo
		//frmConvertidorAluralatan.setOpacity(0.5f);
		frmConvertidorAluralatan.setBackground(new Color(198,190,238,230)); // color de fondo de la ventana
		
		JLabel lblSalir = new JLabel("");
		lblSalir.setToolTipText("Salir");
		lblSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/cerrar-sesion-color.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblSalir.getWidth(),lblSalir.getHeight() , Image.SCALE_DEFAULT ));
				lblSalir.setIcon(icono);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblSalir.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/cerrar-sesion.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblSalir.getWidth(),lblSalir.getHeight() , Image.SCALE_DEFAULT ));
				lblSalir.setIcon(icono);
			}
		});
		
		
		lblSalir.setBounds(282, 11, 33, 41);
		ImageIcon im = new ImageIcon("Imagenes/cerrar-sesion-color.png");
		Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblSalir.getWidth(),lblSalir.getHeight() , Image.SCALE_DEFAULT ));
		lblSalir.setIcon(icono);
		frmConvertidorAluralatan.getContentPane().add(lblSalir);
		
		JRadioButton monedabtn = new JRadioButton("");
		monedabtn.setSelected(true);
		monedabtn.setBounds(61, 74, 21, 23);
		frmConvertidorAluralatan.getContentPane().add(monedabtn);
		monedabtn.setOpaque(false);
		grupo.add(monedabtn);

		JRadioButton longitudbtn = new JRadioButton("");
		longitudbtn.setBounds(191, 74, 21, 23);
		frmConvertidorAluralatan.getContentPane().add(longitudbtn);
		longitudbtn.setOpaque(false);

		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnContinuar.setBounds(107, 147, 89, 34);
		frmConvertidorAluralatan.getContentPane().add(btnContinuar);
		
		JLabel lblmover = new JLabel("");
		lblmover.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = frmConvertidorAluralatan.getLocation().x;
		        int y = frmConvertidorAluralatan.getLocation().y;
		        frmConvertidorAluralatan.setLocation(x + e.getX() - xOffset, y + e.getY() - yOffset);
		        frmConvertidorAluralatan.setLocation(x + e.getX() - xOffset, y + e.getY() - yOffset);
			}
		});
		
		lblmover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblmover.setCursor(new Cursor(Cursor.MOVE_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				 	xOffset = e.getX();
			        yOffset = e.getY();
			}
		});
		lblmover.setForeground(new Color(0, 0, 255));
		lblmover.setBounds(7, 0, 261, 56);
		frmConvertidorAluralatan.getContentPane().add(lblmover);
		
		JLabel lblNewLabel = new JLabel("Monedas");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel.setBounds(48, 104, 60, 20);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Longitud");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel_1.setBounds(191, 107, 60, 14);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_1);
		grupo.add(longitudbtn);
		
		JLabel lblNewLabel_2 = new JLabel("Alura");
		lblNewLabel_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 27));
		
		lblNewLabel_2.setBounds(7, 0, 101, 41);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Latan");
		lblNewLabel_2_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(48, 29, 60, 30);
		frmConvertidorAluralatan.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblCreditos = new JLabel("");
		lblCreditos.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Datos.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),lblCreditos.getHeight() , Image.SCALE_DEFAULT ));
				lblCreditos.setIcon(icono);
			}
		});
		lblCreditos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon im = new ImageIcon("Imagenes/Datos-color.png");
				Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblCreditos.getWidth(),lblCreditos.getHeight() , Image.SCALE_DEFAULT ));
				lblCreditos.setIcon(icono);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				realizado.frmConvertidorAluralatan.setVisible(true);
				frmConvertidorAluralatan.setVisible(false);
			}
		});
		lblCreditos.setToolTipText("Realizado por.");
		lblCreditos.setBounds(0, 147, 30, 30);
		ImageIcon imdatos = new ImageIcon("Imagenes/Datos-color.png");
		Icon iconodatos = new ImageIcon(imdatos.getImage().getScaledInstance(lblCreditos.getWidth(),lblCreditos.getHeight() , Image.SCALE_DEFAULT ));
		lblCreditos.setIcon(iconodatos);
		frmConvertidorAluralatan.getContentPane().add(lblCreditos);
		
	}
}

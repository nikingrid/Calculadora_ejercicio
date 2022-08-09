import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class Start {
	
	Scanner add = new Scanner(System.in);

	//Atributos
	private JFrame frmCalculadora;
	private JTextField caja1;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton0;
	private JButton botonC;
	private JButton botonPar;
	private JButton botonSuma;
	private JButton botonResta;
	private JButton botonMultiplicar;
	private JButton botonIgual;
	private JButton botonDividir;
	private float primerNumero=0.0f;
	private float segundoNumero=0.0f;
	private float resultado=0.0f;
	private String contenidoCaja1;
	private String operaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("calculadora");
		frmCalculadora.setResizable(false);
		frmCalculadora.setBounds(100, 100, 326, 448);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		//Visualizador 
		caja1 = new JTextField();
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);
		caja1.setEnabled(false);
		caja1.setBounds(41, 21, 246, 58);
		frmCalculadora.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		
		//Clear
		botonC = new JButton("C");
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText("");
				
				//desbloquear botones
				boton0.setEnabled(true);
				boton1.setEnabled(true);
				boton2.setEnabled(true);
				boton3.setEnabled(true);
				boton4.setEnabled(true);
				boton5.setEnabled(true);
				boton6.setEnabled(true);
				boton7.setEnabled(true);
				boton8.setEnabled(true);
				boton9.setEnabled(true);
				botonSuma.setEnabled(true);
				botonResta.setEnabled(true);
				botonDividir.setEnabled(true);
				botonMultiplicar.setEnabled(true);
				botonPar.setEnabled(true);
				botonIgual.setEnabled(true);
				
			}
		});
		botonC.setBounds(41, 91, 47, 50);
		frmCalculadora.getContentPane().add(botonC);
		
		
		//PAR
		botonPar = new JButton("Par");
		botonPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero=Float.parseFloat(caja1.getText());
				
				if (primerNumero % 2==0) {
					caja1.setText("Par");
					System.out.println("Par");
					
					//bloqueo botones
					boton0.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonDividir.setEnabled(false);
					botonMultiplicar.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
				}
				else {
					caja1.setText("Impar");
					System.out.println("Impar");
					
					//bloqueo botones
					boton0.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonDividir.setEnabled(false);
					botonMultiplicar.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
				}
			}
		});
		botonPar.setBounds(94, 91, 59, 50);
		frmCalculadora.getContentPane().add(botonPar);
		
		
		//Numeros
		//1
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "1");
				System.out.println("1");
				
			
			}
		});
		boton1.setBounds(41, 163, 47, 50);
		frmCalculadora.getContentPane().add(boton1);
		
		
		//2
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "2");
				System.out.println("2");
				
			}
		});
		boton2.setBounds(94, 163, 47, 50);
		frmCalculadora.getContentPane().add(boton2);
		
		
		//3
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "3");
				System.out.println("3");
				
			}
		});
		boton3.setBounds(147, 163, 47, 50);
		frmCalculadora.getContentPane().add(boton3);
		
		
		//4
		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "4");
				System.out.println("4");
				
			}
		});
		boton4.setBounds(41, 225, 47, 50);
		frmCalculadora.getContentPane().add(boton4);
		
		
		//5
		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "5");
				System.out.println("5");
				
			}
		});
		boton5.setBounds(94, 225, 47, 50);
		frmCalculadora.getContentPane().add(boton5);
		
		
		//6
		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "6");
				System.out.println("6");
			}
		});
		boton6.setBounds(147, 225, 47, 50);
		frmCalculadora.getContentPane().add(boton6);
		
		
		//7
		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "7");
				System.out.println("7");
				
			}
		});
		boton7.setBounds(41, 287, 47, 50);
		frmCalculadora.getContentPane().add(boton7);
		
		
		//8
		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "8");
				System.out.println("8");
				
			}
		});
		boton8.setBounds(94, 287, 47, 50);
		frmCalculadora.getContentPane().add(boton8);
		
		
		//9
		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "9");
				System.out.println("9");
				
			}
		});
		boton9.setBounds(147, 287, 47, 50);
		frmCalculadora.getContentPane().add(boton9);
		
		
		//0
		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText(caja1.getText() + "0");
				System.out.println("0");
				
			}
		});
		boton0.setBounds(41, 349, 47, 50);
		frmCalculadora.getContentPane().add(boton0);
		
		
		//Operaciones
		//suma
		botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				primerNumero=Float.parseFloat(caja1.getText());
				operaciones= "+";
				caja1.setText("");
				}
				catch (Exception e2){
				
					//Pulsar el + con un operando vacio
					contenidoCaja1="";
					caja1.setText("Error");
					
					//bloqueo botones
					boton0.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonDividir.setEnabled(false);
					botonMultiplicar.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					
				}
				
				
				
			}
		});
		botonSuma.setBounds(240, 163, 47, 50);
		frmCalculadora.getContentPane().add(botonSuma);
		
		
		//resta
		botonResta = new JButton("-");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				primerNumero=Float.parseFloat(caja1.getText());
				operaciones= "-";
				caja1.setText("");
				}
				
				catch (Exception e2){
					
					//Pulsar el - con un operando vacio
					contenidoCaja1="";
					caja1.setText("Error");
					
					//bloqueo botones
					boton0.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonDividir.setEnabled(false);
					botonMultiplicar.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					
				}
				
				
				
			}
		});
		botonResta.setBounds(240, 225, 47, 50);
		frmCalculadora.getContentPane().add(botonResta);
		
		
		//multiplicar
		botonMultiplicar = new JButton("*");
		botonMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				primerNumero=Float.parseFloat(caja1.getText());
				operaciones= "*";
				caja1.setText("");
				}
				
				catch (Exception e2){
					
					//Pulsar el * con un operando vacio
					contenidoCaja1="";
					caja1.setText("Error");
					
					//bloqueo botones
					boton0.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonDividir.setEnabled(false);
					botonMultiplicar.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					
				}
			}
		});
		botonMultiplicar.setBounds(240, 287, 47, 50);
		frmCalculadora.getContentPane().add(botonMultiplicar);
		
		//dividir
		botonDividir = new JButton("/");
		botonDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				primerNumero=Float.parseFloat(caja1.getText());
				operaciones= "/";
				caja1.setText("");
				}
				
				
				catch (Exception e2){
					
					//Pulsar el / con un operando vacio
					contenidoCaja1="";
					caja1.setText("Error");
					
					//bloqueo botones
					boton0.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonDividir.setEnabled(false);
					botonMultiplicar.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					
				}
				
			}
		});
		botonDividir.setBounds(240, 349, 47, 50);
		frmCalculadora.getContentPane().add(botonDividir);
		
		
		//igual
		botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Desactivar botones
				
				boton0.setEnabled(false);
				boton1.setEnabled(false);
				boton2.setEnabled(false);
				boton3.setEnabled(false);
				boton4.setEnabled(false);
				boton5.setEnabled(false);
				boton6.setEnabled(false);
				boton7.setEnabled(false);
				boton8.setEnabled(false);
				boton9.setEnabled(false);
				botonSuma.setEnabled(false);
				botonResta.setEnabled(false);
				botonDividir.setEnabled(false);
				botonMultiplicar.setEnabled(false);
				botonPar.setEnabled(false);
				botonIgual.setEnabled(false);
				
				
				try {	 //Comienzo del try
					
				
				segundoNumero=Float.parseFloat(caja1.getText());
				
				resultado=Float.parseFloat(caja1.getText());
				
				
				if (operaciones=="+") {
					resultado=primerNumero+segundoNumero;
					System.out.print(resultado);
					
					caja1.setText("" + resultado);	
				}
				
				if (operaciones=="-") {
					resultado=primerNumero-segundoNumero;
					System.out.print(resultado);
					
					caja1.setText("" + resultado);
				}
				
				if (operaciones=="*") {
					resultado=primerNumero*segundoNumero;
					System.out.print(resultado);
					
					caja1.setText("" + resultado);
				}
				
				if (operaciones=="/") {
					resultado=primerNumero/segundoNumero;
					System.out.print(resultado);
					
					caja1.setText("" + resultado);
				
						if (primerNumero<segundoNumero) {
						System.out.print("Error");
						
						caja1.setText("Error ");
					}	
						if (segundoNumero==0) {
							System.out.print("Indeterminación");
							
							caja1.setText("Indeterminación ");
						}
				}
					
				else {
					return ;
				}
				
		
				
				}
				catch(Exception e2) 
				{
					
					////Pulsar el = con un operando vacio
					contenidoCaja1="";
					caja1.setText("Error");
					
				}
			
				
			}
		});
		botonIgual.setBounds(94, 349, 96, 50);
		frmCalculadora.getContentPane().add(botonIgual);
		
	}

}

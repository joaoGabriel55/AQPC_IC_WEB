import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.JFuzzyLogic;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Label;

public class Principal2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal2 window = new Principal2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		FIS fis = FIS.load("src/resource/aqpc.fcl", true);

		if (fis == null) {
			System.err.println("Can't load file");
			System.exit(1);
		}
		frame = new JFrame();
		frame.setBounds(100, 100, 755, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Qual a quantidade de cores? ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Quantos alimentos s\u00E3o ricos em enxofre?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_2 = new JLabel("Quantos alimentos são folhosos?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_3 = new JLabel("Qual a tecnica de coc\u00E7\u00E3o?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_4 = new JLabel("Qual a porcetagem de gordura da prepara\u00E7\u00E3o?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_5 = new JLabel("Qual o tipo de sobremesa?");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\fbio_\\Pictures\\help.png"));
		lblNewLabel_6.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(lblNewLabel_6, "Os tipos de sobremesa que existem:\n1- DOCE\n2 - FRUTA");
			}
		});
		;

		JLabel lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\fbio_\\Pictures\\help.png"));
		lblNewLabel_7.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(lblNewLabel_7,
						"Os tipos de técnicas de cocção:\n1-CONDUCAO\n2-CONVECCAO\n3-GRELHAR\n4-ASSAR\n5-GUISAR\n6-BRASEAR\n7-SALTEAR\n8-CALOR_SECO\n9-CALOR_UMIDO\n10-FRITAR\n11-REFOGAR\n12-RADIACAO");
			}
		});

		JLabel lblNewLabel_8 = new JLabel("Avaliação qualitativa das preparações do cardápio");
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblVerGrficos = new JLabel("Ver gr\u00E1ficos?");
		lblVerGrficos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JCheckBox checkBox = new JCheckBox("");
		
		JSeparator separator_1 = new JSeparator();

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(74)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(separator_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
									.addComponent(separator, GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
									.addComponent(lblNewLabel_8, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 598, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(35, Short.MAX_VALUE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblVerGrficos)
								.addGap(18)
								.addComponent(checkBox)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel_5)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblNewLabel_6))
									.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblNewLabel_3)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(lblNewLabel_7))
											.addComponent(lblNewLabel_4)
											.addComponent(lblNewLabel_1)
											.addComponent(lblNewLabel_2)
											.addComponent(lblNewLabel))))
								.addGap(36)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
									.addComponent(textField_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(textField_5, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(textField_4, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(textField_3, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(textField_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE))
								.addGap(293)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_7)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_5)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_6))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(checkBox, 0, 0, Short.MAX_VALUE)
						.addComponent(lblVerGrficos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(13)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addGap(20))
		);
		frame.getContentPane().setLayout(groupLayout);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JFuzzyChart.get().chart(fis.getFunctionBlock("aqpc"));

				String cor = textField.getText();
				String folhosos = textField_2.getText();
				String tecnicasCoccao = textField_4.getText();
				String enxofre = textField_1.getText();
				String gordura = textField_3.getText();
				String sobremesa = textField_5.getText();

				fis.setVariable("cor", Double.valueOf(cor));
				fis.setVariable("folhosos", Double.valueOf(folhosos));
				fis.setVariable("tecnicasCoccao", Double.valueOf(tecnicasCoccao));
				fis.setVariable("enxofre", Double.valueOf(enxofre));
				fis.setVariable("gordura", Double.valueOf(gordura));
				fis.setVariable("sobremesa", Double.valueOf(sobremesa));

				fis.evaluate();

				Variable aqpc = fis.getFunctionBlock("aqpc").getVariable("avaliacao");
				
				if(checkBox.isSelected())
					JFuzzyChart.get().chart(aqpc, aqpc.getDefuzzifier(), true);
				frame.setVisible(false);

				JLabel teste = new JLabel();
				DecimalFormat decimalFormat = new DecimalFormat("#.##");
				teste.setText(decimalFormat.format(aqpc.getValue()) + "");
				if (aqpc.getDefuzzifier().defuzzify() <= 30) {
					JOptionPane.showMessageDialog(lblNewLabel,
							"Avaliação é inadequado\nA porcentagem é: " + teste.getText());
				} else if (aqpc.getDefuzzifier().defuzzify() > 30 && aqpc.getDefuzzifier().defuzzify() < 60) {
					JOptionPane.showMessageDialog(lblNewLabel,
							"Avaliação é mediano\nA porcentagem é: " + teste.getText());
				} else if (aqpc.getDefuzzifier().defuzzify() > 60) {
					JOptionPane.showMessageDialog(lblNewLabel,
							"Avaliação é adequado\nA porcentagem é: " + teste.getText());
				}
			}
		});
	}
}
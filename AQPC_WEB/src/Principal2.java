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
import java.awt.Canvas;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.persistence.EnumType;
import javax.swing.JRadioButton;

public class Principal2 {

	private JFrame frmAqpc;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal2 window = new Principal2();
					window.frmAqpc.setVisible(true);
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
		frmAqpc = new JFrame();
		frmAqpc.setTitle("AQPC");
		frmAqpc.setBounds(100, 100, 755, 535);
		frmAqpc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

		JLabel lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setIcon(new ImageIcon("src\\img\\infoTab.png"));
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

		JLabel lblVerGrficos = new JLabel("Ver todos os gr\u00E1ficos?");
		lblVerGrficos.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JCheckBox checkBox = new JCheckBox("");

		JSeparator separator_1 = new JSeparator();

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Principal2.class.getResource("/img/menu_logo.png")));

		JSeparator separator_2 = new JSeparator();

		ButtonGroup grupo = new ButtonGroup();

		JRadioButton doce = new JRadioButton("Doce");
		doce.setSelected(true);
		JRadioButton fruta = new JRadioButton("Fruta");
		
		grupo.add(doce);
		grupo.add(fruta);

		JLabel lblVerGrficoFinal = new JLabel("Ver gr\u00E1fico final?");
		lblVerGrficoFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JCheckBox checkBox_1 = new JCheckBox("");

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(Principal2.class.getResource("/img/ufrn.png")));

		GroupLayout groupLayout = new GroupLayout(frmAqpc.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(71).addComponent(lblNewLabel_8))
						.addGroup(groupLayout.createSequentialGroup().addGap(72).addComponent(btnNewButton))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addGroup(groupLayout
								.createSequentialGroup().addGap(67)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
										.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblNewLabel_3).addGap(18)
														.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 19,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_1).addComponent(lblNewLabel_2)
												.addComponent(lblNewLabel)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblNewLabel_5).addGap(18)
																.addComponent(doce)
																.addPreferredGap(ComponentPlacement.RELATED,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(fruta))
														.addComponent(lblNewLabel_4, Alignment.LEADING)))
										.addPreferredGap(ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(textField_4, 0, 0, Short.MAX_VALUE)
												.addComponent(textField_3, 0, 0, Short.MAX_VALUE)
												.addComponent(textField_2, 0, 0, Short.MAX_VALUE)
												.addComponent(textField_1, 0, 0, Short.MAX_VALUE).addComponent(
														textField, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblVerGrficoFinal, GroupLayout.PREFERRED_SIZE,
																135, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblVerGrficos))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 21,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(checkBox)))))
								.addGroup(groupLayout.createSequentialGroup().addGap(52)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 134,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(separator_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														639, Short.MAX_VALUE)
												.addComponent(separator_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														639, Short.MAX_VALUE)))))
				.addContainerGap(48, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(22).addComponent(lblNewLabel_8)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout
										.createSequentialGroup().addComponent(lblNewLabel).addGap(18)
										.addComponent(lblNewLabel_1).addGap(18).addComponent(lblNewLabel_2).addGap(18)
										.addComponent(lblNewLabel_4).addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 18,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_3))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_5).addComponent(doce).addComponent(fruta))
										.addGap(13)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(checkBox).addComponent(lblVerGrficos))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 17,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblVerGrficoFinal, GroupLayout.PREFERRED_SIZE, 17,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addGap(24).addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 38,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		frmAqpc.getContentPane().setLayout(groupLayout);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkBox_1.isSelected())
					JFuzzyChart.get().chart(fis.getFunctionBlock("aqpc"));

				String cor = textField.getText();
				String folhosos = textField_2.getText();
				String tecnicasCoccao = textField_4.getText();
				String enxofre = textField_1.getText();
				String gordura = textField_3.getText();

				fis.setVariable("cor", Double.valueOf(cor));
				fis.setVariable("folhosos", Double.valueOf(folhosos));
				fis.setVariable("tecnicasCoccao", Double.valueOf(tecnicasCoccao));
				fis.setVariable("enxofre", Double.valueOf(enxofre));
				fis.setVariable("gordura", Double.valueOf(gordura));

				if (doce.isSelected() == true)
					fis.setVariable("sobremesa", 1);

				if (fruta.isSelected() == true)
					fis.setVariable("sobremesa", 2);

				fis.evaluate();

				Variable aqpc = fis.getFunctionBlock("aqpc").getVariable("avaliacao");

				if (checkBox.isSelected())
					JFuzzyChart.get().chart(aqpc, aqpc.getDefuzzifier(), true);

				frmAqpc.setVisible(false);

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
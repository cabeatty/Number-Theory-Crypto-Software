/*
 * Created by JFormDesigner on Fri Mar 17 09:41:41 EDT 2017
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import UTL.modularMath;

/**
 * @author Colin Beatty
 */
public class GUI extends JFrame {
	public GUI() {
		initComponents();
	}

	private void invCompButton(MouseEvent e)
	{
		if (invInvField.getText() != ""  && invModField.getText() != "")
		{
			String a_s = invInvField.getText();
			String m_s = invModField.getText();
			try
			{
				int a = Integer.parseInt(a_s);
				int m = Integer.parseInt(m_s);
				int result = modularMath.inverse(a, m);
				invTempField.setText("" + result);
				invInvField.setText("");
				invModField.setText("");
				invAnswerArea.append("The inverse of " + a + " modulo " + m + " is: " + result + "\n");
			}
			catch (Exception err)
			{
				err.printStackTrace();
				JOptionPane.showMessageDialog(this, "Must enter integer values.");
				invInvField.setText("");
				invModField.setText("");
			}

		}
		else
		{
			JOptionPane.showMessageDialog(this, "Must enter values to compute.");
			invInvField.setText("");
			invModField.setText("");
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Colin Beatty
		tabbedPane1 = new JTabbedPane();
		homePanel = new JPanel();
		titleLabel = new JLabel();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();
		sigLabel = new JLabel();
		modularInvPanel = new JPanel();
		invLabel = new JLabel();
		invInvField = new JTextField();
		modLabel = new JLabel();
		invModField = new JTextField();
		invCompButton = new JButton();
		scrollPane2 = new JScrollPane();
		invAnswerArea = new JTextArea();
		invTempField = new JTextField();
		modularExpPanel = new JPanel();

		//======== this ========
		Container contentPane = getContentPane();

		//======== tabbedPane1 ========
		{

			//======== homePanel ========
			{

				// JFormDesigner evaluation mark
				homePanel.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), homePanel.getBorder())); homePanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				//---- titleLabel ----
				titleLabel.setText("Number Theory Calculator");
				titleLabel.setFont(titleLabel.getFont().deriveFont(titleLabel.getFont().getSize() + 18f));
				titleLabel.setEnabled(false);

				//======== scrollPane1 ========
				{

					//---- textPane1 ----
					textPane1.setText("The point of this simple gui is to do certian calculations within the realm of elementary Number Theory, and by extent, Formal Cryptography, that would normally be very diffacult, or at least very tedious to do by hand.  Things such as calculating the inverse of a number modulo another, doing modular exponentiation, linear congruencies, and even simple forms of encription and decription are implemented with this package in a simple, easy to use format.  The tabs above contain the actual calculators, so click on one of them to get started.");
					textPane1.setEditable(false);
					textPane1.setFont(new Font("Ubuntu", Font.PLAIN, 15));
					scrollPane1.setViewportView(textPane1);
				}

				//---- sigLabel ----
				sigLabel.setText("By Colin Beatty");

				GroupLayout homePanelLayout = new GroupLayout(homePanel);
				homePanel.setLayout(homePanelLayout);
				homePanelLayout.setHorizontalGroup(
					homePanelLayout.createParallelGroup()
						.addGroup(homePanelLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(homePanelLayout.createParallelGroup()
								.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
								.addGroup(homePanelLayout.createSequentialGroup()
									.addGroup(homePanelLayout.createParallelGroup()
										.addComponent(sigLabel)
										.addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE))
									.addGap(0, 96, Short.MAX_VALUE)))
							.addContainerGap())
				);
				homePanelLayout.setVerticalGroup(
					homePanelLayout.createParallelGroup()
						.addGroup(homePanelLayout.createSequentialGroup()
							.addGap(17, 17, 17)
							.addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(sigLabel)
							.addGap(18, 18, 18)
							.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
							.addContainerGap())
				);
			}
			tabbedPane1.addTab("Home", homePanel);

			//======== modularInvPanel ========
			{

				//---- invLabel ----
				invLabel.setText("Invert");

				//---- modLabel ----
				modLabel.setText("Modulo");

				//---- invCompButton ----
				invCompButton.setText("Compute");
				invCompButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent e) {
						invCompButton(e);
					}
				});

				//======== scrollPane2 ========
				{

					//---- invAnswerArea ----
					invAnswerArea.setEditable(false);
					scrollPane2.setViewportView(invAnswerArea);
				}

				//---- invTempField ----
				invTempField.setEditable(false);

				GroupLayout modularInvPanelLayout = new GroupLayout(modularInvPanel);
				modularInvPanel.setLayout(modularInvPanelLayout);
				modularInvPanelLayout.setHorizontalGroup(
					modularInvPanelLayout.createParallelGroup()
						.addGroup(modularInvPanelLayout.createSequentialGroup()
							.addGroup(modularInvPanelLayout.createParallelGroup()
								.addGroup(modularInvPanelLayout.createSequentialGroup()
									.addGap(47, 47, 47)
									.addGroup(modularInvPanelLayout.createParallelGroup()
										.addGroup(modularInvPanelLayout.createSequentialGroup()
											.addComponent(invLabel)
											.addGap(12, 12, 12)
											.addComponent(invInvField, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(modLabel)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(invModField, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
										.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE))
									.addGap(0, 59, Short.MAX_VALUE))
								.addGroup(modularInvPanelLayout.createSequentialGroup()
									.addGap(69, 69, 69)
									.addComponent(invTempField, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
									.addComponent(invCompButton)))
							.addContainerGap())
				);
				modularInvPanelLayout.setVerticalGroup(
					modularInvPanelLayout.createParallelGroup()
						.addGroup(modularInvPanelLayout.createSequentialGroup()
							.addGap(41, 41, 41)
							.addGroup(modularInvPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(invLabel)
								.addComponent(modLabel)
								.addComponent(invModField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(invInvField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
							.addGroup(modularInvPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(invCompButton)
								.addComponent(invTempField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
				);
			}
			tabbedPane1.addTab("Modular Inversion", modularInvPanel);

			//======== modularExpPanel ========
			{

				GroupLayout modularExpPanelLayout = new GroupLayout(modularExpPanel);
				modularExpPanel.setLayout(modularExpPanelLayout);
				modularExpPanelLayout.setHorizontalGroup(
					modularExpPanelLayout.createParallelGroup()
						.addGap(0, 576, Short.MAX_VALUE)
				);
				modularExpPanelLayout.setVerticalGroup(
					modularExpPanelLayout.createParallelGroup()
						.addGap(0, 410, Short.MAX_VALUE)
				);
			}
			tabbedPane1.addTab("Modular Exponentiation", modularExpPanel);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(tabbedPane1)
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(tabbedPane1)
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Colin Beatty
	private JTabbedPane tabbedPane1;
	private JPanel homePanel;
	private JLabel titleLabel;
	private JScrollPane scrollPane1;
	private JTextPane textPane1;
	private JLabel sigLabel;
	private JPanel modularInvPanel;
	private JLabel invLabel;
	private JTextField invInvField;
	private JLabel modLabel;
	private JTextField invModField;
	private JButton invCompButton;
	private JScrollPane scrollPane2;
	private JTextArea invAnswerArea;
	private JTextField invTempField;
	private JPanel modularExpPanel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

/*
 * Created by JFormDesigner on Fri Mar 17 09:41:41 EDT 2017
 */

package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Colin Beatty
 */
public class GUI extends JFrame {
	public GUI() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Colin Beatty
		tabbedPane1 = new JTabbedPane();
		modularInv = new JPanel();
		modularExp = new JPanel();

		//======== this ========
		Container contentPane = getContentPane();

		//======== tabbedPane1 ========
		{

			//======== modularInv ========
			{

				// JFormDesigner evaluation mark
				modularInv.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), modularInv.getBorder())); modularInv.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				GroupLayout modularInvLayout = new GroupLayout(modularInv);
				modularInv.setLayout(modularInvLayout);
				modularInvLayout.setHorizontalGroup(
					modularInvLayout.createParallelGroup()
						.addGap(0, 576, Short.MAX_VALUE)
				);
				modularInvLayout.setVerticalGroup(
					modularInvLayout.createParallelGroup()
						.addGap(0, 410, Short.MAX_VALUE)
				);
			}
			tabbedPane1.addTab("Modular Inversion", modularInv);

			//======== modularExp ========
			{

				GroupLayout modularExpLayout = new GroupLayout(modularExp);
				modularExp.setLayout(modularExpLayout);
				modularExpLayout.setHorizontalGroup(
					modularExpLayout.createParallelGroup()
						.addGap(0, 576, Short.MAX_VALUE)
				);
				modularExpLayout.setVerticalGroup(
					modularExpLayout.createParallelGroup()
						.addGap(0, 410, Short.MAX_VALUE)
				);
			}
			tabbedPane1.addTab("Modular Exponentiation", modularExp);
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
	private JPanel modularInv;
	private JPanel modularExp;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

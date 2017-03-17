/*
 * Created by JFormDesigner on Fri Mar 17 09:07:54 EDT 2017
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Colin Beatty
 */
public class GUI extends JPanel {
	public GUI() {
		initComponents();
	}

	private void accMouseReleased(MouseEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Colin Beatty
		MainFrame = new JFrame();
		Tabs = new JTabbedPane();
		modularInversion = new JPanel();
		modularExp = new JPanel();
		button1 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGap(0, 330, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGap(0, 55, Short.MAX_VALUE)
		);

		//======== MainFrame ========
		{
			Container MainFrameContentPane = MainFrame.getContentPane();

			//======== Tabs ========
			{

				//======== modularInversion ========
				{

					// JFormDesigner evaluation mark
					modularInversion.setBorder(new javax.swing.border.CompoundBorder(
						new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
							"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
							javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
							java.awt.Color.red), modularInversion.getBorder())); modularInversion.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


					GroupLayout modularInversionLayout = new GroupLayout(modularInversion);
					modularInversion.setLayout(modularInversionLayout);
					modularInversionLayout.setHorizontalGroup(
						modularInversionLayout.createParallelGroup()
							.addGap(0, 486, Short.MAX_VALUE)
					);
					modularInversionLayout.setVerticalGroup(
						modularInversionLayout.createParallelGroup()
							.addGap(0, 355, Short.MAX_VALUE)
					);
				}
				Tabs.addTab("Modular Inversion", modularInversion);

				//======== modularExp ========
				{

					//---- button1 ----
					button1.setText("Compute");
					button1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseReleased(MouseEvent e) {
							accMouseReleased(e);
						}
					});

					GroupLayout modularExpLayout = new GroupLayout(modularExp);
					modularExp.setLayout(modularExpLayout);
					modularExpLayout.setHorizontalGroup(
						modularExpLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, modularExpLayout.createSequentialGroup()
								.addContainerGap(426, Short.MAX_VALUE)
								.addComponent(button1)
								.addContainerGap())
					);
					modularExpLayout.setVerticalGroup(
						modularExpLayout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, modularExpLayout.createSequentialGroup()
								.addContainerGap(317, Short.MAX_VALUE)
								.addComponent(button1)
								.addContainerGap())
					);
				}
				Tabs.addTab("Modular Exponentiation", modularExp);
			}

			GroupLayout MainFrameContentPaneLayout = new GroupLayout(MainFrameContentPane);
			MainFrameContentPane.setLayout(MainFrameContentPaneLayout);
			MainFrameContentPaneLayout.setHorizontalGroup(
				MainFrameContentPaneLayout.createParallelGroup()
					.addComponent(Tabs)
			);
			MainFrameContentPaneLayout.setVerticalGroup(
				MainFrameContentPaneLayout.createParallelGroup()
					.addComponent(Tabs)
			);
			MainFrame.pack();
			MainFrame.setLocationRelativeTo(MainFrame.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Colin Beatty
	private JFrame MainFrame;
	private JTabbedPane Tabs;
	private JPanel modularInversion;
	private JPanel modularExp;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

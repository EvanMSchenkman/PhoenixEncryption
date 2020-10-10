package com.phoenixencryption.main.encrypt;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import com.phoenixencryption.main.FileWriter;
import com.phoenixencryption.main.MenuFrame;
import com.phoenixencryption.main.PEM;

public class EncryptionFrame {
	private static JFrame frame = new JFrame("PhoenixEncryption");
	private static JPanel panel = new JPanel(new GridBagLayout());
	private static JTextArea text = new JTextArea();
	private static JScrollPane pane = new JScrollPane(text);

	private final JMenuBar menuBar = new JMenuBar();
	private static JMenu file = new JMenu("File");
	private static JMenu exit = new JMenu("Exit");
	private static JMenuItem encryption = new JMenuItem("Encrypt");
	private static JMenuItem menu = new JMenuItem("Menu");
	private static JMenuItem close = new JMenuItem("Close");

	public static boolean isEmpty = false;

	public EncryptionFrame() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		barInit();
		paneInit();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void paneInit() {
		pane.setPreferredSize(new Dimension(400 * 2, 275 * 2));
		text.setFont(new Font("Arial", Font.PLAIN, 16));
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		panel.add(pane);

		pane.setColumnHeaderView(menuBar);
	}

	private void barInit() {
		encryption.setFont(new Font("Arial", Font.BOLD, 15));
		encryption.setPreferredSize(new Dimension(66, 25));
		encryption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String currentText = text.getText();
				FileWriter.write("temp", "outputs/", currentText);
				FileWriter.isEmpty("temp", "outputs/");
				PEM.loadPEM();

				text.setText(PEM.finalEncryption);

				if (isEmpty == false) {
					JLabel label = new JLabel("<html><center>Text has been encrypted.<br>Return to Main Menu to decrypt.");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(frame, label, "Success", JOptionPane.PLAIN_MESSAGE);
				} else {
					JLabel label = new JLabel("<html><center>No text to encrypt.<br>Please enter text to encrypt.");
					label.setHorizontalAlignment(SwingConstants.CENTER);
					JOptionPane.showMessageDialog(frame, label, "Success", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		menu.setFont(new Font("Arial", Font.BOLD, 15));
		menu.setPreferredSize(new Dimension(66, 25));
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EncryptionFrame.disposeFrame();
				new MenuFrame();
			}
		});
		close.setFont(new Font("Arial", Font.BOLD, 15));
		close.setPreferredSize(new Dimension(66, 25));
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		file.setFont(new Font("Arial", Font.BOLD, 15));
		file.setPreferredSize(new Dimension(40, 25));
		file.add(encryption);
		exit.setFont(new Font("Arial", Font.BOLD, 15));
		exit.setPreferredSize(new Dimension(40, 25));
		exit.add(menu);
		exit.add(close);
		menuBar.add(file);
		menuBar.add(exit);
		pane.setColumnHeaderView(menuBar);
	}

	public static void disposeFrame() {
		frame.dispose();
	}
}
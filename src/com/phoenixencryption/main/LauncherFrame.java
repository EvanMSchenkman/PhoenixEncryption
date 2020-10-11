package com.phoenixencryption.main;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.phoenixencryption.main.decrypt.DecryptLauncher;
import com.phoenixencryption.main.encrypt.EncryptLauncher;

public class LauncherFrame {
	private static JFrame frame = new JFrame("PhoenixEncryption");
	private static JPanel panel = new JPanel(new GridLayout(2, 2, 4, 4));

	public static void display() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		EncryptLauncher.encryptLauncherInit();
		panel.add(EncryptLauncher.button);
		DecryptLauncher.decryptLauncherInit();
		panel.add(DecryptLauncher.button);
		frame.add(panel);

		frame.setContentPane(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	} 
	
	public static void disposeFrame() {
		frame.dispose();
	}
	
	public static boolean isActive() {
		boolean active;
		if (frame.isActive()) {
			active = true;
		} else {
			active = false;
		}
		return active;
	}
}
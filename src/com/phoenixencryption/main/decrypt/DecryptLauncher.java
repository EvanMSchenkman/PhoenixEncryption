package com.phoenixencryption.main.decrypt;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.phoenixencryption.main.PEM;

public class DecryptLauncher {
	public static JButton button = new JButton("Decrypt");

	public static void decryptLauncherInit() {
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setPreferredSize(new Dimension(128 * 2, (128 * 2) / 2));

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DecryptionFrame();
				PEM.reloadPEM();
			}
		});
	}
}
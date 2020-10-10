package com.phoenixencryption.main.encrypt;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.phoenixencryption.main.LauncherFrame;

public class EncryptLauncher {
	public static JButton button = new JButton("Encrypt");

	public static void encryptLauncherInit() {
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setPreferredSize(new Dimension(128 * 2, (128 * 2) / 2));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LauncherFrame.disposeFrame();
				new EncryptionFrame();
			}
		});
	}
}
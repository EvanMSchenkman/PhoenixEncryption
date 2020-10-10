package com.phoenixencryption.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

import com.phoenixencryption.main.encrypt.EncryptionFrame;

public class FileWriter {

	private static File dir = new File("outputs");

	private static void createDir() {
		if (!dir.exists()) {
			System.out.println("creating directory: " + dir.getName());
			boolean result = false;
			try {
				dir.mkdir();
				result = true;
			} catch (SecurityException e) {
				e.printStackTrace();
			}
			if (result) {
				System.out.println("DIR created");
			}
		}
	}

	public static void write(String name, String path, String text) {
		createDir();
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path + name + ".txt"), "utf-8"));
			writer.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void deleteFile(String name, String path) {
		File file = new File(path + name + ".txt");
		file.delete();
	}

	public static void isEmpty(String name, String path) {
		try {
			File file = new File(path + name + ".txt");
			Scanner scanner = new Scanner(file);
			if (!scanner.hasNextLine()) {
				EncryptionFrame.isEmpty = true;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
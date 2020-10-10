package com.phoenixencryption.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.phoenixencryption.main.decrypt.DecryptionFrame;

public class PEM {
	private static final double space = 0.2947846297459518;
	private static final double a = 0.3974135327840922;
	private static final double b = 0.0260455201722247;
	private static final double c = 0.887431049379377;
	private static final double d = 0.854188897069172;
	private static final double e = 0.5665739589565553;
	private static final double f = 0.9069352891839424;
	private static final double g = 0.6947846970422036;
	private static final double h = 0.139067951503698;
	private static final double i = 0.7137691131127222;
	private static final double j = 0.24865210157545514;
	private static final double k = 0.9015711302263191;
	private static final double l = 0.4341807281246769;
	private static final double m = 0.12281261964566959;
	private static final double n = 0.03179077484939896;
	private static final double o = 0.044345006437317536;
	private static final double p = 0.9839227648706276;
	private static final double q = 0.4495573214661538;
	private static final double r = 0.07105725909652783;
	private static final double s = 0.5173669297455791;
	private static final double t = 0.46029331293995535;
	private static final double u = 0.7586927123971;
	private static final double v = 0.7388304878919993;
	private static final double w = 0.6414896625621305;
	private static final double x = 0.856497426029518;
	private static final double y = 0.9897768271973576;
	private static final double z = 0.9918772962068453;
	private static final double aCap = 0.3974135327840922 * 2;
	private static final double bCap = 0.0260455201722247 * 2;
	private static final double cCap = 0.887431049379377 * 2;
	private static final double dCap = 0.854188897069172 * 2;
	private static final double eCap = 0.5665739589565553 * 2;
	private static final double fCap = 0.9069352891839424 * 2;
	private static final double gCap = 0.6947846970422036 * 2;
	private static final double hCap = 0.139067951503698 * 2;
	private static final double iCap = 0.7137691131127222 * 2;
	private static final double jCap = 0.24865210157545514 * 2;
	private static final double kCap = 0.9015711302263191 * 2;
	private static final double lCap = 0.4341807281246769 * 2;
	private static final double mCap = 0.12281261964566959 * 2;
	private static final double nCap = 0.03179077484939896 * 2;
	private static final double oCap = 0.044345006437317536 * 2;
	private static final double pCap = 0.9839227648706276 * 2;
	private static final double qCap = 0.4495573214661538 * 2;
	private static final double rCap = 0.07105725909652783 * 2;
	private static final double sCap = 0.5173669297455791 * 2;
	private static final double tCap = 0.46029331293995535 * 2;
	private static final double uCap = 0.7586927123971 * 2;
	private static final double vCap = 0.7388304878919993 * 2;
	private static final double wCap = 0.6414896625621305 * 2;
	private static final double xCap = 0.856497426029518 * 2;
	private static final double yCap = 0.9897768271973576 * 2;
	private static final double zCap = 0.9918772962068453 * 2;

	private static final String[] input = new String[9999];
	private static final String[] encryptedChar = new String[9999];
	private static double[] decryptedNum;
	private static final char[] ch = new char[9999];
	private static int lines = 0;
	public static String finalEncryption = "";
	public static String finalDecryption = "";

	public static void loadPEM() {
		read("temp", "outputs/");
		encryptChar();
	}

	public static void read(String name, String path) {
		try {
			File file = new File(path + name + ".txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				for (int i = 0; i <= 9999; i++) {
					input[i] = scanner.nextLine();
					lines++;
					if (!scanner.hasNextLine()) {
						break;
					}
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	private static void encryptChar() {
		for (int i = 0; i <= lines - 1; i++) {
			char arr[] = input[i].toCharArray();
			for (int j = 0; j <= arr.length - 1; j++) {
				ch[j] = arr[j];
				if (Character.isWhitespace(ch[j])) {
					encryptedChar[j] = String.valueOf(PEM.space);
				} else if (ch[j] == 'a') {
					encryptedChar[j] = String.valueOf(PEM.a);
				} else if (ch[j] == 'b') {
					encryptedChar[j] = String.valueOf(PEM.b);
				} else if (ch[j] == 'c') {
					encryptedChar[j] = String.valueOf(PEM.c);
				} else if (ch[j] == 'd') {
					encryptedChar[j] = String.valueOf(PEM.d);
				} else if (ch[j] == 'e') {
					encryptedChar[j] = String.valueOf(PEM.e);
				} else if (ch[j] == 'f') {
					encryptedChar[j] = String.valueOf(PEM.f);
				} else if (ch[j] == 'g') {
					encryptedChar[j] = String.valueOf(PEM.g);
				} else if (ch[j] == 'h') {
					encryptedChar[j] = String.valueOf(PEM.h);
				} else if (ch[j] == 'i') {
					encryptedChar[j] = String.valueOf(PEM.i);
				} else if (ch[j] == 'j') {
					encryptedChar[j] = String.valueOf(PEM.j);
				} else if (ch[j] == 'k') {
					encryptedChar[j] = String.valueOf(PEM.k);
				} else if (ch[j] == 'l') {
					encryptedChar[j] = String.valueOf(PEM.l);
				} else if (ch[j] == 'm') {
					encryptedChar[j] = String.valueOf(PEM.m);
				} else if (ch[j] == 'n') {
					encryptedChar[j] = String.valueOf(PEM.n);
				} else if (ch[j] == 'o') {
					encryptedChar[j] = String.valueOf(PEM.o);
				} else if (ch[j] == 'p') {
					encryptedChar[j] = String.valueOf(PEM.p);
				} else if (ch[j] == 'q') {
					encryptedChar[j] = String.valueOf(PEM.q);
				} else if (ch[j] == 'r') {
					encryptedChar[j] = String.valueOf(PEM.r);
				} else if (ch[j] == 's') {
					encryptedChar[j] = String.valueOf(PEM.s);
				} else if (ch[j] == 't') {
					encryptedChar[j] = String.valueOf(PEM.t);
				} else if (ch[j] == 'u') {
					encryptedChar[j] = String.valueOf(PEM.u);
				} else if (ch[j] == 'v') {
					encryptedChar[j] = String.valueOf(PEM.v);
				} else if (ch[j] == 'w') {
					encryptedChar[j] = String.valueOf(PEM.w);
				} else if (ch[j] == 'x') {
					encryptedChar[j] = String.valueOf(PEM.x);
				} else if (ch[j] == 'y') {
					encryptedChar[j] = String.valueOf(PEM.y);
				} else if (ch[j] == 'z') {
					encryptedChar[j] = String.valueOf(PEM.z);
				} else if (ch[j] == 'A') {
					encryptedChar[j] = String.valueOf(PEM.aCap);
				} else if (ch[j] == 'B') {
					encryptedChar[j] = String.valueOf(PEM.bCap);
				} else if (ch[j] == 'C') {
					encryptedChar[j] = String.valueOf(PEM.cCap);
				} else if (ch[j] == 'D') {
					encryptedChar[j] = String.valueOf(PEM.dCap);
				} else if (ch[j] == 'E') {
					encryptedChar[j] = String.valueOf(PEM.eCap);
				} else if (ch[j] == 'F') {
					encryptedChar[j] = String.valueOf(PEM.fCap);
				} else if (ch[j] == 'G') {
					encryptedChar[j] = String.valueOf(PEM.gCap);
				} else if (ch[j] == 'H') {
					encryptedChar[j] = String.valueOf(PEM.hCap);
				} else if (ch[j] == 'I') {
					encryptedChar[j] = String.valueOf(PEM.iCap);
				} else if (ch[j] == 'J') {
					encryptedChar[j] = String.valueOf(PEM.jCap);
				} else if (ch[j] == 'K') {
					encryptedChar[j] = String.valueOf(PEM.kCap);
				} else if (ch[j] == 'L') {
					encryptedChar[j] = String.valueOf(PEM.lCap);
				} else if (ch[j] == 'M') {
					encryptedChar[j] = String.valueOf(PEM.mCap);
				} else if (ch[j] == 'N') {
					encryptedChar[j] = String.valueOf(PEM.nCap);
				} else if (ch[j] == 'O') {
					encryptedChar[j] = String.valueOf(PEM.oCap);
				} else if (ch[j] == 'P') {
					encryptedChar[j] = String.valueOf(PEM.pCap);
				} else if (ch[j] == 'Q') {
					encryptedChar[j] = String.valueOf(PEM.qCap);
				} else if (ch[j] == 'R') {
					encryptedChar[j] = String.valueOf(PEM.rCap);
				} else if (ch[j] == 'S') {
					encryptedChar[j] = String.valueOf(PEM.sCap);
				} else if (ch[j] == 'T') {
					encryptedChar[j] = String.valueOf(PEM.tCap);
				} else if (ch[j] == 'U') {
					encryptedChar[j] = String.valueOf(PEM.uCap);
				} else if (ch[j] == 'V') {
					encryptedChar[j] = String.valueOf(PEM.vCap);
				} else if (ch[j] == 'W') {
					encryptedChar[j] = String.valueOf(PEM.wCap);
				} else if (ch[j] == 'X') {
					encryptedChar[j] = String.valueOf(PEM.xCap);
				} else if (ch[j] == 'Y') {
					encryptedChar[j] = String.valueOf(PEM.yCap);
				} else if (ch[j] == 'Z') {
					encryptedChar[j] = String.valueOf(PEM.zCap);
				}
				if (j > 0) {
					finalEncryption = finalEncryption + "," + encryptedChar[j];
				} else {
					finalEncryption = finalEncryption + encryptedChar[j];
				}
			}
		}
		FileWriter.write("encryption", "outputs/", finalEncryption);
		FileWriter.deleteFile("temp", "outputs/");
	}

	public static void decrypt() {
		String text = DecryptionFrame.decryptText;
		String[] splitStrings = text.split(",");
		decryptedNum = new double[splitStrings.length];
		for (int i = 0; i <= splitStrings.length - 1; i++) {
			double num = Double.parseDouble(splitStrings[i]);
			decryptedNum[i] = num;
			System.out.println(decryptedNum[i]);
			if (decryptedNum[i] == space) {
				finalDecryption = finalDecryption + " ";
			} else if (decryptedNum[i] == PEM.a) {
				finalDecryption = finalDecryption + "a";
			} else if (decryptedNum[i] == PEM.b) {
				finalDecryption = finalDecryption + "b";
			} else if (decryptedNum[i] == PEM.c) {
				finalDecryption = finalDecryption + "c";
			} else if (decryptedNum[i] == PEM.d) {
				finalDecryption = finalDecryption + "d";
			} else if (decryptedNum[i] == PEM.e) {
				finalDecryption = finalDecryption + "e";
			} else if (decryptedNum[i] == PEM.f) {
				finalDecryption = finalDecryption + "f";
			} else if (decryptedNum[i] == PEM.g) {
				finalDecryption = finalDecryption + "g";
			} else if (decryptedNum[i] == PEM.h) {
				finalDecryption = finalDecryption + "h";
			} else if (decryptedNum[i] == PEM.i) {
				finalDecryption = finalDecryption + "i";
			} else if (decryptedNum[i] == PEM.j) {
				finalDecryption = finalDecryption + "j";
			} else if (decryptedNum[i] == PEM.k) {
				finalDecryption = finalDecryption + "k";
			} else if (decryptedNum[i] == PEM.l) {
				finalDecryption = finalDecryption + "l";
			} else if (decryptedNum[i] == PEM.m) {
				finalDecryption = finalDecryption + "m";
			} else if (decryptedNum[i] == PEM.n) {
				finalDecryption = finalDecryption + "n";
			} else if (decryptedNum[i] == PEM.o) {
				finalDecryption = finalDecryption + "o";
			} else if (decryptedNum[i] == PEM.p) {
				finalDecryption = finalDecryption + "p";
			} else if (decryptedNum[i] == PEM.q) {
				finalDecryption = finalDecryption + "q";
			} else if (decryptedNum[i] == PEM.r) {
				finalDecryption = finalDecryption + "r";
			} else if (decryptedNum[i] == PEM.s) {
				finalDecryption = finalDecryption + "s";
			} else if (decryptedNum[i] == PEM.t) {
				finalDecryption = finalDecryption + "t";
			} else if (decryptedNum[i] == PEM.u) {
				finalDecryption = finalDecryption + "u";
			} else if (decryptedNum[i] == PEM.v) {
				finalDecryption = finalDecryption + "v";
			} else if (decryptedNum[i] == PEM.w) {
				finalDecryption = finalDecryption + "w";
			} else if (decryptedNum[i] == PEM.x) {
				finalDecryption = finalDecryption + "x";
			} else if (decryptedNum[i] == PEM.y) {
				finalDecryption = finalDecryption + "y";
			} else if (decryptedNum[i] == PEM.z) {
				finalDecryption = finalDecryption + "z";
			}
			System.out.println(finalDecryption);
		}
	}
}
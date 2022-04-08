package TapTin;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ws {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		fout = new FileOutputStream("D:\\New.txt");
		String a="sa";
		byte b[]=getBytes(a);
		fout.write(b);
	}

	private static byte[] getBytes(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

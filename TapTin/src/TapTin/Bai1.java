package TapTin;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Bai1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		Random rd= new Random();
		Scanner input = new Scanner(System.in);
		fout = new FileOutputStream("D:\\New.txt");
		System.out.print("nhap n: "); int n= input.nextInt();
		float r[] = new float[n];
		for (int i=0;i<n;i++) {
			r[i]=rd.nextFloat();
			String a= String.valueOf(r[i]);
			byte b[]=a.getBytes();
			fout.write(b);
		}
		float a;
		System.out.print("nhap a: "); a= input.nextFloat();
		String w= String.valueOf(a);
		byte b[]=w.getBytes();
		fout.write(b);
		fout.close();
		fin = new FileInputStream("D:\\New.txt");
        int i=0;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
		fin.close();
	}

	private static byte[] getBytes(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

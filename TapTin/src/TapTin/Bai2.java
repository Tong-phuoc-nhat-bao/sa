package TapTin;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		fout = new FileOutputStream("D:\\Student.txt");
		Scanner input = new Scanner(System.in);
		System.out.print("nhap so hoc sinh: "); 
		int n= input.nextInt();
		Student a[] = new Student[n];
		for (int i=0;i<n;i++)
		{
			a[i]=new Student();
			System.out.println("student "+ (i+1)+" :");
			System.out.print("student name: ");
			a[i].name=input.next();
			System.out.print("StudentID: ");
			a[i].studentID=input.next();
			System.out.print("Student phone: ");
			a[i].phone=input.next();
			System.out.print("Student email: ");
			a[i].email=input.next();
			System.out.print("Student birthday: ");
			a[i].birthday=input.next();
			System.out.print("Student bloodtype: ");
			a[i].bloodtype=input.next();
			System.out.print("Student gender: ");
			a[i].gender=input.next();
			fout.write(getBytes("student "+ (i+1)+" : "));
			fout.write(getBytes(a[i].getName()+" "));
			fout.write(getBytes(a[i].getStudentID()+" "));
			fout.write(getBytes(a[i].getPhone()+" "));
			fout.write(getBytes(a[i].getEmail()+" "));
			fout.write(getBytes(a[i].getBirtday()+" "));
			fout.write(getBytes(a[i].getBloodtype()+" "));
			fout.write(getBytes(a[i].getGender()+" "));
			}
		fout.close();
		fin = new FileInputStream("D:\\Student.txt");
        int i=0;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
		fin.close();
	}

	private static byte[] getBytes(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}

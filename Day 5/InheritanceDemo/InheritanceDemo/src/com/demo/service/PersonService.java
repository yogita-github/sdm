package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.*;
//import com.demo.beans.GraduateStudent;
//import com.demo.beans.MasterStudent;
//import com.demo.beans.Student;

public class PersonService {
    static Student[] sarr;
    static int cnt;
    static {
    	sarr=new Student[100];
    	sarr[0]=new GraduateStudent(12, "Manjiri", "Pune", LocalDate.of(2000, 01, 03), new int[] {88,87},89);
    	sarr[1]=new GraduateStudent(13, "Mugdha", "Pune", LocalDate.of(1999, 02, 13), new int[] {78,75},77);
    	sarr[2]=new MasterStudent(14, "Sahil", "Mumbai", LocalDate.of(2002, 01, 03), new int[] {88,87},"accounts","BCOM",89);
         cnt=3;	
    }
	public static void addNewData(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ID");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter address");
		String addr=sc.next();
		System.out.println("enter birth date(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		if(ch==1 || ch==2) {
			int[] mks=new int[2];
			System.out.println("enetr marks1");
			mks[0]=sc.nextInt();
			System.out.println("enetr marks2");
			mks[1]=sc.nextInt();
			if(ch==1) {
				System.out.println("enterspecial subject marks");
				int  smarks=sc.nextInt();
				sarr[cnt]=new GraduateStudent(id, nm, addr, ldt, mks, smarks);
			}else {
				System.out.println("enterthesis subject");
				String tsub=sc.next();
				System.out.println("enter thesis subject marks");
				int  tmarks=sc.nextInt();
				System.out.println("enter graduation degree");
				String deg=sc.next();
				sarr[cnt]=new MasterStudent(id, nm, addr, ldt, mks, tsub,deg,tmarks);
			}
		}else {
			//enter faculty details
		}
		cnt++;
		
		
	}
	public static Student[] displayAll() {
		return sarr;
	}
	public static float findGrade(int id) {
		for(Student s:sarr) {
			if(s!=null) {
				if(s.getPid()==id) {
					//dynamic polymorphism
					float mks=s.calculateGrade();
					return mks;
				}
			}else {
				break;
			}
		}
		return -1;
	}
}

package com.greatlearning;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------");
		AdminDepartment ad = new AdminDepartment();
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodayWork());
		System.out.println(ad.getWorkDeadLine());
		System.out.println(ad.isTodayAHoliday());
		
		System.out.println("-----------------------------------");
		
		//create the object hr dep and use all the methods
		HrDepartment hd = new HrDepartment();
		System.out.println(hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodayWork());
		System.out.println(hd.getWorkDeadLine());
		System.out.println(hd.isTodayAHoliday());
		
		System.out.println("-----------------------------------");
		
		//create the object Tech dep and use all the methods
				TechDepartment td = new TechDepartment();
				System.out.println(td.departmentName());
				System.out.println(td.getTodayWork());
				System.out.println(td.getWorkDeadLine());
				System.out.println(td.getTechStackInformation());
				System.out.println(hd.isTodayAHoliday());
				
				System.out.println("-----------------------------------");

	}

}

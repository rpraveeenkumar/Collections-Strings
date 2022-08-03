package org.greenstask;

import java.util.ArrayList;
import java.util.List;

public class EmpData extends Datas {

	public static void main(String[] args) {
		List<EmpData> emp=new ArrayList<EmpData>();
		EmpData ed=new EmpData();
		ed.setId(001);
		ed.setName("Praveen");
		ed.setEmial("pr@gmail.com");
		EmpData ed2=new EmpData();
		ed2.setId(002);
		ed2.setName("Praveen2");
		ed2.setEmial("pr2@gmail.com");
		EmpData ed3=new EmpData();
		ed3.setId(003);
		ed3.setName("Praveen3");
		ed3.setEmial("pr3@gmail.com");
		
		emp.add(ed);
		emp.add(ed2);
		emp.add(ed3);
		for(EmpData x:emp)
		{
		System.out.println("Emp ID "+x.getId());
		System.out.println("Emp name "+x.getName());
		System.out.println("Emp email "+x.getEmial());
		}
		
	}
	
}

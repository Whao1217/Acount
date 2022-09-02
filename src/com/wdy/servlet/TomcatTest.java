package com.wdy.servlet;

import java.lang.reflect.Constructor;

public class TomcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="com.wdy.servlet.MyServlet";
		try {
			Class clazz=Class.forName(str);
			Constructor construcktor=clazz.getConstructor();
			//System.out.println(construcktor);
			Object object=construcktor.newInstance();
			System.out.println(object);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//catch(ClassNotFoundException e) {
		//	e.printStackTrace();
		//}catch(NoSuchMethodException e) {
		//	e.printStackTrace)();
		//}
	}
}

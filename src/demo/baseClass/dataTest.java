package demo.baseClass;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class dataTest {
	public static void main(String[] args){
		/*
		 * 字节范围
		 * */
		byte[] bt=new byte[256];
		int idx=0;
		for(int i=-128;i<=127;i++)
		{
			bt[idx]=(byte)i;
			convertByte(bt[idx]);
			idx++;
		}
		
		/*
		 * 字符串
		 * */
		System.out.println();
		String test = "test";
		test+="123123123";
		//StringBuffer 线程安全
		StringBuffer sBuffer=new StringBuffer("test");
		sBuffer.append("1231231231");
		//StringBuilder 快速 非线程安全
		StringBuilder sBuilder=new StringBuilder("test1");
		sBuilder.append(1231231232);
		System.out.printf("%s\r\n%s\r\n%s",test,sBuffer.toString(),sBuilder.toString());
		
		//枚举
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		days = dayNames.elements();
		while (days.hasMoreElements()){
		   System.out.println(days.nextElement()); 
		}
		//泛型集合
		ArrayList<String> strList=new ArrayList<String>();
		strList.add("aaa");
		strList.add("bbb");
		for (String string : strList) {
			
		}
	}
	
	public static  int convertByte(byte b){
		System.out.printf("%d ",(b& 0xff));
		return b& 0xff;
	}
}

package com.jou.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestApp33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("show date "+date);
		String dateString = TestApp33.dateToString(date, "yyyyMMdd");
		System.out.println("dateString "+dateString);
		treeTest();
		treeTest2();

	}
	
    public static String dateToString(Date d, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
        return sdf.format(d);
    }	
    
    public static void treeTest() {
    	SortedMap<String, String> tm = new TreeMap<>();
    	//Add value and  key
    	tm.put("Java programming", "jx141");
    	tm.put("Fe 10225 Programming", "fe103");
    	tm.put("Atom tutorial", "At1042");
    	
    	System.out.println("Show TreeMap =======>");
    	System.out.println(tm);
    }
    
    public static void treeTest2() {
    	SortedMap<String, Double> set1 = new TreeMap<>();
    	//add key - Value
    	set1.put("SCC", 145.25);
    	set1.put("BEC", 56.21);
    	set1.put("Apple", 655.12);
    	set1.put("Grow", 140.58);
    	set1.put("Xeon Production", 34.25);
    	set1.put("RPC", 78.01);
    	System.out.println("show set ==> "+set1);
    }

}

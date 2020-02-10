package com.maven.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseTest {
	
	public static FileInputStream fis;
	public static String projectpath =System.getProperty("user.dir");
	public static Properties e;
	public static Properties envprop;
	
	
	

	public static void init () throws Exception
	{
		
		fis = new FileInputStream(projectpath + "//src/test//resourses//environment.properties");
		e= new Properties ();
		e.load(fis);
		String e1=e.getProperty("env");
		System.out.println(e1);
		
	
	fis = new FileInputStream(projectpath + "//src/test//resourses//"+e1+".properties");
	
	envprop=new Properties();
	envprop.load(fis);
	envprop.getProperty("amazonurl");
	String url= envprop.getProperty("amazonurl");
	
	System.out.println(url);
	
	}
	
	
	
	
		
	
	
	
}

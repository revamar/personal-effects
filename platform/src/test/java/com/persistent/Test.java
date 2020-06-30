package com.persistent;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("java.class.path"));
		System.out.println("**********************************************");
		System.out.println(System.getProperty("java.ext.dirs"));
		Properties props=System.getProperties();
		if(props.isEmpty())
		{
			System.out.println("No props");
		}
		else {
			Set<Object> obj=props.keySet();
			for(Object o:obj)
			{
				System.out.println(o+"     "+System.getProperty((String)o));
			}
		}
		System.out.println("***********************Env**********************************************");
		Map<String, String> hmap=System.getenv();
		Set<String> keys=hmap.keySet();
		for(String s:keys) {
			System.out.println(s+"            "+System.getenv(s));
		}
	}

}

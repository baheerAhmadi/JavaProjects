package com.java.basiclibrarymanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {
//object create
//Property file ni read cheyali
//element ni return cheyali
//File Path ni read cheyali
	private static ReadPropertyFile rp;
	Properties p;
	InputStream fip;
	private String location="./src/DbDetails.properties";
	
	
	public ReadPropertyFile()
	{
		p=new Properties();
	}
	
	public static ReadPropertyFile getInstance()
	{
		if(rp==null)
		rp=	new ReadPropertyFile();
		return rp;
	}
	public String readPropertyfile(String key) throws FileNotFoundException, IOException
	{
		fip=new FileInputStream(location);
		p.load(fip);
		return p.getProperty(key);
	}
}
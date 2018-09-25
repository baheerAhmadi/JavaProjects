package com.practise.collection.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapimpl {
public static void main(String args[])
{
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(1, "Shiva");
	map.put(2, "Anand");
	map.put(3, "Raja");
	map.put(4, "Nikhil");
	
	Set<Entry<Integer, String>> set=map.entrySet();
	for(Entry<Integer, String> s: set)
	{
		System.out.println(s.getKey()+" "+""+s.getValue());
	}
	System.out.println(map.get(4));
}
}
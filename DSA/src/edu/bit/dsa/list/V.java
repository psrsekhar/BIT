package edu.bit.dsa.list;

import java.util.Enumeration;
import java.util.Vector;

public class V {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(10);
		for(int i=0; i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("end of loop....");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("end of enumeration....");
		
		v.add("samantha");
		v.addElement("sairam");		
		v.add(null);
		v.add(2, "143");
		v.addElement("kjych");
	}
}


/**
		System.out.println(v.capacity());
		
		System.out.println(v);
		
		System.out.println(v instanceof RandomAccess);
		System.out.println(v instanceof Serializable);
		System.out.println(v instanceof Cloneable);
		
		//Vector
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());		
		System.out.println(v.elementAt(0));
		//List
		System.out.println(v.get(1));
		
		v.remove(2);
		v.removeElement(String.valueOf("kjych"));
		v.removeElementAt(1);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
	}
}*/
//example

import java.util.*;
public class A {
	private int eid;
	private String ename;

	public void  seteid(int eid) {
		this.eid=eid;
		
	}
	public void setename(String ename) {
		this.ename=ename;
	}
	public int geteid() {
		return eid;
	}	
	public String geteename() {
		return ename;
		
	}
	 public static void main(String[] args) {
		}
}
//ahwdguawfIOGVUywgf next class

//file buffer code
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.dss.java.A;
import com.dss.java.B;

import pop.emp;
import pop.papa;
import pop.pop;
public class pop {
  public static void main(String[] args)throws IOException {
 
 File f=new File("llk.txt");
 f.createNewFile();
 BufferedReader myWriter= new BufferedReader(new FileReader(f));
 BufferedWriter p =new BufferedWriter(new FileWriter(f));
p.write("gwyfgqwifgiqwgfqfg3fufgiewfegfgu");
String line;
  while ((line=myWriter.readLine())!=null){
	  System.out.println(line);
  p.close();
  myWriter.close();}
  System.out.println("Successfully wrote to the file.");
  }

	

}
//new file code 
public class pop {
	  public static void main(String[] args)throws IOException {
	 
	 File f=new File("l.txt");
	 f.createNewFile();
	 BufferedReader myWriter= new BufferedReader(new FileReader("l.txt"));
	 myWriter.read();
	 BufferedWriter p =new BufferedWriter(new FileWriter("m.txt"));
	 p.write("gwyfgqwi      dwiqhf              221bdu1212");
	 myWriter.close();
	 p.close();
	  }
	}
 ///string manipulation code

	void m() throws ArithmeticException {
		
	
	 String s1="     aaja          ";
	 String s="aaja";
	 String s5="raja";
	System.out.println(s1.equalsIgnoreCase(s));
	System.out.println(s1.equals(s5));
	System.out.println(s1.compareToIgnoreCase(s));
	System.out.println(s1.compareTo(s5));

	System.out.println("Raja".equalsIgnoreCase("raja"));
	System.out.println("Raja".compareToIgnoreCase("raja"));
	 
	int a[]=new int[100];
	System.out.println(s1.equalsIgnoreCase(s));
	System.out.println(a.length);
	System.out.println(s1.trim().length());
	
	System.out.println(0);
	
	
	
	
	}
	public static void main(String[] uio)throws ArithmeticException{
		pop p=new pop();
		p.m();
	}
	
}
//arrays example//
/* skeleton class*/
class B{
int eid;
String ename;
	
	public  B(int eid,String ename) {	 			
	this.eid=eid;
			
	 this.ename=ename;
	
	}
}
//extension

public class C {
public static void main(String args[]) {
	B b=new B(699,"koo");
	B p=new B(98,"klogbjo");
	B pq=new B(143,"sanvy");
	B[] m=new B[5];
	m[0]=b;
	m[4]=p;
	m[2]=pq;
	for(Object o: m) {
		if(o instanceof B){
			B e=(B)o;
			System.out.println(e.eid+"-----"+e.ename);		}
		if(o==null) {
			System.out.println(o);
		}
	

	}
		
	
}

}	
//array code for parameter passing
public class A {
	 int[] m() {
		 
			 System.out.println("method 1");
			 int[] p= {1,2,3};
			 return p;
			 
			 }
	void n(double[] d) {
		 System.out.println("method 2");
		 	for(double dd:d) {
			System.out.println(dd);
		}
		 
	 }

public static void main (String args[]) {
	A t=new A();
	int[] x=t.m();
	for(int xx:x)
		 System.out.println(xx);
	double[] d= {12.5,7.8,6.78};
t.n(d);
	
}

}
//enumaration

package pop;
enum papa{
	sam,jam,par
}
class pop {
	
	public static void main(String args[])  
	{
		papa p=papa.jam;
		papa p1=papa.sam;
		papa p2=papa.par;
		
		switch(p) {
		
		case sam:
			System.out.println("case is" +p1);
			break;
		case jam:
			System.out.println("case is" +p);
			break;
		case par:
			System.out.println("case is" + p2);
			break;
		default:
			System.out.println("all cases are executed");
			break;
			
		
		}

		}
		

	}

	//enum multiple constructor example

package pop;
enum papa{
	sam(10),jam(90,90,900),par(30,000);
	int rating, ram,p;
	papa(int rating){
		this.rating=rating;
	} 
	
	papa(int rating,int ram){
		this.rating=rating;
		this.ram=ram;
	}
	papa(int rating,int ram,int p){
		this.rating=rating;
		this.ram=ram;
		this.p=p;
		
	}
	
}
class pop {
	
	public static void main(String args[])  
	{

	papa[] p	=papa.values();
	
	for(papa pp:p) {
		System.out.println(pp+"------"+pp.ordinal()+"---ratings---"+pp.rating+"----"+pp.ram+"----"+pp.p);	
	
	}
	
	}

	}
	//multiple threading 

class papa extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
	System.out.println("---user thread---");
	}
	}
	class pip extends Thread{
	public void run(){
		for(int i=0;i<4;i++) {
			System.out.println("---1-arg thread---");
		}
	}
	
			}
	
class pop{	
public static void main(String args[])  {
		papa p1=new papa();
		p1.run();
		papa p2=new papa();
		p2.run();

		
			System.out.println(p1.getName());
			System.out.println(p2.getId());
			System.out.println(p2.getClass());
			System.out.println(p2.getName());
			p2.setName("lobe");
			System.out.println(p2.getName());
	}

	
}
}
//using implementation (-------second method----)

package com.dss.java;
class B implements Runnable{
	
	public void run() {
		for(int i=0;i<4;i++) {
	System.out.println("---user thread---");
	
		}
	}

}

 class A  {
 public static void main (String args[])  {
 B b=new B();
 Thread t=new Thread(b);
 t.start();
	System.out.println("---main thread---");

		   
			}

 
 //throws InterruptedException
 
 
 }
 
 

	//collectons:
 //arraylist
 --->create classes inthat class only
 package pop;
 import java.util.*;
 class pop{	
 	
 	int pid;String pname;
 	pop(int pid,String pname) {
 		this.pid=pid;
 		this.pname=pname;
 	}
 	public static void main(String args[])  {
 		pop p=new pop(666,"iii");
 emp e=new emp(999,"lll");
 abc a1=new abc(007,990);

 			ArrayList a=new ArrayList();
 a.add(p);
 a.add(e);
 a.add(a1);
 a.add("raja");
 a.add(989);
 System.out.println(a);
 for(Object o:a) {
 	if(o instanceof pop) {
 		pop pp= (pop)o;
 		System.out.println(pp.pid+"is pop"+pp.pname);
 		
 	}
 	if(o instanceof emp) {
 		emp ee= (emp)o;
 		System.out.println(ee.eid+"is emp"+ee.ename);
 		
 	}
 	if(o instanceof abc) {
 		abc aa= (abc)o;
 		System.out.println(aa.aid+"is abc"+aa.anum);
 		
 	}
 	if(o instanceof String) {
 		System.out.println(o);
 }
 	if(o instanceof Integer) {
 		System.out.println(o);
 }

 	
 }
 	}
 }
 
 package pop;
 import java.util.*;
 class pop{	
 	
 	int pid;String pname;
 	pop(int pid,String pname) {
 		this.pid=pid;
 		this.pname=pname;
 	}
 	public static void main(String args[])  {
 		pop p=new pop(666,"iii");
 emp e=new emp(999,"lll");
 abc a1=new abc(007,990);

 			ArrayList a=new ArrayList();
 a.add(p);
 a.add(e);
 a.add(a1);
 a.add("raja");
 a.add(989);
 System.out.println(a);
 for(Object o:a) {
 	if(o instanceof pop) {
 		pop pp= (pop)o;
 		System.out.println(pp.pid+"is pop"+pp.pname);
 		
 	}
 	if(o instanceof emp) {
 		emp ee= (emp)o;
 		System.out.println(ee.eid+"is emp"+ee.ename);
 		
 	}
 	if(o instanceof abc) {
 		abc aa= (abc)o;
 		System.out.println(aa.aid+"is abc"+aa.anum);
 		
 	}
 	if(o instanceof String) {
 		System.out.println(o);
 }
 	if(o instanceof Integer) {
 		System.out.println(o);
 }

 	
 }
 	}
 }


//homogeneous arraylist
 package pop;
 import java.util.*;
 class pop{	
 	
 	int pid;String pname;
 	pop(int pid,String pname) {
 		this.pid=pid;
 		this.pname=pname;
 	}
 		
 static emp e=new emp(999,"lll");
 static emp e1=new emp(888,"www");
 static emp e2=new emp(555,"jjj");

 public static void main(String args[]) {
 ArrayList<emp> arrayList = new ArrayList<emp>();
 arrayList.add(e);
 arrayList.add(e1);
 arrayList.add(e2);
 System.out.println(arrayList);
 for(emp e:arrayList) {
 	System.out.println(e.eid+ " employee " +e.ename);
 } 	
 }
//for predifinied sorting()
 
 public static void main(String args[]) {
	 ArrayList<int> arrayList = new ArrayList<int>();
	 arrayList.add(1);
	 arrayList.add(11);
	 arrayList.add(2);
	 System.out.println("before sorting"+arrayList);
	 collections.sort(arrayList);
	 System.out.println("after sorting"+arrayList);
		
	 }
 	//for user defined data sorting
 //first class
 package pop;
 import java.util.*;
 class pop{	
 		
 public static void main(String args[]) {
 	 emp e=new emp(111,"raja");
 	 emp e1=new emp(222,"sanvy");
 	 emp e2=new emp(333,"zanvy");
 ArrayList<emp> arrayList = new ArrayList<emp>();
 arrayList.add(e);
 arrayList.add(e1);
 arrayList.add(e2);
 System.out.println("before = "+arrayList);
 Collections.sort(arrayList);
 System.out.println("after = "+arrayList);
 for(emp ee:arrayList) {
 	
 	System.out.println(ee.eid+"------"+ee.ename);
 }

 }
 }
    
//second class
 package pop;

 public class emp implements Comparable<emp> {
 	

 int eid;String ename;

 public emp( int eid, String ename){
 	this.eid=eid;
 	this.ename=ename;
 	 
 	
 }

 @Override
 public int compareTo(emp e) {
 	// TODO Auto-generated method stub
 	if(eid==e.eid) {
 		
 	return 0;}
 	else if(eid >e.eid){
 		return -1;
 	}
 	else {
 		return 1;
 	}
 	(or)
 return -ename.compareTo(e.ename);
 }
 }
//comparator operator
 1st class:
	 
	 package pop;

 public class emp  {
 	

 int eid;String ename;

 public emp( int eid, String ename){
 	this.eid=eid;
 	this.ename=ename;
 	 
 	
 }

2nd class:
	package pop;

	import java.util.*;

	public class empid implements Comparator<emp>  {
	 
	@Override
	public int compare(emp e1,emp e2 ) {
		return (e1.ename).compareTo(e2.ename);
	}
		

	}
3rd class:
	
	package pop;

	import java.util.*;

	class xyz implements Comparator<emp> {

		@Override
		public int compare(emp e1,emp e2) {

			if(e1.eid==e2.eid) {
				return 0;
				
			}
			else if(e1.eid>e2.eid) {
				return 1;
				
			}
			else {
				return -1;
			}
		}
		
	}
4th class:
	package pop;
	import java.util.*;
	class pop{	
			
	public static void main(String args[]) {
		 emp e=new emp(111,"aja");
		 emp e1=new emp(333,"soy");
		 emp e2=new emp(222,"zvy");
	ArrayList<emp> arrayList = new ArrayList<emp>();
	arrayList.add(e);
	arrayList.add(e1);
	arrayList.add(e2);
	System.out.println("before = "+arrayList);
	Collections.sort(arrayList,new empid());
	for (emp ee:arrayList) {
		System.out.println(ee.eid+"---"+ee.ename);
	}
	}

	}
	   
 }
//Hashmap and Linked Hashmap:
	
 package pop;
 import java.util.*;
 class pop{		
 public static void main(String args[]) {
 	 LinkedHashMap<Integer, String> arrayList =new LinkedHashMap<Integer, String>();
 arrayList.put(111,"pop");
 arrayList.put(22,"pop");
 arrayList.put(333,"pop");
 arrayList.put(441,"pop");
 LinkedHashMap<Integer, String> a =new LinkedHashMap<Integer, String>(arrayList);
 a.put(66, "jjj");
 a.put(77, "lll");
 a.put(88, "kkk");
 System.out.println(a);
 System.out.println(arrayList.keySet());
 System.out.println(arrayList.values());
 System.out.println(arrayList.entrySet());
 Set<?> ss=arrayList.entrySet();
 Iterator<?> i=ss.iterator();
 while(i.hasNext()) {
 	Map.Entry m=(Map.Entry)i.next();
 	System.out.println(m.getKey()+"-----"+m.getValue());
 }


 }
 }
    
//awt package
 package pop;
 import java.awt.*;
 class pop{		
 public static void main(String args[]) {
 	 Frame f=new Frame();
 	 f.setVisible(true);
 f.setSize(300, 300);
 f.setTitle("this is my frame");
 f.setBackground(Color.BLUE);
 f.setLayout(new FlowLayout());
 Label l=new Label("username" );
 Label l1=new Label("password");
 TextField t=new TextField(20);
 TextField t1=new TextField(20);
 t1.setEchoChar('*');
 		Button b=new Button("login");
 	f.add(l);
 	f.add(t);
 	f.add(l1);
 	f.add(t1);
 	f.add(b);
 	Label l2=new Label("fruits");
 	Label l3=new Label("gender");	
 	Checkbox c=new Checkbox("mango",true);
 	Checkbox c1=new Checkbox("apple");
 	Checkbox c2=new Checkbox("guava");
 System.out.println(c1.getLabel());
 	CheckboxGroup cg=new CheckboxGroup();
 	Checkbox c4=new Checkbox("male",cg,true);
 	Checkbox c5=new Checkbox("female",cg,false);
 	System.out.println(c4.getLabel());
 	f.add(l2);
 	f.add(c);
 	f.add(c1);
 	f.add(c2);
 	f.add(l3);
 	f.add(c4);
 	f.add(c5);
 }
 }
   //adding exit feature
 package pop;
 import java.awt.*;
 import java.awt.event.WindowAdapter;
 import java.awt.event.WindowEvent;
 import java.awt.event.WindowListener;
 class pop{		
 public static void main(String args[]) {
 	 Frame f=new Frame();
 	 f.setVisible(true);
 f.setSize(300, 300);
 f.setTitle("this is my frame");
 f.setBackground(Color.BLUE);
 f.setLayout(new FlowLayout());
 	f.addWindowListener(new emp());
 	
 		
 	}
 }
//2nd class
 public class emp extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			System.exit(0);
		}
//checkbox
		package pop;
		import java.awt.*;
		import java.awt.event.ItemEvent;
		import java.awt.event.ItemListener;
		@SuppressWarnings("serial")
		class po p extends Frame implements ItemListener {	
			Label l, l1;
			Checkbox c1,c2,c3,c4,c5;
			CheckboxGroup cg;
			String shop;
			String salad;
			
		pop(){
		setVisible(true);
		setSize(300, 300);
		setTitle("this is my frame");
		setBackground(Color.BLUE);
		setLayout(new FlowLayout());
		l=new Label("fruits" );
		c1=new Checkbox("apple");
		c1.addItemListener(this);
		c2=new Checkbox("banana");
		c2.addItemListener(this);
		c3=new Checkbox("guava");
		c3.addItemListener(this);
		l1=new Label("vegies");
		CheckboxGroup cg=new CheckboxGroup();
		c4=new Checkbox("cucumber",cg,false);
		c4.addItemListener(this);
		c5=new Checkbox("carrot",cg,false);
		c5.addItemListener(this);
				
			add(l);
			add(c1);
			add(c2);
			add(c3);
			add(l1);
			add(c4);
			add(c5);
		addWindowListener(new emp());}

		public static void main(String args[]) throws Exception{	
			pop p=new pop();
			
			}
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method 
		if(c1.getState()==true) {
			shop=c1.getLabel();
			}
		if(c2.getState()==true) {
			shop=c2.getLabel();
		}
		if(c3.getState()==true) {
			shop=c3.getLabel();
		}
		if((c3.getState())==true) {
			shop=c3.getLabel();
		}
		if(c4.getState()==true){
				salad=c4.getLabel();
			}
		if(c5.getState()==true) {
			salad=c5.getLabel();
		}
		if((c1.getState())&& (c2.getState())==true){
			shop=c1.getLabel()+" and "+c2.getLabel();
		}

			repaint();

		}

			
		public void paint(Graphics graphics) {
			graphics.drawString(shop, 50, 250);
			graphics.drawString(salad, 200, 250);
		}



		}
		   
//problem solving:
//------------------
//	1)	inst and  static:
		package pop;
		import java.util.*;

		public class emp 
		{int a,b,sum;
			public static void main(String args[]) {
				emp e=new emp();
				System.out.println("enter the values to add: ");
				try (Scanner sc = new Scanner(System.in)) {
					e.a=sc.nextInt();
					e.b=sc.nextInt();
					int p=e.a;
					int q=e.b;
					int r=e.sum;
					r=p+q;
					System.out.println("the sum of numbers are: "+r);
				}
			}
		
//2)Maximum of numbers:
			int maximum()	{
				int[] p= {1,2,3,4,55};
				int max=p[0];
				for(int tvrs:p) {
					if(tvrs>max) {
						max=tvrs;
							
					}
					
				}System.out.println("highest is "+max);
				return max;
				
				}	
		public static void main(String args[]) {	
		pop p=new pop();
		p.maximum();
		}
	}
//swapping numbers:
 class pop{
 	//void swap{}	
 public static void main(String args[]) {
 	int num1,num2,sup;
 	System.out.println("enter numbers to swap:");
 	try (Scanner sc = new Scanner(System.in)) {
 		num1=sc.nextInt();
 		num2=sc.nextInt();
 	}
 	sup=num1;
 	num1=num2;
 	num2=sup;
 System.out.println("after swapping numbers:"+num1+""+num2);	
 }
 }
 //	second method:
 class oso{
 	//void swap{}	
 public static void main(String args[]) {
 	int m,n;
 	System.out.println("enter numbers to swap:");
 	try (Scanner sc = new Scanner(System.in)) {
 		m=sc.nextInt();
 		n=sc.nextInt();
 	}
 	m=m+n;
 	n=m-n;
 	m=m-n;
 		System.out.println("after swapping numbers:"+m+""+n);

 } }
 //lcm of numbers
//Java program to find LCM of two numbers.
class gfg {
	// Gcd of u and v using recursive method
	static int GCD(int u, int v)
	{
		if (u == 0)
			return v;
		return GCD(v % u, u);
	}

	// LCM of two numbers
	static int LCM(int u, int v)
	{
		return (u / GCD(u, v)) * v;
	}

	// The Driver method
	public static void main(String[] args)
	{
		int u = 25, v = 15;
		System.out.println("LCM of " + u + " and " + v
						+ " is " + LCM(u, v));
	}

//gcd of numbers
 static int GCD1(int u, int v)
{
	if (u == 0)
		return v;
	return GCD(v % u, u);
	 
}
 //prime number
int count,n;
for(int i=1;i<=n;i++) {
	if(n%i==0)
		count++;
	if(count==2)
System.out.println("prime number");	
	else 
		System.out.println("non-prime number");	
}
 //leap year
class source code{
{
	int n=0;
	void m(int year) {
		if(year%4==0)
			n=1;
		else n=2;
		if(year%100==0)
			if(year%400==0)
				n=1;
			else n=2;
		if(n==1)
			System.out.println(" leap year");
	
		
			System.out.println("Non-leap year");
		
		
	}
	  public static void main(String[] args) {
		  try (Scanner sc = new Scanner(System.in)) {
			int p=sc.nextInt();
			pop pp=new pop();
			pp.m(p);
		}
		  
	  }

}
//factorial

		public static void main(String[] args) {
			System.out.println("Enter the num:");
		try (Scanner sc = new Scanner(System.in)) {	
		int k=sc.nextInt();
	int r=k*4;
	int p=r/4;
		while(p>1){
				p=p-1;
				 k=k*p;
				 
			}
		System.out.println(k);
	}
}
}
//fibnoccii and its even and odd number index printing

class pop{
		public static void main(String[] args) {
			System.out.println("Enter the fibb num:");
		try (Scanner sc = new Scanner(System.in)) {		
			int k=sc.nextInt();
			int a=0;
	int b=1;int c=0;int count=0;
	for(int i=0;i<k;i++){
			 c=a+b;
			a=b;
			b=c;
		count++;
		System.out.println("value: "+c+" index: "+(count+1));
		if(c%2==0) {
			System.out.println("even value: "+c+" it's index: "+(count+1));
		}
		else {
			System.out.println("odd value: "+c+" it's index: "+(count+1));
		}	
	}
	if(k==0) {
		c=0;
		count=-1;
		System.out.println("value: "+c+" index: "+(count+1));
	}
}
		}
		}
//string problems
//Java program to get a specific character from a given String at a specific index
class pop{

// Function to get the specific character
	void m() {
		String s;
		System.out.println("ënter the string:");
			Scanner sc = new Scanner(System.in);
			s=sc.next();
			System.out.println("ënter the index :");
			int i=sc.nextInt();
		char c =s.charAt(i);
			System.out.println(c);

	}
	public static void main(String args[])
    {
		pop p=new pop();
		p.m();
    }}
      //replace character at given index  
import java.util.*;
class pop{

	// Function to get the specific character
		void m() {
			String s;
			System.out.println("ënter the string:");
				Scanner sc = new Scanner(System.in);
				s=sc.next();
				System.out.println("ënter the index :");
				int i=sc.nextInt();
			char c =s.charAt(i);
			System.out.println("ënter the character :");
			String p=sc.next();
			char cc =s.charAt(0);
			String str=s.replace (c,cc);
			
		}
		public static void main(String args[])
	    {
			pop p=new pop();
			p.m();
	    }}

//reverse a string
package pop;

import java.util.*;
class pop{
	void m() {
		String s;	String ss="";
		System.out.println("ënter the string:");
			Scanner sc = new Scanner(System.in);
			s=sc.next();
			for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);	
	ss=c+ss;
			}
			System.out.println(ss);
	}
	public static void main(String args[])
 {
		pop p=new pop();
		p.m();
 }
     
 } 
//contain a character
package pop;
import java.util.*;
class pop{
package pop;

	boolean pp=true;

	void m() {
		String s;
		this.pp=pp;
		System.out.println("ënter the string:");
			try (Scanner sc = new Scanner(System.in)) {
				s=sc.next();
			}
		for(char c='a';c<='z';c++) {	
	
	if(s.contains(String.valueOf(c))) {
		boolean pp=true;
	break;
	}
	
		}
	if(pp==true) {
		System.out.println("present");
	}else {
		System.out.println("not there");
	}
		
		
		
		
		}
	public static void main(String args[])
 {
		pop p=new pop();
		p.m();
 }    
 } 
//Arrays
//maximum number 
package com.dss.java;

import java.util.Arrays;
import java.util.Scanner;

class A {
	void m() {
		Scanner sc=new Scanner(System.in);
		String	s=sc.next();
char[] cc=s.toCharArray();
char max=cc[0];
for(char c:cc){
	if(c>max) {
		max=c;
	}
	
}
System.out.println(max);	}
	public static void main(String args[])
{
A a=new A();
a.m();
}
}
//adding of to arrays
package com.dss.java;

import java.util.Arrays;
import java.util.Scanner;

class A {
	int j=0;
	char r;
	void m() {
		Scanner sc=new Scanner(System.in);
		String	s=sc.next();
	char[] cc=s.toCharArray();	
String	ss=sc.next();
char[] c=ss.toCharArray();
int pp=cc.length;
int p=c.length;
int r=pp+p;
int pop[] = new int[r];
System.out.println(pp);	
System.out.println(p);	
for(int i=0;i<cc.length;i++) {
	pop[i]=cc[i];
}
for(int j=0;j<p;j++) {
	pop[pp+j]=c[j];
}
for(int k=0;k<r;k++) {
	System.out.println(pop[k]);
}}
	public static void main(String args[])
{
A a=new A();
a.m();
}
}
 
 //completed core java 
//spring framework
-------------------

//class-1
-----------
package com.nani.bhanu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class lion{
@Autowired
	siddu s;
	
public void m() {	
	System.out.println("lion class");
	s.p();
}
}


//class-2
--------
package com.nani.bhanu;

import org.springframework.stereotype.Component;

@Component
public class siddu { 
void p() {
	System.out.println("siddu class");
}
}


//config class
--------------
package com.nani.bhanu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nani.bhanu")
public class animal {

}
//main class
--------------
package com.nani.bhanu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext cxt=new AnnotationConfigApplicationContext(animal.class);
lion l=(lion)cxt.getBean(lion.class);  
l.m();
    
    }
}
//


 
 








 











 
 
 
 
 
 
 
 
 
 
 
 	


 	
 	



		
		 











			
			

			
			
			
			
			
			
			


	
		   

			
			

			
			
			
			
			
			
			


		   

			
			

			
			
			
			
			
			
			



 	
 	

 	
 	
 	
 	
 	
 	
 	



 	
 	

 	
 	
 	
 	
 	
 	
 	


 	
 	

 	
 	
 	
 	
 	
 	
 	



 	
 	
 	
 	
 	
 	
 	



 	
 	
 	
 	
 	
 	
 	


 	
 	

 	
 	
 	
 	
 	
 	
 	



 	
 	

 	
 	
 	
 	
 	
 	
 	


 

	
	
	
	
	
	
	



	
	

	
	
	
	
	
	
	
	
	



	
	
	
	


 	
 	

 	
 	
 	
 	
 	
 	
 	


	
	
	
	



	




  


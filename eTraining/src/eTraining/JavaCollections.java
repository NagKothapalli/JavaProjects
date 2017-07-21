package eTraining;

import java.util.ArrayList;

import org.junit.Test;

public class JavaCollections
{
	
	@Test
	public void staticIntegerArray()
	{
		int[] numbers = {2,4,6,8,10};
		
		System.out.println("Length of my string : " + numbers.length);
		
		for(int i=0; i<numbers.length;i++)
		{
			System.out.println("My Elements the Array :" + numbers[i]);
		}
		
		for(int i=0; i<numbers.length;i++)
		{
			numbers[i] = i+4;
			System.out.println("My Elements after writing  :" + numbers[i]);
		}
	}
	
	@Test
	public void staticStringArray()
	{
		String[] names = {"Ram","Ravi","Raj","Raju"};
		
		System.out.println("Length of my string : " + names.length);
		
		for(int i=0; i<names.length;i++)
		{
			System.out.println("My Elements the Array :" + names[i]);
		}
		
		for(int i=0; i<names.length;i++)
		{
			names[i] = "Selenium";
			System.out.println("My Elements after writing  :" + names[i]);
		}
	}
	
	@Test
	public void dynamicIntArray()
	{
		int[] numbers = new int[10];
		System.out.println("Array Size : " + numbers.length);
		for(int i=0;i<10;i++)
		{
			System.out.println("My Value at " + i  +" Position " + numbers[i]) ;
		}
		
		for(int i=0;i<10;i++)
		{
			numbers[i] = i+8;
			System.out.println("My Value at " + i  +" Position " + numbers[i]) ;
		}
	}
	
	@Test
	public void dynamicStringArray()
	{
		String[] names = new String[10];
		System.out.println("Array Size : " + names.length);
		for(int i=0;i<10;i++)
		{
			System.out.println("My Value at " + i  +" Position " + names[i]) ;
		}
		
		for(int i=0;i<10;i++)
		{
			names[i] = "Slenium";
			System.out.println("My Value at " + i  +" Position " + names[i]) ;
		}
	}
	
	@Test
	public void arrayListInteger()
	{
		ArrayList<Integer>  numbers = new ArrayList<Integer>();
		System.out.println("Size of array before loading :" + numbers.size());
		for(int i=0;i<15;i++)
		{
			numbers.add(i, i+4);
			System.out.println("Elements in my array list :" +numbers.get(i));
			
		}
		System.out.println("Size of array after loading :" + numbers.size());
	}
	
	@Test
	public void arrayListString()
	{
		ArrayList<String>  names = new ArrayList<String>();
		System.out.println("Size of array before loading :" + names.size());
		for(int i=0;i<15;i++)
		{
			names.add(i, "Java Collections");
			System.out.println("Elements in my array list :" +names.get(i));
			
		}
		System.out.println("Size of array after loading :" + names.size());
	}

}

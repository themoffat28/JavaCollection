package controller;

import model.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Controller
{
	private Queue<Customers> customer;
	private Stack<Pie> pie;
	
	public Controller()
	{
		customer = new LinkedList<Customers>();
		pie = new Stack<Pie>();
	}
	
	public void start()
	{	
		Pie pumpkin = new Pie();
		Pie apple = new Pie();
		
		pie.push(pumpkin);
		pie.push(apple);
		pie.peek();
		pie.pop();
		pie.peek();
		
		Customers one = new Customers();
		Customers two = new Customers();
		Customers three = new Customers();
		
		customer.add(one);
		customer.add(two);
		customer.add(three);
		customer.remove();
		customer.peek();
		customer.remove();
		customer.peek();
		
	}
}

package edu.cofc.csci221.ui;


//Author: Carson Smith
//Since: 12/1/14
//This is a KochLine class for creating KochLines on a graphics interface

public class KochLine extends Line {
	
	private Point p1 = new Point(null);
	private Point p2 = new Point(null);
	private Point p3 = new Point(null);
	private Point p4 = new Point(null);
	private Point p5 = new Point(null);
	
	//KochLine constructor
	//Params: A start point and end point
	//precondition: none
	//postcondition: a new KochLine is created
	//return: none
	public KochLine(Point start, Point end){
		
		super(start, end);
		p1 = getStart();
		p5 = getEnd();
	}
	
/* The following methods get different line objects that are created. Because they are all so similar, I'm just 
 * using one comment block.
 * 
 * param: none
 * return: a kochline (depending on which method is used)
 * precondition: the points be created
 * postcondition: kochlines are returned
 */
	
	public KochLine getLineA(){
		KochLine a = new KochLine(p1, p2);
		
		return a;
	}
	
	public KochLine getLineB(){
		KochLine b = new KochLine(p2, p3);
		
		return b;
	}
	
	public KochLine getLineC(){
		KochLine c = new KochLine(p3, p4);
		
		return c;
	}
	
	public KochLine getLineD(){
		KochLine d = new KochLine(p4, p5);
		
		return d;
	}
	
	/* This method creates Fractal points using the values supplied to it. It's useful
	 * param: none
	 * return: none
	 */
	
	public void computeFractal(){
		
		
		double deltaX = p5.getX() - p1.getX();
		double deltaY = p5.getY() - p1.getY();
		double x2 = p1.getX() + (deltaX/3);
		double y2 = p1.getY() + (deltaY/3);
		double x3 = (p5.getX() + p1.getX())/2 + Math.sqrt(3) * (p1.getY() - p5.getY())/6;
		double y3 = (p5.getY() + p1.getY())/2 + Math.sqrt(3) * (p5.getX() - p1.getX())/6;
		double x4 = p1.getX() + (2 * deltaX)/3;
		double y4 = p1.getY() + (2 * deltaY)/3;
		
		p2.setX((int)x2);
		p2.setY((int)y2);
		
		p3.setX((int)x3);
		p3.setY((int)y3);
		
		p4.setX((int)x4);
		p4.setY((int)y4);
		
	
	}
	
	/* This method determines if the KochLines are valid.
	 * param: none
	 * return: true if they are valid, false if not
	 */
	
	public boolean isKochLineValid(){
		
		boolean test1 = getLineA().isValid();
		boolean test2 = getLineB().isValid();
		boolean test3 = getLineC().isValid();
		boolean test4 = getLineD().isValid();
		
		if(test1 == true && test2 == true && test3 == true && test4 == true){
			return true;
		} else{
			return false; 
		}
	}
}

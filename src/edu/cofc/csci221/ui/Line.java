/* Author : Carson Smith
 * Since  : October 8th, 2014
 * 
 * Description : This class allows lines to be created, for use in graphs and other visual components.
 * 
 */


package edu.cofc.csci221.ui;

public class Line {

	Point start;
	Point end;
	
	public Line(Point start, Point end){
		
		//precondition: start and end must not be null
		//postcondition: a new line is created
		
		if(start != null && end != null){
			this.start = start;
			this.end = end;
		}
	}
	
	public Point getStart(){
		
		//precondition: none
		//postcondition: a line's starting point is returned
		
		return this.start;
		
	}
	
	public Point getEnd(){
		
		//precondition: none
		//postcondition: a line's end point is returned
		
		return this.end;
		
	}
	
	public void setStart(Point start){
		
		//precondition: start must not be null
		//postcondition: a line's starting point is changed
		
		if(start != null){
			this.start = start;
		}
	}
	
	public void setEnd( Point end){
		
		//precondition: end must not be null
		//postcondition: a line's ending point is changed.
		if(end != null){
			this.end = end;
		}
		
	}
	
	public boolean isValid(){
		
		//precondition: none
		//postcondition: a boolean value is returned based on whether a line is valid or not
		if(start != null && end != null){
			return true;
		} else{
			return false;
		}
	}
}

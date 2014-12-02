/* Author : Carson Smith
 * Since  : October 8th, 2014
 * 
 * Description : This class allows points to be created, for use in graphs and lines.
 * 
 */

package edu.cofc.csci221.ui;

public class Point {

	int x;
	int y;
	
	
	
	public Point(){
		//precondition: none
		//postcondition: none
	}
	
	public Point(Point point){
		
		//precondition: the point parameter must not be null
		//postcondition: a new point object is created
		if(point != null){
			if(point.getX() >= 0 && point.getX() <= GridConstants.MAX_PANEL_WIDTH){
				point.setX(point.getX());
			} else {
				point.setX(0);
			}
			if(point.getY() >= 0 && point.getY() <= GridConstants.MAX_PANEL_HEIGHT){
				point.setX(point.getY());
			} else {
				point.setY(0);
			}
		}
	}
	
	public Point(int x, int y){
		
		//precondition: x and y must be nonnegative and be within the maximum allowed width/height, respectively.
		//postcondition: a new point is created
		if(x>= 0 && x<= GridConstants.MAX_PANEL_WIDTH){
			this.x = x;
		} else {
			this.x = 0;
		}
		
		if(y>=0 && x<= GridConstants.MAX_PANEL_HEIGHT){
			this.y = y;
		} else {
			this.y = 0;
		}
	}
	
	public void setX(int x){
		
		//precondition: x must be nonnegative
		//postcondition: the point's x value is changed.
		if(x>= 0 && x<= GridConstants.MAX_PANEL_WIDTH){
			this.x = x;
		}
		
	}
	
	public void setY(int y){
		
		//precondition: y must be nonnegative
		//postcondition: the point's y value is changed.
		if(y>=0 && x<= GridConstants.MAX_PANEL_HEIGHT){
			this.y = y;
		}
		
	}
	
	public int getX(){
		
		//precondition: none
		//postcondition: the point's x value is returned
		return this.x;
		
	}
	
	public int getY(){
		
		//precondition: none
		//postcondition: the point's y value is returned
		return this.y;
		
	}
	
	public void setPoint(Point p){
		
		//precondition: The point p must not be null, and x and y must be nonnegative and within the allowed width and height, respectively.
		//postcondition: a point's x and y values are changed to match the argument's x and y values.
		if(p != null){
			if(x>= 0 && x<= GridConstants.MAX_PANEL_WIDTH){
				if(y>=0 && x<= GridConstants.MAX_PANEL_HEIGHT){	
					this.x = p.getX();
					this.y = p.getY();
				}
			}
		}
	}	
}

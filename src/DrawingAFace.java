import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class DrawingAFace extends GraphicsProgram {
	static final double HEAD_HEIGHT = 400;
	static final double HEAD_WIDTH  = 300;
	static final double MOUTH_HEIGHT = HEAD_HEIGHT * .15;
	static final double MOUTH_WIDTH = HEAD_WIDTH * .80;
	static final double EYE_RADIUS = 30;
	double X;
	double Y;
	
	//entrance point to program
	public void run() {
		
		X = (getWidth() - HEAD_WIDTH) / 2;
		Y = (getHeight()- HEAD_HEIGHT) / 2;
		face(HEAD_WIDTH, HEAD_HEIGHT, Color.gray, Color.black);
		rightEye(EYE_RADIUS, Color.yellow);
		leftEye(EYE_RADIUS, Color.yellow);
		mouth(Color.white);
		
	}
	
	private void face (double HEAD_WIDTH, double HEAD_HEIGHT, Color fillColor, Color outlineColor) {
		System.out.println(getWidth());
		System.out.println(getHeight());
	

		//create new face  This code centers the head
		GRect face = new GRect(X, Y, HEAD_WIDTH, HEAD_HEIGHT);
		
		face.setFilled(true);
		face.setFillColor(fillColor);
		face.setColor(outlineColor);
		
		add (face);
	}
	
	private void rightEye (double EYE_RADIUS, Color eyeColor) {
		double diam = EYE_RADIUS * 2;
		
		//create new eye
		GOval eye = new GOval (
				(getWidth()/2) + (HEAD_WIDTH/4) - EYE_RADIUS,
				
				((getHeight() - HEAD_HEIGHT) + EYE_RADIUS),
				
				diam, diam);
		
		eye.setFilled(true);
		eye.setColor(eyeColor);
		add(eye);
	
	}
	
	private void leftEye (double EYE_RADIUS, Color eyeColor) {
		double diam = EYE_RADIUS * 2;
		
		//create new eye
		GOval eye = new GOval (
				(getWidth()/2) -  (HEAD_WIDTH/4) - EYE_RADIUS,
				
				((getHeight() - HEAD_HEIGHT) + EYE_RADIUS),
				
				diam, diam);
		
		eye.setFilled(true);
		eye.setColor(eyeColor);
		add(eye);
	
	}
	
	private void mouth (Color color) {
		//
		GRect mouth = new GRect
				((getWidth() - MOUTH_WIDTH) /2, 
				
						
				HEAD_HEIGHT - (HEAD_HEIGHT/4) , 
				
				
				MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(color);
		add(mouth);
		
	
	}
}
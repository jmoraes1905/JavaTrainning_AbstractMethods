package javatrainning_abstractmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();
		
		System.out.println("Enter the number of shapes:");
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			System.out.printf("Enter shape # %d data:\n",(i+1));
			System.out.println("Circle or rectangle (c/r)?");
			char c = sc.next().charAt(0);
			System.out.println("Enter shape color (RED/BLUE/GREEN): ");
			//sc.next(); //consumes pending line break
			Color color = Color.valueOf(sc.next());
			if(c == 'r') {
				System.out.println("Enter rectangle width:");
				double width = sc.nextDouble();
				System.out.println("Enter rectangle height:");
				double height = sc.nextDouble();
				shapes.add(new Rectangle("Rectangle",color, width, height));
			}
			
			else if(c == 'c') {
				System.out.println("Enter circle radius:");
				double radius = sc.nextDouble();
				shapes.add(new Circle("Circle",color, radius));
			}
		}
		
		System.out.println("Sahpes:");
		for(Shape sh : shapes) {
			System.out.println("Shape: "+ sh.getName()+ "Color: "+ sh.getColor()+" " + "Area: "+ String.format("%.2f",sh.area()));
		}
	}

}

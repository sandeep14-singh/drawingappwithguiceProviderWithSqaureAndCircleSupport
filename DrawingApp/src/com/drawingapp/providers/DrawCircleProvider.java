package com.drawingapp.providers;

import javax.inject.Inject;

import com.drawingapp.annotations.CircleColorValue;
import com.drawingapp.annotations.Radius;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Provider;

public class DrawCircleProvider implements Provider<DrawCircle>{

	private String color;
	private Integer radius;
	
	@Inject
	public DrawCircleProvider(@CircleColorValue String color, @Radius Integer radius){
		this.color = color;
		this.radius = radius;
	}
	
	@Override
	public DrawCircle get() {
		DrawCircle d = new DrawCircle( color, radius);
		return d;
	}

}

package com.drawingapp.providers;

import javax.inject.Inject;

import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.SquareColorValue;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Provider;

public class DrawSquareProvider implements Provider<DrawSquare>{

	private String color;
	private Integer edge;
	
	@Inject
	public DrawSquareProvider(@SquareColorValue String color, @EdgeSize Integer edge){
		this.color = color;
		this.edge = edge;
	}
	
	@Override
	public DrawSquare get() {		
		DrawSquare d = new DrawSquare(color, edge);
		return d;
	}
}

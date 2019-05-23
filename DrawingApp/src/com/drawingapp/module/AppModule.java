package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.CircleColorValue;
import com.drawingapp.annotations.SquareColorValue;
import com.drawingapp.providers.DrawCircleProvider;
import com.drawingapp.providers.DrawSquareProvider;
import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.Radius;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;


public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(DrawShape.class).annotatedWith(Square.class).toProvider(DrawSquareProvider.class).in(Scopes.SINGLETON);
		bind(DrawShape.class).annotatedWith(Circle.class).toProvider(DrawCircleProvider.class).in(Scopes.SINGLETON);
		bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(40);
		
		bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Balck");
		bind(Integer.class).annotatedWith(Radius.class).toInstance(10);

	}
	
	
	
}

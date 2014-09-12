package com.example.app1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Conexion {
	Point puntoInicial;
	Point puntoFinal;
	
	public Conexion(Point puntoInicial, Point puntoFinal) {
		super();
		this.puntoInicial = puntoInicial;
		this.puntoFinal = puntoFinal;
	}

	public void graficar(Canvas canvas, Paint paint)
	{
		canvas.drawLine(puntoFinal.x-30, puntoFinal.y-160,
				puntoInicial.x-45, puntoInicial.y-160, paint);
	}

}

package com.example.app1;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class CapaConexiones extends View{
	private Bitmap bitmap;
	ArrayList<Conexion> conexiones = new ArrayList<Conexion>();
	Paint paint = new Paint();
	public CapaConexiones(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		this.setDrawingCacheEnabled(true);
		bitmap = this.getDrawingCache(true);
		paint.setStrokeWidth(14);
		paint.setColor(Color.parseColor(Conector.COLOR_CONEXION));
	}
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		for (Conexion conexion:conexiones)
		{
			conexion.graficar(canvas, paint);
		}
		
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		bitmap = this.getDrawingCache(true);
		int pixel = bitmap.getPixel((int)event.getX(), (int)event.getY());
		Log.v("pixel", "pixel"+pixel);
		return super.onTouchEvent(event);
	}
	public void conectar(ConectorSalida origen, ConectorEntrada destino)
	{
		this.conexiones.add(new Conexion(new Point((int)origen.globalX,(int)origen.globalY),
										 new Point((int)destino.globalX,(int)destino.globalY)));
		this.invalidate();
	}
}
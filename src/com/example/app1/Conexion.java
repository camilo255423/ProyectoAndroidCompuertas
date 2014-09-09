package com.example.app1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class Conexion extends View{
	Paint paint = new Paint();
	private Bitmap bitmap;
	public Conexion(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		paint.setColor(Color.BLACK);
		 bitmap = this.getDrawingCache(true);
		
	}
	



    @Override
    public void onDraw(Canvas canvas) {
            canvas.drawLine(0, 0, 120, 120, paint);
            canvas.drawLine(20, 0, 0, 20, paint);
            bitmap.getPixel(2, 2);
    }

}

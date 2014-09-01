package com.example.app1;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class And extends Compuerta {
public	MainActivity ma;
	public And(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater  mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.and, this, true);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generaethod stub
		
		switch(event.getAction())
		{
		case MotionEvent.ACTION_UP:
		//	ma = (MainActivity)this.getParent();
			ma.activa = null;
			
			break;
		case MotionEvent.ACTION_DOWN:
		//	ma = (MainActivity)this.getParent();
			
			ma.activa = this;
			break;
		 	
		}
		return super.onTouchEvent(event);
	}

}

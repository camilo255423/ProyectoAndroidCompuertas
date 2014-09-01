package com.example.app1;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Conector extends LinearLayout{
	TextView valor;
	public static String COLOR_UNO="#088A08";
	public static String COLOR_CERO="#B40404";
	public Conector(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater  mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.conector, this, true);
        valor = (TextView) this.findViewById(R.id.TextViewValor);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generaethod stub
		
		switch(event.getAction())
		{
		
		case MotionEvent.ACTION_DOWN:
		//	ma = (MainActivity)this.getParent();
			
			if(this.valor.getText().toString().equals("1"))
			{
				this.valor.setText("0");
				this.valor.setTextColor(Color.parseColor(COLOR_CERO));
			}
			else
			{
				this.valor.setText("1");
				this.valor.setTextColor(Color.parseColor(COLOR_UNO));
			}
			break;
		 	
		}
		return super.onTouchEvent(event);
	}


}

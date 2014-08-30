package com.example.app1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends ActionBarActivity {
	float iniY;
    float iniX;
    float iniLeft;
    float iniTop;
    
    View activa=null;
    And a1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1 = (And) this.findViewById(R.id.and1);
        a1.ma = this;
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		
		switch(event.getAction())
		{
		case MotionEvent.ACTION_MOVE:
			if(this.activa!=null)
			{	
			activa.setX(iniLeft+(event.getX()-iniX));
		    activa.setY(iniTop+(event.getY()-iniY));
			}
			Log.v("posicion","posicion"+(iniTop+(event.getY()-iniY)));
			break;
		case MotionEvent.ACTION_DOWN:
			if(this.activa!=null)
			{	
			iniY = event.getY();
			iniX = event.getX();
			iniLeft = activa.getX();
			iniTop = activa.getY();
			}
			break;
		case MotionEvent.ACTION_UP:
			if(this.activa!=null)
			{
				activa.setX(iniLeft+(event.getX()-iniX));
			    activa.setY(iniTop+(event.getY()-iniY));
				
				return false;
			}
			break;
		
		
		}
		return true;
	}

    }

package com.example.gestures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView txtGesture;
    private GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGesture = findViewById(R.id.txtGesture);
        this.gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        txtGesture.setText("Single Tap Confirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        txtGesture.setText("On Double Tap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        txtGesture.setText("On Double Tap Event");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        txtGesture.setText("On Down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        txtGesture.setText("On Show Press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        txtGesture.setText("On Single Tap Up");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        txtGesture.setText("On Scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        txtGesture.setText("On Long Press");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        txtGesture.setText("On Fling");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}

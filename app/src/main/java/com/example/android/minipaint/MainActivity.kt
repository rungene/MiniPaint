package com.example.android.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val myCanvasView =MyCanvasView(this)

        //request the full screen for the layout of myCanvasView.
      //  myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        }else{
            myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        }
        //Add a content description.
        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)

        //et the content view to myCanvasView.
        setContentView(myCanvasView)

        //You will need to know the size of the view for drawing, but you cannot get the size of
    // the view in the onCreate() method, because the size has not been determined at this point.


    }
}
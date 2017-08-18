package com.example.vadim.openglestriangle;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class OpenGLES20Activity extends Activity {

    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLView = new MyGLSurfaceView(this);
        setContentView(R.layout.activity_main);

        FrameLayout fl = (FrameLayout) findViewById(R.id.framel);

        fl.addView(mGLView);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.blueb:
                MyGLRenderer.mTriangle.color = new float[]{0f, 102f, 255f, 1.0f};
                break;

            case R.id.redb:
                MyGLRenderer.mTriangle.color = new float[]{255f, 0f, 0f, 1.0f};
                break;

            case R.id.whiteb:
                MyGLRenderer.mTriangle.color = new float[]{255f, 255f, 255f, 1.0f};
                break;
        }

    }
}

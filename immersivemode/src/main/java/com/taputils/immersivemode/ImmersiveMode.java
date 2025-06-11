package com.taputils.immersivemode;

import android.app.Activity;
import android.view.WindowManager;
import android.os.Build;
import android.view.View;

public class ImmersiveMode {

	public static void enableImmersiveMode(Activity activity) {
		View decorView = activity.getWindow().getDecorView();
		decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
				| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
				| View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

		if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.Q) {
			activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
					WindowManager.LayoutParams.FLAG_FULLSCREEN);
		}
	}
}
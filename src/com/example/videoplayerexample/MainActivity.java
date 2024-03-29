package com.example.videoplayerexample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {  

	@Override  
	protected void onCreate(Bundle savedInstanceState) {  
		super.onCreate(savedInstanceState);  
		setContentView(R.layout.activity_main);  

		VideoView videoView =(VideoView)findViewById(R.id.videoView1);  

		MediaController mediaController= new MediaController(this);  
		mediaController.setAnchorView(videoView);          

		Uri uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/BlackBerry.mp4");          

		videoView.setMediaController(mediaController);  
		videoView.setVideoURI(uri);          
		videoView.requestFocus();  
		videoView.start();  

	}  

}  
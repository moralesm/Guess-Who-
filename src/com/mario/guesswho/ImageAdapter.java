package com.mario.guesswho;

import android.content.Context;
import android.widget.*;
import android.view.*;

public class ImageAdapter extends BaseAdapter {
	private Context context;
	
	public ImageAdapter(Context c){
		context = c;
	}
	
	public int getCount(){
		return mThumbIds.length;		
	}
	
	public Object getItem(int position){
		return null;
	}
	
	public long getItemId(int position){
		return 0;
	}
	
	public View getView(int position, View convertView, ViewGroup parent){
		ImageView iv;
		if (convertView == null){
			iv = new ImageView(context);
			iv.setLayoutParams(new GridView.LayoutParams(85, 85));
			iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
			iv.setPadding(8, 8, 8, 8);
		}
		else {
			iv = (ImageView)convertView;
		}
		
		iv.setImageResource(mThumbIds[position]);
		return iv;
	}
	
	private Integer[] mThumbIds = {
			R.drawable.blonde,
			R.drawable.brunette,
			R.drawable.red_hair
	};
	
}

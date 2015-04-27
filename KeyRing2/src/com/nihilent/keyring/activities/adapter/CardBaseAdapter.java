package com.nihilent.keyring.activities.adapter;

import java.util.ArrayList;

import com.nihilent.keyring.R;
import com.nihilent.keyring.R.id;
import com.nihilent.keyring.R.layout;
import com.nihilent.keyring.activities.POJO.CardItemPOJO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CardBaseAdapter extends BaseAdapter {
	private Context context;
	private ArrayList<CardItemPOJO> cardArrayList;
	
	
		
	
	public CardBaseAdapter(Context context,ArrayList<CardItemPOJO> cardArrayList) {
		super();		
		this.context = context;
		this.cardArrayList = cardArrayList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return cardArrayList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return cardArrayList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int arg0, View v, ViewGroup arg2) {
		// TODO Auto-generated method stub
		if (v == null) {
			v = LayoutInflater.from(context).inflate(R.layout.mylist, null);
		}
		
		CardItemPOJO cardPOJO=(CardItemPOJO) getItem(arg0);
		TextView cardNameTextView=(TextView) v.findViewById(R.id.Itemname);		
		cardNameTextView.setText(cardPOJO.getCardName());
		
		ImageView frontImageTextView=(ImageView)v.findViewById(R.id.icon);
		
		return v;
	}

}

package com.nihilent.keyring.activities.POJO;

import android.graphics.Bitmap;
import android.media.Image;
import android.widget.ImageView;

public class CardItemPOJO {

	private String cardName;
	private String QR_DATA;
	private Bitmap frontImage;
	private Bitmap backImage;

	@Override
	public String toString() {
		return "CardItem [cardName=" + cardName + ", QR_DATA=" + QR_DATA
				+ ", frontImage=" + frontImage + ", backImage=" + backImage
				+ "]";
	}

	public CardItemPOJO(String cardName, String qR_DATA, Bitmap frontImage,
			Bitmap backImage) {
		super();
		this.cardName = cardName;
		this.QR_DATA = qR_DATA;
		this.frontImage = frontImage;
		this.backImage = backImage;
	}

	public CardItemPOJO( String qR_DATA,String cardName) {
		super();
		this.cardName = cardName;
		this.QR_DATA = qR_DATA;
		
		
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getQR_DATA() {
		return QR_DATA;
	}

	public void setQR_DATA(String qR_DATA) {
		QR_DATA = qR_DATA;
	}

	public Bitmap getFrontImage() {
		return frontImage;
	}

	public void setFrontImage(Bitmap frontImage) {
		this.frontImage = frontImage;
	}

	public Bitmap getBackImage() {
		return backImage;
	}

	public void setBackImage(Bitmap backImage) {
		this.backImage = backImage;
	}

}

package youtube;

import com.google.gson.annotations.SerializedName;

public class Snippet2 {
	
	@SerializedName(value="textOriginal")
	private String textDisplay = "";

	public String getTextDisplay() {
		return textDisplay;
	}

	public void setTextDisplay(String textDisplay) {
		this.textDisplay = textDisplay;
	}
	
	

}

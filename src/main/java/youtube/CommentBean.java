package youtube;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class CommentBean {
	@SerializedName(value="nextPageToken")
	private String nextPageToken = "";
	
	@SerializedName(value="items")
	private ArrayList<ItemBean> items = new ArrayList<ItemBean>();

	public ArrayList<ItemBean> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemBean> items) {
		this.items = items;
	}

	public String getNextPageToken() {
		return nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
	
	

}

package youtube;

import com.google.gson.annotations.SerializedName;

public class ItemBean {
	
	@SerializedName(value="snippet")
	private Snippet1 snippet1 = new Snippet1();
	@SerializedName(value="id")
	private String id = "";

	public Snippet1 getSnippet1() {
		return snippet1;
	}

	public void setSnippet1(Snippet1 snippet1) {
		this.snippet1 = snippet1;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}

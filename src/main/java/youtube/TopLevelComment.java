package youtube;

import com.google.gson.annotations.SerializedName;

public class TopLevelComment {
	
	@SerializedName(value="snippet")
	private Snippet2 snippet2 = new Snippet2();

	public Snippet2 getSnippet2() {
		return snippet2;
	}

	public void setSnippet2(Snippet2 snippet2) {
		this.snippet2 = snippet2;
	}

}

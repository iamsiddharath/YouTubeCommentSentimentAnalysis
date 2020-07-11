package youtube;

import com.google.gson.annotations.SerializedName;

public class Snippet1 {
	
	@SerializedName(value="topLevelComment")
	private TopLevelComment topLevelComment = new TopLevelComment();

	public TopLevelComment getTopLevelComment() {
		return topLevelComment;
	}

	public void setTopLevelComment(TopLevelComment topLevelComment) {
		this.topLevelComment = topLevelComment;
	}	
	
	

}

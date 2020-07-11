package youtube;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

import nlp.SentimentAPI;

public class YouTubeAPI {
	static int positive = 0;
	static int negative = 0;
	static int neutral = 0;
	static String videoId = "";
	static String youtubeApiKey = "";
	
	public static void getSentimentAnalysis(String vidId, String ytApiKey) {
		String nextPageToken = "";
		try {
		videoId = vidId;
		youtubeApiKey = ytApiKey;
		while(true) {
			String baseUrl = "";
			if(nextPageToken.equals("")) {
				baseUrl = "https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&videoId="+videoId+"&maxResults=100&key="+youtubeApiKey;
			}else {
				baseUrl = "https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&videoId="+videoId+"&maxResults=100&pageToken="+nextPageToken+"&key="+youtubeApiKey;
				
			}
			URL url = new URL(baseUrl);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			
			InputStream content = connection.getInputStream();
			String resString = "";
			BufferedReader in = new BufferedReader(new InputStreamReader(content));
			Stream<String> string = in.lines();

			Iterator<String> itr = string.iterator();
			
			while(itr.hasNext()) {
				resString = resString+itr.next();
				}
			System.out.println(resString);
			Gson gson = new Gson();
			
			CommentBean commentBean = gson.fromJson(resString, CommentBean.class);
			
			ArrayList<ItemBean> itemList = commentBean.getItems();
			nextPageToken = commentBean.getNextPageToken();
			for(ItemBean itemBean: itemList) {
				
				SentimentAPI s = new SentimentAPI();
				ArrayList<String>lis = s.getSentiment(itemBean.getSnippet1().getTopLevelComment().getSnippet2().getTextDisplay());
				for(String c: lis) {
					if(c.contains("ositive")) {
						positive++;
					}else if(c.contains("egative")) {
						negative++;
					}else {
						neutral++;
					}
				}
			}

			if(nextPageToken.equals("")) {
				break;
			}
				
		}
		int total = positive+negative+neutral;
		double positivePercentage = ((double)positive/(double)total)*100d;
		System.out.println(positivePercentage+"% Positive");
		double negativePercentage = ((double)negative/(double)total)*100;
		System.out.println(negativePercentage+"% Negative");
		double neutralPercentage = ((double)neutral/(double)total)*100;
		System.out.println(neutralPercentage+"% neutral");
		System.out.println("Positive" + positive);
		System.out.println("Negative" + negative);
		System.out.println("Neutral" + neutral);
	
		
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
				
	}

}

package nlp;

import java.util.ArrayList;
import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentimentAPI {
	
		
	public ArrayList<String> getSentiment(String str) {
		ArrayList<String> sentList = new ArrayList<String>();
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		CoreDocument coreDocument = new CoreDocument(str);
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreSentence> sentenceList = coreDocument.sentences();
		
		for(CoreSentence sentense: sentenceList) {
			sentList.add(sentense.sentiment());
		}
		
		return sentList;
	}

}

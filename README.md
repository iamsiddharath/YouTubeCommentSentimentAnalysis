# YouTubeCommentSentimentAnalysis
This project using Stanford NLP to do the sentiment analysis of Youtube Video comments. Build using core Java.

Note : API only supports English language Comments.

_________________________________________________________________________________________________________________________________________________________________________________

Sentiment Analysis : It refers to the use of natural language processing, and text analysis to systematically identify, extract, quantify, and study affective states and subjective information. In our case this tool helps us to do the sentiment analysis in form of Postive, Negative, Neutral emotion of text.

Stanford NLP : The Natural Language Processing Group at Stanford University is a team of faculty, postdocs, programmers and students who work together on algorithms that allow computers to process and understand human languages. Our work ranges from basic research in computational linguistics to key applications in human language technology, and covers areas such as sentence understanding, automatic question answering, machine translation, syntactic parsing and tagging, sentiment analysis, and models of text and visual scenes, as well as applications of natural language processing to the digital humanities and computational social sciences.

_________________________________________________________________________________________________________________________________________________________________________________

YouTube Comment fetching API : Returns a list of comment threads that match the API request parameters.
                                HTTP Request :
                                GET https://www.googleapis.com/youtube/v3/commentThreads
                                
                                Visit (for YouTube API detailed Info) : https://developers.google.com/youtube/v3/docs/commentThreads/
                                
                                Visit ( for YouTube API creation ) https://console.developers.google.com/apis/credentials
                                

_________________________________________________________________________________________________________________________________________________________________________________

Maven Dependencies :
                      <dependencies>
                   

                         <!-- https://mvnrepository.com/artifact/edu.stanford.nlp/stanford-corenlp -->
                          <dependency>
                            <groupId>edu.stanford.nlp</groupId>
                            <artifactId>stanford-corenlp</artifactId>
                            <version>3.9.2</version>
                          </dependency>
                          <!-- https://mvnrepository.com/artifact/edu.stanford.nlp/stanford-corenlp -->
                          <dependency>
                            <groupId>edu.stanford.nlp</groupId>
                            <artifactId>stanford-corenlp</artifactId>
                            <version>3.9.2</version>
                            <classifier>models</classifier>
                          </dependency>
                          <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
                          <dependency>
                            <groupId>com.google.code.gson</groupId>
                            <artifactId>gson</artifactId>
                            <version>2.8.5</version>
                          </dependency>
                          
                          <dependency>
                            <groupId>org.slf4j</groupId>
                            <artifactId>slf4j-simple</artifactId>
                            <version>1.7.21</version>
                          </dependency>
                        </dependencies>

_________________________________________________________________________________________________________________________________________________________________________________


How to get Youtube Video Id : Got To Youtube -> Select a Video -> Copy the URL from browser 
                              YouTube Video Id is present in the URL itself
                              https://www.youtube.com/watch?v=< YouTube Video Id>

_________________________________________________________________________________________________________________________________________________________________________________

Use the above information and the Output will be as shown below.

                              23.579545454545457% Positive
                              31.676136363636363% Negative
                              44.74431818181818% neutral

*************************************************************************** END ****************************************************************************
                                

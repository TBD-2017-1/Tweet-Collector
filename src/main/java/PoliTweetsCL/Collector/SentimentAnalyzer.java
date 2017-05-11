package PoliTweetsCL.Collector;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;
import edu.stanford.nlp.util.PropertiesUtils;

import java.util.Properties;

public class SentimentAnalyzer {

    private StanfordCoreNLP pipeline;

    public SentimentAnalyzer(){
        Properties props = PropertiesUtils.asProperties("props", "edu.stanford.nlp.pipeline.StanfordCoreNLP-spanish.properties");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
    }

    public int findSentiment(String text) {
        int mainSentiment = 0;
        if (text != null && text.length() > 0) {
            int longest = 0;
            Annotation annotation = pipeline.process(text);

            annotation.toString();
            /*
            for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
                Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
                int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
                String partText = sentence.toString();
                if (partText.length() > longest) {
                    mainSentiment = sentiment;
                    longest = partText.length();
                }

            }*/
        }
        return 1;
    }
}
package algorithm.easy;import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.Map;public class UncommonWords {    public String[] uncommonFromSentences(String A, String B) {        String[] wordsA = A.split(" ");        String[] wordsB = B.split(" ");        HashMap<String, Integer> words = new HashMap<>();        for (String w : wordsA) {            words.put(w, (words.containsKey(w)?words.get(w):0) + 1);        }        for (String w : wordsB) {            words.put(w, (words.containsKey(w)?words.get(w):0) + 1);        }        List<String> res = new ArrayList<>();        for(Map.Entry<String, Integer> entry: words.entrySet()){            if(entry.getValue() == 1)                res.add(entry.getKey());        }        return res.toArray(new String[res.size()]);    }}
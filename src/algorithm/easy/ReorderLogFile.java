package algorithm.easy;import java.util.ArrayList;import java.util.Comparator;import java.util.List;public class ReorderLogFile {    public String[] reorderLogFiles(String[] logs) {        List<String> letter = new ArrayList<>();        List<String> digits = new ArrayList<>();        int index = 0;        for (String log : logs) {            index = log.indexOf(' ');            if (digit(log.charAt(index + 1))) digits.add(log);            else letter.add(log);        }        letter.sort(new Comparator<String>() {            @Override            public int compare(String o1, String o2) {                int index1 = o1.indexOf(' ');                int index2 = o2.indexOf(' ');                return o1.substring(index1).compareTo(o2.substring(index2));            }        });        letter.addAll(digits);        return letter.toArray(new String[letter.size()]);    }    private boolean digit(char c) {        return '0' <= c && c <= '9';    }}
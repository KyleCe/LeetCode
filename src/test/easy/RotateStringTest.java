package test.easy;import org.junit.Assert;import org.junit.Test;import algorithm.easy.MostCommonWord;public class MostCommonWordTest {    @Test    public void mostCommonWord() {        String s = "Bob hit a ball \\n the hit BALL flew far after it was hit.";        String[] ban = new String[]{"hit"};        Assert.assertEquals("ball", new MostCommonWord().mostCommonWord(s, ban));    }}
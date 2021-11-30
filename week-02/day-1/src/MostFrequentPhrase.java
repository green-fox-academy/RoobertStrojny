import java.util.*;
import java.lang.String;

public class MostFrequentPhrase {
    public static void main(String[] args) {
        HashMap<String, Integer> mapForWords = new HashMap<>();

        String randomString;
        randomString = "But then they were married (she felt awful about being pregnant before but\n" +
        "Harry had been talking about marriage for a while and anyway laughed when\n" +
        "she told him in early February about missing her period and said Great she\n" +
        "was terribly frightened and he said Great and lifted her put his arms around\n" +
        "under her bottom and lifted her like you would a child he could be so\n" +
        "wonderful when you didn’t expect it in a way it seemed important that you\n" +
        "didn’t expect it there was so much nice in him she couldn’t explain to\n" +
        "anybody she had been so frightened about being pregnant and he made her\n" +
        "be proud) they were married after her missing her second period in March\n" +
        "and she was still little clumsy dark-complected Janice Springer and her\n" +
        "husband was a conceited lunk who wasn’t good for anything in the world Daddy\n" +
        "said and the feeling of being alone would melt a little with a little drink.\n";
        System.out.println(mostFrequentWord(randomString));

    }

    private static String mostFrequentWord(String randomString) {
        HashMap<String, Integer> stringMap = new HashMap<>(30, 0.75f);
        String[] words = randomString.split("\\W+");
        for (int i = 0; i < words.length; i++) {
            if (stringMap.containsKey(words[i])){
                stringMap.put(words[i], stringMap.get(words[i]) + 1);
            }else{
                stringMap.put(words[i], 1);
            }
        }

        Set<Map.Entry<String, Integer> > set = stringMap.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }
        return key;
    }

}




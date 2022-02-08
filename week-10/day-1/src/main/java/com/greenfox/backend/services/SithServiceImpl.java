package com.greenfox.backend.services;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class SithServiceImpl implements SithService{

    @Override
    public JSONObject getSithText(String text) {
        JSONObject reverser = new JSONObject();

        StringBuilder sb = new StringBuilder();
        List<String> sentence = Arrays.stream(text.split("\\. ")).collect(Collectors.toList());

        for (String s : sentence) {
            List<String> words = Arrays.stream(s.split(" ")).collect(Collectors.toList());

            if (words.size() % 2 == 0) {
                sb.append(makeSentenceSith(words.size(), words));
                sb.append(".".concat(getRandomThings()));
            } else {
                sb.append(makeSentenceSith(words.size(), words));
                sb.append(words.get(words.size() - 1).concat(".").concat(getRandomThings()));
            }
        }

        reverser.put("sith_text", sb.toString());
        return reverser;
    }

    public String makeSentenceSith(int size, List<String> words) {
        StringBuilder sb = new StringBuilder();
        int index = 1;
        for (int j = 0; j < size / 2; j++) {
            if (index == 1) {
                sb.append(words.get(index).toUpperCase(Locale.ROOT).charAt(0));
                sb.append(words.get(index).substring(1).concat(" "));
                sb.append(words.get(0).toLowerCase(Locale.ROOT).concat(" "));
            } else {
                sb.append(words.get(index).concat(" "));
                sb.append(words.get(index - 1).concat(" "));
            }
            index += 2;
        }

        return sb.toString();
    }

    @Override
    public String getRandomThings() {
        List<String> randomThings = Arrays.asList(" Hrrrm. ", " Arrgh. Uhmm. ",  " Err..err.err. ", " Yrsssss. ");
        Random random = new Random();
        return randomThings.get(random.nextInt(3));
    }
}

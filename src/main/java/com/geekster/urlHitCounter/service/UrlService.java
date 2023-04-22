package com.geekster.urlHitCounter.service;

import com.geekster.urlHitCounter.model.UrlData;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {
    static Map<String, Integer> hmap = new HashMap<>();
    public UrlData getHit(String username) {
        int count = 1;
        if (hmap.containsKey(username)) {
            count = hmap.get(username);
            hmap.put(username, ++count);
        }else{
            hmap.put(username, count);
        }
        UrlData hit = new UrlData(username, count);
        return hit;
    }
}

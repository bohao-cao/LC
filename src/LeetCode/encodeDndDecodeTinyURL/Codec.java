package LeetCode.encodeDndDecodeTinyURL;
import Common.ListNode;

import java.util.HashMap;
import java.util.Random;

/*
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns
a short URL such as http://tinyurl.com/4e9iAk.
Design the encode and decode methods for the TinyURL service.
There is no restriction on how your encode/decode algorithm should work.
You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
*/
public class Codec {

    private final String alphabet = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private HashMap<String, String> urls = new HashMap<>(); //key-shortUrl, value-longUrl
    private Random random = new Random();

    private String getKey(String longUrl){
        String key = "";
        do{
            for(int i =0;i< 6;i++){
                    key += alphabet.charAt(random.nextInt(alphabet.length()));
            }
        }while(urls.containsKey(key));

        return key;
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = getKey(longUrl);
        urls.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if(urls.containsKey(shortUrl)){
            String longUrl = urls.get(shortUrl);
            urls.remove(shortUrl);
            return longUrl;
        }
        return "";


    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

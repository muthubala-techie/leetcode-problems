/**
*   question : 535. Encode and Decode TinyURL
*/


import java.util.*;
public class EncodeDecode{
    private static final String BASE_URL = "http://tinyurl.com/";
    private Map<String, String> urlMap = new HashMap<>();
    private Map<String, String> reverseMap = new HashMap<>();
    private Random random = new Random();

    public String encode(String longUrl) {
        if (reverseMap.containsKey(longUrl)) {
            return reverseMap.get(longUrl);
        }
        String shortKey;
        do {
            shortKey = generateKey();
        } while (urlMap.containsKey(shortKey));

        String shortUrl = BASE_URL + shortKey;
        urlMap.put(shortKey, longUrl);
        reverseMap.put(longUrl, shortUrl);
        return shortUrl;
    }

    public String decode(String shortUrl) {
        String shortKey = shortUrl.replace(BASE_URL, "");
        return urlMap.getOrDefault(shortKey, "");
    }
    public String generateKey() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            key.append(chars.charAt(random.nextInt(chars.length())));
        }
        return key.toString();
    }
    public static void main(String[] args) {
        EncodeDecode tinyURL = new EncodeDecode();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = tinyURL.encode(longUrl);
        System.out.println("Encoded: " + shortUrl);
        System.out.println("Decoded: " + tinyURL.decode(shortUrl));
    }
}
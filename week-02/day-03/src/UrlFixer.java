public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String url2 = url;

        url = url.replace("https", "https:");
        url = url.replace("nevertellmethebots", "nevertellmetheodds");
        System.out.println(url);

        url2 = url2.substring(0, 5) + ":" + url2.substring(url2.indexOf("//"),url2.indexOf("bots")) + "odds";
        System.out.println(url2);
    }
}
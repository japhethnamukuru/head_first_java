package demo;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {
            "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart",
            "six-sigma", "critical-path", "dynamic"
        };
        String[] wordListTwo = {
            "empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded",
            "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared",
            "cooperative", "accelarated"
        };
        String[] wordListThree = {
            "process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare",
            "portal", "space", "vision", "paradigm", "mission"
        };

        //get length of each string
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //create random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        // print out the phrase
        System.out.println("What we need is a " + phrase);

    }
}

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed"};
        int oneLength = wordListOne.length;

        java.util.Random  randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        String phrase = wordListOne[rand1];
        System.out.println("What we need is a " + phrase);
    }
}

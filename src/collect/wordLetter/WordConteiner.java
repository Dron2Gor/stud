package collect.wordLetter;

public class WordConteiner {
    String word;
    Integer count;

    public WordConteiner(String word, int count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public String toString() {
        return
                "{word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}

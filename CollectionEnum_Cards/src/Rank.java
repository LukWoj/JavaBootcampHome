public enum Rank {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACH("J"), QUEEN("Q"), KING("K"), A("ACE");

    private String rank;

    Rank(String rankDescription) {
        rank = rankDescription;
    }

    Rank(int rankValue) {
        this.rank = String.valueOf(rankValue);
    }
}

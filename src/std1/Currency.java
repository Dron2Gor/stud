package std1;

public class Currency {
    Money money;

    public Currency(Money money) {
        this.money = money;
    }

    public void discribe() {
        switch (money) {
            case DOLLAR:
                System.out.println(money + "- American "+ money.ordinal());
                break;
            case EURO:
                System.out.println(money+ " - European "+ money.ordinal());
                break;
            case POUND:
                System.out.println(money+ " English "+ money.ordinal());
                break;
            case RUBL:
                System.out.println(money+ " Russian "+ money.ordinal());
                break;
            case FRANK:
            case MARKA:
                System.out.println(money+ " Old European "+ money.ordinal());
        }
    }

    public static void main(String[] args) {
        for (Money money : Money.values()) {
            new Currency(money).discribe();
        }
    }
}

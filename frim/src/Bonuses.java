
public class Bonuses extends Sales {
    private String bonus;
    Bonuses() {
        super();
        bonus = "Бонус не предоставляется";
    }

    String BonusAward(String posAbb) {

        String aPosition = pos(posAbb);

        if (aPosition.equals("Супервайзер")) {
            this.bonus = "Бонус 100$";
        }
        else if (aPosition.equals("Директор филиала")) {
            this.bonus = "Бонус 200$";
        }
        else {
            this.bonus = "Бонус не предоставляется";
        }

        return this.bonus;
    }
}

public class BonusMilesService {
    public int calculate(int cost) {
        int amountToGetOneMile = 20;
        int miles = cost / amountToGetOneMile;
        return miles;
    }
}

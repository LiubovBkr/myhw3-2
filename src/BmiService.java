public class BmiService {
    public int calculate(double weightkg, double heightm) {
        return (int) (weightkg / (heightm * heightm));
    }
}

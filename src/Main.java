public class Main {
    public static void main(String[] args) {
       BmiService service = new BmiService();
       int person = service.calculate(58, 1.7);
       System.out.println(person);

    }
}
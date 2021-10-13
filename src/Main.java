public class Main {
private static final String[] number1 = new String[]{"0987654321","0987654671"};
private static final String[] number2 =new String[]{"9087654321","2287654671"};

    public static void main(String[] args) {
NumberPhone numberPhone = new NumberPhone();
        for (String numb: number1
             ) {
            boolean isvalid =numberPhone.validate(numb);
            System.out.println(numb + " "+isvalid);
        }
        for (String numb: number2
             ) {
            boolean isvalid2 = numberPhone.validate(numb);
            System.out.println(numb + " "+isvalid2);
        }
    }
}

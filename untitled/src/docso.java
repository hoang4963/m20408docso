import java.util.Scanner;
public class docso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap so :");
        int number = scanner.nextInt();
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";
        String ty = "ty";

        if (number < 0 && number > 29) {
            System.out.println(" khong biet doc");
        }
        else if (number <= 13){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println(one);
                    break;
                case 2:
                    System.out.println(two);
                    break;
                case 3:
                    System.out.println(three);
                    break;
                case 4:
                    System.out.println(four);
                    break;
                case 5:
                    System.out.println(five);
                    break;
                case 6:
                    System.out.println(six);
                    break;
                case 7:
                    System.out.println(seven);
                    break;
                case 8:
                    System.out.println(eight);
                    break;
                case 9:
                    System.out.println(nine);
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println(" eleven ");
                    break;
                case 12:
                    System.out.println(" twelve ");
                    break;
                case 13:
                    System.out.println(" thirty ");
                    break;

            }
        }
        else if (number < 20){
            String teen = "teen";
            int daumot = number - 10;
            switch (daumot) {
                case 4:
                    System.out.println("four"+teen);
                    break;
                case 5:
                    System.out.println("five"+teen);
                    break;
                case 6:
                    System.out.println("six"+teen);
                    break;
                case 7:
                    System.out.println("seven"+teen);
                    break;
                case 8:
                    System.out.println("eight"+teen);
                    break;
                case 9:
                    System.out.println("nine"+teen);
                    break;
            }
        }
        else if (number < 30){
            int dauhai = number - 20;
            String haimuoi = "twenty";
            switch (dauhai){
                case 0:
                    System.out.println(haimuoi);
                    break;
                case 1:
                    System.out.println(haimuoi + one);
                    break;
                case 2:
                    System.out.println(haimuoi +two);
                    break;
                case 3:
                    System.out.println(haimuoi +three);
                    break;
                case 4:
                    System.out.println(haimuoi +four);
                    break;
                case 5:
                    System.out.println(haimuoi +five);
                    break;
                case 6:
                    System.out.println(haimuoi +six);
                    break;
                case 7:
                    System.out.println(haimuoi +seven);
                    break;
                case 8:
                    System.out.println(haimuoi +eight);
                    break;
                case 9:
                    System.out.println(haimuoi +nine);
                    break;
            }
        }
    }
}

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Please enter the circle (cm).");


// lấy dữ liệ đầu vào và đặt pi = 3.14
        double radius  = scanner.nextInt();
        double mathPI = 3.14;
// chu vi hình tròn        
        double area = mathPI * radius * radius;
System.out.println("Area of the circle:  = " + area + " cm");
//Diện tích hình tròn
        double circumference = 2 * mathPI * radius;
System.out.println("Circumference of the circle = " + circumference + " cm²");
    }
}
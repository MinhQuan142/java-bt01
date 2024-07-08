import java.util.Scanner;

public class chuvi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Please enter the side of the square (cm).");



        int length = scanner.nextInt();
int perimeter = length * 4;
System.out.println("Perimeter = " + perimeter + " cm");
int acreage = length * length;
        
System.out.println("Acreage = " + acreage + " cm²");
    }
}
import java.util.Scanner;

public class mediumScore {
    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
// điểm toán
        System.out.println("Please enter the Math scores");
        int math = scanner.nextInt();
// Điểm Văn
        System.out.println("Please enter the Literature scores");
        int literature = scanner.nextInt();
//điểm tiếng Anh
        System.out.println("Please enter the English scores");
        int english = scanner.nextInt();
       
// Tổng điểm 3 môn
        int totalScore = math + literature + english;
System.out.println("Total Score = " + totalScore + " Score");
// điểm trung bình 3 môn
int mediumScore = totalScore / 3;      
System.out.println("Medium Score = " + mediumScore + " Score");
    }
}
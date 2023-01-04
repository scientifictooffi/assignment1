import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone Iphone = new Phone(11,"Iphone", 500);
        Phone Oppo = new Phone(5, "Oppo", 450);

        LReaders Erlan = new LReaders("Erlan", 37, "SE", "07.12.04","87006511043");
        Book[] Fantasy = new Book[2];
        Fantasy[0] = new Book("Young", "Man");
        Fantasy[1] = new Book("Hunter", "Hunter");
        Erlan.returnBook(3);
        String [] fantasy = {"Eliza", "scientix", "gameover"};
        Erlan.returnBook(fantasy);
        Erlan.takeBook(Fantasy);
        Matrix matrix1 = new Matrix(3,4);
        Matrix matrix2 = new Matrix(3,4);
        matrix1.print();
        System.out.println();
        matrix1.add(matrix2);


    }
}
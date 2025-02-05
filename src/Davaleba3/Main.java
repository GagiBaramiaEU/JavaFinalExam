package Davaleba3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ სამნიშნა რიცხვი: ");

        try {
            int number = scanner.nextInt();
            if(number < 100  && number > 999 || number > -100 && number < -999){
                throw new IllegalArgumentException("თავიდან სცადე ბინძურო, არარის სამნიშნა იმბეცილო!");
            }

            int aseuli = number/100;
            System.out.println("aseuli "+aseuli);

            int ateuli = (number/10)%10;
            if(ateuli<0){
                ateuli = Math.abs(ateuli);
            }
            System.out.println("ateuli "+ateuli);

            int erteuli = number%10;
            if(erteuli<0){
                erteuli = Math.abs(erteuli);
            }
            System.out.println("erteuli "+erteuli);

            int digitSum = aseuli + ateuli + erteuli;

            if(digitSum == 0){
                throw new ArithmeticException("ნულზე გაყოფა არ შეიძლება");
            }

            System.out.println(number / digitSum);

        } catch (IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        }catch (ArithmeticException e){
            System.out.printf(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}

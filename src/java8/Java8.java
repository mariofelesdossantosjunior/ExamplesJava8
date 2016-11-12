/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 * @author Mario Feles dos Santos Junior
 * @email mario_feles@live.com
 * @since 11/11/2016
 * @project java8
 */
public class Java8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExempleOne();
        exempleTwo();
    }

    private static void ExempleOne() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Not Lambda");
            }
        };
        r.run();

        Runnable r2 = () -> System.out.println("Yes Lambda");
        r2.run();
    }

    private static void exempleTwo() {
        ValorNumeric numeric = new ValorNumeric() {
            @Override
            public boolean teste(int num) {
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is pair");
                    return true;
                } else {
                    System.out.println("The number " + num + " is odd");
                    return false;
                }
            }
        };
        numeric.teste(22);

        ValorNumeric isPar = (num) -> (num % 2) == 0;
        System.out.println("Result: " + isPar.teste(20));

        ValorNumeric isImpar = (num) -> (num % 2) != 0;
        System.out.println("Result: " + isImpar.teste(3));
    }

}

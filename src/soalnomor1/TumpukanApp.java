
package soalnomor1;

import java.util.Scanner;

public class TumpukanApp {
   public static void main (String [] args){
    Tumpukan tumpukan=new Tumpukan(10);
    tumpukan.push(5);
    tumpukan.baca();
    tumpukan.push(30);
    tumpukan.baca();
    System.out.println("nilai teratas = "+tumpukan.peek());
    System.out.println("Nama saya adalah Nabila Asshafa Putri");
    System.out.println("nilai yang dihapus = "+ tumpukan.pop());
    tumpukan.baca();
    System.out.println();
    tumpukan.push(40);
    tumpukan.baca();
    tumpukan.push(50);
    tumpukan.baca();
}    
}

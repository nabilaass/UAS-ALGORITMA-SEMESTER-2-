
package soalnomor2;

public class AntriaApp {
        public static void main(String[]args){
        Antrian antrian = new Antrian(10);
        antrian.enqueue(5); //memasukkan data kedalam antrian
        antrian.display(); //menampilkan data antrian
        antrian.enqueue(60); 
        antrian.display();
        System.out.println("nilai yang paling depan = "+antrian.peek());
        System.out.println("Nama saya adalah Nabila Asshafa Putri");
        System.out.println();
        antrian.enqueue(70); 
        antrian.display();
        System.out.println("yang diambil dari antrian = "+antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = "+antrian.peek());

    }  
}

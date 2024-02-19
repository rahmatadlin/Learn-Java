// class Pesawat{
//     private int kecepatan, panjang;
//     public Pesawat(int kecepatan, int panjang){
//         this.kecepatan = kecepatan;
//         this.panjang = panjang;
//     }

//     public int jarak(int detik){
//         return detik * this.kecepatan;
//     }

//     public void setKecepatan(int kecepatan){
//         this.kecepatan = kecepatan;
//     }

//     public void panjang(){
//         System.out.println(this.panjang);
//     }
// }

public class App {

    // public static void main(String[] args) {
    //     Pesawat boeing = new Pesawat(500, 100);
    //     boeing.setKecepatan(100);
    //     System.out.println(boeing.jarak(5));
    // }

      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        if(first.charAt(0) == 'A'){
            System.out.print("A ");
            if(first.chart(1) == 'B'){
            System.out.print("B");
            }
        } else if(first.chartAt(0) == 'B'){
            System.out.print("B ");
            if(first.chartAt(1) =='C'){
                System.out.print("C");
            }
        } else if(first == 'AB'){
            System.out.print("AB");
        } else {
            System.out.print("-");
        }
        scan.close();
    }
}
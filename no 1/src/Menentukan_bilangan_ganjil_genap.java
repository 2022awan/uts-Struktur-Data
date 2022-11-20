public class Menentukan_bilangan_ganjil_genap {
    public static void main(String[] args) {
        int[] bil = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("PROGRAM MENENTUKAN BILANGAN HANJIL & GENAP");
        System.out.println("-------------------------------------------------");

        System.out.println("Bilangan Genap  : ");
        for (int i = 0; i < bil.length; i++){
            if(bil [i] % 2 == 0){
                System.out.println(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Bilangan Ganjil : ");
        for(int i = 0; i < bil.length; i++){
            if(bil [i] % 2 != 0){
                System.out.println(bil[i] + " ");
            }
        }
    }
}
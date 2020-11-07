package hukum_ohm;

public class PBO10K10119909Latihan44 {

    public static void main(String[] args) {
        Baterai hukum = new Baterai();
        Baterai energizer = new Baterai(3,12);


        System.out.println("Kuat Arus\t\t: "+energizer.getKuatArus());
        System.out.println("Hambatan\t\t: "+energizer.getHambatan());
        System.out.println("Hasil Tegangan\t: "+energizer.hitunTegangan());
    }
}

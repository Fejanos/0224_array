/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombok_listak;

/**
 *
 * @author János
 */
public class Tombok_Listak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 2;
        int b = 3;
        
        // Tömb 1D
        // lineáris: ([1][2][3][4]....)
        // Fix méretűek, mérete nem változtatható a futás során
        // Indexelés
        /*
            [10 3 5 7 9] => 5 elemű
             0. 1 2 3 4  => elemszám -1
             5. index --> hiba
        */
        
        // Tömb létrehozása
        // típus[] neve = new tipus[maxelemszám];
        int[] szamok = new int[2]; // 2 elemű tömb
        // ilyenkor 0-kat tartalmaz
        
        // tomb[index] - ez egy érték
        szamok[0] = a; // tömb első eleme = az 'a' értékben lévő elem
        szamok[1] = b; // tömb második eleme
        //szamok[2] = 4; // ez egy hibás sor, mivel csak 2 elemű!
        
        // %d - egész érték helymegörző
        // \n - sortörés
        System.out.printf("számok[0] = %d\n", szamok[0]);
        System.out.printf("számok[1] = %d\n", szamok[1]);
        
        // tömb elemszáma, hossza
        int hossz = szamok.length;
        System.out.println("A számok tömb hossza: " + hossz);
        
        /*
        float[]
        int[]
        String[]
        double[]
        char[]
        object[]
        bool[]
        */
        
        String szo = "almafa";
        // szo[3] = a
        char[] szo_bontva = new char[6];
        szo_bontva = szo.toCharArray();
        
        /*
        Hozzon létre egy három egész számot tároló tömböt, 
        majd számítsa ki az összegüket és írja ki az eredményt!
        */
        // Létrehozás
        int[] t = new int[3];
        t[0] = 3;
        t[1] = 2;
        t[2] = 9;
        int eredmeny = t[0] + t[1] + t[2];
        System.out.println("Összeg: " + eredmeny);
        
        // String tömb
        String[] szavak = new String[3];
        szavak[0] = "alma";
        szavak[1] = "körte";
        szavak[2] = "eper";
        
        String[] szavak2 = {"alma", "körte", "eper"}; // 3 elemű
    }
    
}

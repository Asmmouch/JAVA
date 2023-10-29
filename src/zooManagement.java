import java.util.Scanner;
public class zooManagement {
    int nbCages=20;
    String zooName="ZooManagement";
    public static void main(String[]args){
        //instruction 1
           zooManagement zm = new zooManagement();
        System.out.println("le zoo " + zm.zooName + " contient " + zm.nbCages + " cages");

        //instruction 2
        Scanner sc = new Scanner(System.in);
        System.out.println("ecrire le nombre:");
        int nbCages = sc.nextInt();
        System.out.println("ecrire le nom");
        sc.nextLine();
        String nomZoo  = sc.nextLine();
        System.out.println( nomZoo + " contient " + nbCages + " cages");
    }
}


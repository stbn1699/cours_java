import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.print("\nVeuillez saisir le nombre a sommer : ");
        int nombreSommer = saisieUtilisateur.nextInt();
        System.out.println(" ");
        int somme = 0;

        for(int i = 1; i != nombreSommer + 1 ; i++){
            somme = somme + i;
        }

        System.out.println("\tla somme de " + nombreSommer + " est égale à : " + somme);

    }
}
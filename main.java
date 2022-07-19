import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner saisieUtilisateur = new Scanner(System.in);

        System.out.print("Veuillez saisir la taille de la base de la pyramide : ");
        int base = saisieUtilisateur.nextInt();
        System.out.println(" ");

        int taille = 1;
        while(base != 0){
            for(int i = 0; i < taille; i++){
                System.out.print("*");
            }
            System.out.println(" ");
            taille++;
            base--;
        }

    }
}
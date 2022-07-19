import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner saisieUtilisateur = new Scanner(System.in);

        int nombreAleatoire = (int)(Math.random() * 100);
        int nEssais = 10;

        System.out.println("\nnombre aléatoire généré!");

        boolean trouve = false;
        boolean perdu = false;

        while(!trouve && !perdu){
            System.out.print("il vous reste " + nEssais + " essais, veuillez entrer un nombre : ");
            int guess = saisieUtilisateur.nextInt();

            if(guess == nombreAleatoire){
                trouve = true;
            } else if (guess < nombreAleatoire) {
                System.out.println("\tvotre nombre est plus petit\n");
            } else if (guess > nombreAleatoire) {
                System.out.println("\tvotre nombre est plus grand\n");
            }

            if(nEssais == 0){
                perdu = true;
            }

            nEssais--;

        }

        if(trouve){
            System.out.print("\n\tVous avez trouvé " + nombreAleatoire + " en " + (10 - nEssais) + " essais\n");
        }else if (perdu){
            System.out.print("\tVous avez perdu, le nombre était " + nombreAleatoire + "\n");
        }

    }
}
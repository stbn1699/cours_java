import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner saisieUtilisateur = new Scanner(System.in);

        /* génération du nombre aléatoire */
        int nombreAleatoire = (int)(Math.random() * 100);
        int nEssais = 10;

        System.out.println("\nnombre aléatoire généré!");

        boolean trouve = false;
        boolean perdu = false;

        while(!trouve && !perdu){

            /* demande a l'utilisateur d'entrer un nombre */
            System.out.print("il vous reste " + nEssais + " essais, veuillez entrer un nombre : ");
            int guess = saisieUtilisateur.nextInt();

            /* regarde si le nombre est juste, trop haut ou trop bas */
            if(guess == nombreAleatoire){
                trouve = true;
            } else if (guess < nombreAleatoire) {
                System.out.println("\tvotre nombre est plus petit\n");
            } else if (guess > nombreAleatoire) {
                System.out.println("\tvotre nombre est plus grand\n");
            }

            /* regarde s'il reste des essais a l'utilisateur */
            if(nEssais == 0){
                perdu = true;
            }

            nEssais--;

        }

        /* affiche la fin en fonction de si l'utilisateur a trouvé ou q'il n'a plus d'essais */
        if(trouve){
            System.out.print("\n\tVous avez trouvé " + nombreAleatoire + " en " + (10 - nEssais) + " essais\n");
        }else if (perdu){
            System.out.print("\tVous avez perdu, le nombre était " + nombreAleatoire + "\n");
        }

    }
}
class HelloWorld {
    public static void main(String[] args) {

        String exemple = "bonjour";
        int taille = exemple.length();

        for(int i = 0; i < taille; i++){

            int numero = i + 1;

            System.out.println(exemple + numero);

        }

    }
}
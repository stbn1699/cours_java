class HelloWorld {
    public static void main(String[] args) {

        /* création et affichage du mot avant retournement */
        String exemple = "bonjour";
        System.out.println(exemple);

        /* retournement et affichage du mot                */
        StringBuilder Reverse = new StringBuilder(exemple);
        exemple = Reverse.reverse().toString();
        System.out.println(exemple);

    }
}
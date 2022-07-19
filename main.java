class HelloWorld {
    public static void main(String[] args) {

        String exemple = "bonjour";
        System.out.println(exemple);

        StringBuilder Reverse = new StringBuilder(exemple);
        exemple = Reverse.reverse().toString();
        System.out.println(exemple);

    }
}
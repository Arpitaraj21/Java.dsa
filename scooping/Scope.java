public  class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 100;
            System.out.println(a);
        }
        System.out.println(a);
    }
}
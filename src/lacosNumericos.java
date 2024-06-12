public class lacosNumericos {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("1 a 1");
        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("10 a 10");
        for (int i = 0; i <=100; i+=10){
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("i*j");
        for (int i = 1; i <=10; i++){
            for (int j = 1; j <=10; j++){
                System.out.println(j + " x " + i + " = " + i*j);
            }
        }
    }
}

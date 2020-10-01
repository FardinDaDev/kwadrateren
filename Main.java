public class Main {

    public static void main(String[] args) {

        int num = 1350;
        int x = 0;
        int y = 0;
        int z = 0;

        for(int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                //System.out.println("Even: " + i);

                if (i % 6 == 0) {
                    x += 1;
                    
                    int kwadraat = i * i;
                    

                    System.out.println("Kwadraat: " + kwadraat);


                } else {
                    y += 1;
                    System.out.println("Normale integer: " + i);

                }

            } else {
                z += 1;
                //System.out.println("Niet even: " + i);

            }



        }

        System.out.println(x +  " " + y + " " + z);

    }

}
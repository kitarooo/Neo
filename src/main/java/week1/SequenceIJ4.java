package week1;

public class SequenceIJ4 {
    public static void main(String[] args) {
        for (double i = 0.0 ; i < 2.1 ; i += 0.2) {
            for (double j = 1; j <= 3; j++) {
                if (i > 0 && i < 1 || i > 1 && i < 2) {
                    System.out.printf("I=%.1f J=%.1f\n",i,i+j);

                } else {
                    int a =(int) i;
                    int b = (int) (i + j);
                    System.out.printf("I=%d J=%d\n",a,b);

                }
            }
        }
    }
}

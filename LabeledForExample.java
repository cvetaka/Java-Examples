package ForLoop;

public class LabeledForExample {
    public static void main(String[] args) {
        first:
        for (int i = 1; i<=3; i++){
            second:
            for ( int j = 1; j<=3 ; j++){
            if (i==2 && j==2){
                break first;
            }
                System.out.println(i+" "+j);
            }
        }
    }
}

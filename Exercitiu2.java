public class Exercitiu2 {
    public static void main(String[] args) {
        int sum=0;
        int gum=0;
        int dum=0;
        int x = 5;
        for (int i=0;i<=x;i++){
            sum+=i;

        }
        System.out.println("suma cu for este "+sum);

        int n=0;
        while (n<=x){
            gum+=n;
            n++;
        }
        System.out.println("suma cu while este "+gum);
        int c=0;
        do {
            dum+=c;
           c++;
        } while (c<=x);
        System.out.println("suma cu do while este" + dum);

    }
}
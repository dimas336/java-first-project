public class Main
{
    public static void main(String[] args) {
        int a=10;
        int b=48;
        int c=-34;
        int d=13;

        int max1;
        int max2;

        if (a<b){
            max1=b;
        }
        else{
            max1=a;
        }

        if (c<d){
            max2=d;
        }
        else{
            max2=c;
        }

        if (max1<max2){
            System.out.println(max2);
        }
        else{
            System.out.println(max1);
        }
    }
}

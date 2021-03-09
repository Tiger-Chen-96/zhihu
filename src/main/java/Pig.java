public class Pig {
    public static void main(String[] args) {

    }

}
class Person{
    private int A = 1;
    private String AB = "hello";

    public Person(int a, String AB) {
        A = a;
        this.AB = AB;
    }
    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public String getAB() {
        return AB;
    }

    public void setAB(String AB) {
        this.AB = AB;
    }
    public void run(){
        System.out.println("k");
    }

}


//        int[] a = {1,2,3,4,5,6};
//        System.out.println(a);
//        for (int i = 0;i < a.length-1;i++) {
//            int t = a[i];
//            a[i] = a[i + 1];
//            a[i + 1] = t;
//        }
//        System.out.println(a);
//        String[] b = {"apple","banana","pear"};
//        for (String n : b){
//            System.out.println(n);
//        }
//        System.out.println(b);
//        for (int i = 0;i < b.length-1;i++){
//            String t = b[i];
//            b[i] = b[i+1];
//            b[i+1] = t;
//        }
//        for (String n : b){
//            System.out.println(n);
//        }
//        System.out.println(b);
//    }
//}

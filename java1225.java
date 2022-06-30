public class java1225 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        for(;a<=b;a++){
            System.out.println("a="+a+";b="+b);
        }
        System.out.println("Hello World!!");
        NNB();
    }
    public static void NNB(){
        System.out.println("九九乘法表");
        for(int i=1; i<=9; i++){
            for(int j=1; j<=i; j++){

                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}



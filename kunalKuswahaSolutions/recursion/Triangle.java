package kunalKuswahaSolutions.recursion;

public class Triangle {
    public static void main(String[] args) {
       
        printTriangle2(4,0);
    }
    static void printTriangle(int r, int c){
        if(r==0) return;

        if(r>c){
            System.out.print("*");
            printTriangle(r, c+1);
        }else{
            System.out.println();
            printTriangle(r-1, 0);
        }
    }

    static void printTriangle2(int r, int c){
        if(r==0) return;

        if(r>c){
            printTriangle2(r, c+1);
            System.out.print("*");

        }else{
            printTriangle2(r-1, 0);
            System.out.println();
           
        }
    }
}

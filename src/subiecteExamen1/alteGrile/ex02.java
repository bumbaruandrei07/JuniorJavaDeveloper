package subiecteExamen1.alteGrile;

public class ex02 {
//    Which two code fragments can be inserted at Line n1, independently, enable to print Stand?

    public static void main(String[] args){
        //Line 1

        int cardVal = 18;
//      Sau   int cardVal = 14;
        switch (cardVal) {
            case 4: case 5: case 6:
            case 7: case 8:
                System.out.println("Hit");
                break;
            case 9: case 10: case 11:
                System.out.println("Double");
                break;
            case 15: case 16:
                System.out.println("Surrender");
                break;
            default:
                System.out.println("Stand");
        }
    }
}

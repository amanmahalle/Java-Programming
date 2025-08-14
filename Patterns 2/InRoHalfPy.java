//inverted and rotated half pyramid 
//    *
//   **
//  ***
// ****
//inverted and rotated half pyramid in number 
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

public class InRoHalfPy {

    public static void Halfpy(int TotRow) {
        for(int i =1; i <= TotRow; i++){
            for(int j = 1; j <= TotRow - i + 1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Halfpy(5);
    }
}





// public class InRoHalfPy {

//     public static void Halfpy(int TotRow) {
//         for(int i = 1; i <= TotRow; i++){
//             for(int j = 1; j <= TotRow - i; j++){
//                 System.out.print(" ");
//             }
//             for (int j = 1 ; j <= i; j++) {
//                System.out.print("*"); 
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Halfpy(4);
//     }
// }

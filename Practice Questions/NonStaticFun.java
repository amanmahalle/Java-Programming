public class NonStaticFun {
    void printMessage(){
        System.out.println("This a non-static method");
    }
    public static void main(String[] args) {
        NonStaticFun obj = new NonStaticFun();
        obj.printMessage();
    }
}

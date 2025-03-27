public class Main {
    public static void main(String[] args) {
        Block firsBlock = new Block("first block", "0");
        System.out.println("hash for 1st block: "+ firsBlock.hash);
        Block secondBlock = new Block("second block", firsBlock.hash);
        System.out.println("hash of 2nd block: "+ secondBlock.hash );
        Block thirdBlock = new Block("3nd block", secondBlock.hash);
        System.out.println("hash of 3rd block: "+thirdBlock.hash );
    }
}

public class Printing {

    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    
    public static void printSquare(int sideSize) {
        int i = 1;
        while ( i <= sideSize){
            printStars(sideSize);
           
            i++;
                    
        }
        
    }

    public static void printRectangle(int width, int height) {
        int h = 0;
        while (h< height){
            printStars(width);
            h++;
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        while (count <= size){
            printStars(count);
            count ++;
        }
    }
    
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}

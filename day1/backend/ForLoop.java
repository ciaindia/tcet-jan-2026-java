/**
 * CW5: WAP to print 1 to 20 in following format
 * Floor No. 1
 * Floor No. 2
 * ...
 * Floor No. 20
 * 
 * keep 1 second sleep and each print statement
 */

class ForLoop {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 20; i++) {
            // if (i == 13) continue;
            System.out.println("Floor No. " + i);
            Thread.sleep(1000);
            if (i == 13)
                break;
        }
    }
}

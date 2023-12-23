package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */

	
    public void printByteBinary(byte b) {
        // We first want to print the bit in the one's place

    	
    	
        // Shift b seven bits to the right

        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1

    	
        // Print the result using System.out.print (NOT System.out.println)

    	
    	System.out.print((b >> 7)&1);   // 128
    	System.out.print((b >> 6)&1);   // 64
    	System.out.print((b >> 5)&1);   // 32
    	System.out.print((b >> 4)&1);   // 16
    	System.out.print((b >> 3)&1);   // eight
    	System.out.print((b >> 2)&1);  // fours
    	System.out.print((b >> 1)&1);  // bit in twos place
    	System.out.print((b & 1));   // bit in ones place
    	System.out.print(" ");
    	

    	
        //Use this method to print the remaining 7 bits of b
    }

    public void printShortBinary(short s) {
    	// A short is 16 bits or 2 bytes
    	
        // Create 2 byte variables

    	byte b1;
    	byte b2;
    	
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	
    	b1 = (byte) (s & 255);

    	b2 = (byte) ((s >> 8) & 255);
    	
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	
    	printByteBinary(b1);
    	printByteBinary(b2);
    	
    }

    public void printIntBinary(int i) {
        // Create 2 short variables

    	short s1 = (short) (i & 510);
    	short s2 = (short) ((i >> 16) & 510);
    	
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short

    	printShortBinary(s1);
    	printShortBinary(s2);
    	
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    }

    public void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	
    	int i1 = (int) (l & 1020);
    	int i2 = (int) ((l >> 32) & 1020);
    	
    	printIntBinary(i1);
    	printIntBinary(i2);
    }

    public static void main(String[] args) {
    	_01_BinaryPrinter bp = new _01_BinaryPrinter();
    	bp.printByteBinary((byte) 0b00011110);
    	
    	System.out.println();
    	
    	bp.printShortBinary((short) 0b1110001110001111);
    	
    	System.out.println();
    	
    	bp.printIntBinary((int) 0b11100011100011111110001110001111);
    	
    	System.out.println();
    	
    	bp.printLongBinary((long) 0xFFFFFF);
    	
    	
    }
}

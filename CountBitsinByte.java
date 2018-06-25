
public class CountBitsinByte {
    
    static int[] setBitCounts = new int[256];
    
    static {
        // intialize the setBitsCount array using one of the
        // count bit methods.  This could also be hardcoded.
        // Since an array index can only be positive, we bias
        // it.
        for (int i=0; i<256; i++) {
            byte b = (byte) (i - 128);
            setBitCounts[i] = countBits2(b);
//             System.out.println(b+" "+setBitCounts[i]);
        }
    }
    
    /**
     * Main application to test the 4 bit counting methods.
     * 
     * @param args 
     */
    public static void main( String[] args ) {
        
        
        // Count bits
        for (int i=0; i<256; i++) {
            byte b = (byte) (i - 128);
            System.out.println("Bits in " + "b = " + countBits1(b) + " " + countBits2(b) + " " + countBits3(b) + " " + countBits4(b)+" "+b);
        }
        
        
    }
    
    /**
     * Counts the bits in a byte, by masking each bit and checking to 
     * see if the result is zero. Every time the result is not zero, we
     * increment the counter, since that means we found a set bit.
     * 
     * @param test the byte to test
     * @return the number of set bits in the byte
     */
    public static int countBits1(final byte test) {
        byte mask = -128;
        byte count = 0;
        for (int i=0; i<8; i++) {
            if ((test & mask) != 0) {
               count ++; 
            }
            
            // The following line is different from the video,
            // since Java likes to promote EVERYTHING to an int!
            mask = (byte) ((mask & 0xff)>>> 1); // Changed from video!!
        }
        return count;
    }
    
    /**
     * Counts each set bit in a byte. This is the Kernighan bit
     * counting method. It works by subtracting one from the test number,
     * and then ANDing it. This clears the last bit. Each time we clear
     * the last set bit, we increment a counter. When the number is 
     * zero, we stop. By testing only the least significant set bit, this
     * algorithm offers improvement over testing every bit.
     * 
     * @param test the byte to test
     * @return the number of set bits in the byte
     */
    public static int countBits2(byte test) {
        byte count;
        for (count=0; test!=0; count++) {
            test &= (test - 1);
        }
        return count;
    }
    
    /**
     * Uses the population count to count bits. This counts the bits in groups
     * of powers of two. 
     * 
     * @param test the byte to test
     * @return the number of set bits in the byte
     * @see <a href="http://en.wikipedia.org/wiki/Hamming_weight">hamming weight</a>
     */
    public static int countBits3(final byte test) {
        byte i = test;   
        //x = (x & mask[i]) + ((x >> shift) & mask[i]);     
        final byte mask1 = 0b01010101;
        final byte mask2 = 0b00110011;
        final byte mask3 = 0b00001111;

        i = (byte) ((byte) (i & mask1) + (byte)(((byte) (i >>> 1)) & mask1));
        i = (byte) ((byte) (i & mask2) + (byte)(((byte) (i >>> 2)) & mask2));
        i = (byte) ((byte) (i & mask3) + (byte)(((byte) (i >>> 4)) & mask3));
        return i;
    }
    
    /**
     * Simple lookup to see how many bits are in a byte.  This is the fastest,
     * since it requires a simple lookup. Great for bytes, but would be too
     * large for larger integers.
     * 
     * @param test the byte to test
     * @return the number of set bits in the byte
     */
    public static int countBits4(final byte test) {
        return CountBitsinByte.setBitCounts[test + 128];
    }
    
}

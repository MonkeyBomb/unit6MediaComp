/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }
    /** Method to test zeroRed */
    public static void testZeroRed()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroRed();
        beach.explore();
    }
    /** Method to test zeroGreen */
    public static void testZeroGreen()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroGreen();
        beach.explore();
    }
    

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }
    public static void testMirrorHorizontal()
    {
        Picture one = new Picture("5.jpg");
        one.explore();
        one.mirrorHorizontal();
        one.explore();
    }
     public static void testMirrorDiagonal()
    {
        Picture one = new Picture("snowman.jpg");
        one.explore();
        one.mirrorDiagonal();
        one.explore();
    }
    public static void testmirrorHorizontalBotToTop()
    {
        Picture one = new Picture("snowman.jpg");
        one.explore();
        one.mirrorHorizontalBotToTop();
        one.explore();
    }
    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }
    
    public static void testMirrorArms()
    {
        Picture temple = new Picture("snowman.jpg");
        temple.explore();
        temple.mirrorArms();
        temple.explore();
    }
    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }
    
    public static void testMirrorVerticalRightToLeft()
    {
        Picture temple = new Picture("snowman.jpg");
        temple.explore();
        temple.mirrorVerticalRightToLeft();
        temple.explore();
    }
    public static void testCropAndCopy()
    {
        Picture one = new Picture("snowman.jpg");
        Picture two = new Picture("snowman.jpg");
        one.explore();
        two.cropAndCopy( one, 9, 155 , 23 , 137 , 0 , 0);
        two.explore();
        
        
    }
    
    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        testZeroRed();
        testZeroGreen();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        testMirrorVertical();
        testMirrorHorizontal();
        testMirrorTemple();
        testMirrorArms();
        testCropAndCopy();
        //testMirrorGull();
        testMirrorDiagonal();
        testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}
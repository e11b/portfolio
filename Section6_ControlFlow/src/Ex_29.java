public class Ex_29 {

    public static void main(String[] args) {

        //getBucketCount(2.75, 3.25, 2.5, 1);
        //getBucketCount(7.25, 4.3, 2.35);
        getBucketCount(3.26, 0.75);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        double paintableArea = width*height;
        double remainingArea;
        if (width <=0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            System.out.println("Area to be painted is " + paintableArea);
            System.out.println("Area able to be covered with current paint is " + areaPerBucket*extraBuckets);

            if (areaPerBucket*extraBuckets >= paintableArea) {
                return 0;
            } else {
                remainingArea = paintableArea - areaPerBucket*extraBuckets;
                double additionalPaint = Math.ceil(remainingArea / areaPerBucket);




                System.out.println("Remaining area to be painted is " + remainingArea);
                System.out.println("");
                System.out.println("Additional Paint: " + additionalPaint);


                System.out.println("return is " + (int)additionalPaint);
                return (int)additionalPaint;
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double areaToPaint = width*height;
        double remainingArea;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            System.out.println("AreaToPaint = " + areaToPaint);
            System.out.println("Area per bucket = " + areaPerBucket);

            System.out.println((int)(Math.ceil(areaToPaint/areaPerBucket)));
            return (int)(Math.ceil(areaToPaint/areaPerBucket));
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <=0) {
            return -1;
        } else {
            System.out.println((int)(Math.ceil(area/areaPerBucket)));
            return (int)(Math.ceil(area/areaPerBucket));
        }
    }
}

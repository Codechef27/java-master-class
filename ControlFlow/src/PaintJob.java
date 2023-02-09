public class PaintJob {

    public static void main(String[] args) {

        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(4.5, 2, 1.5, 0));

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
        double totalArea = width * height;
        double paintCoverage = (totalArea - (areaPerBucket * extraBuckets)) / areaPerBucket;


        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        return (int) Math.ceil(paintCoverage);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {


        double totalArea = width * height;
        double paintCoverage = totalArea / areaPerBucket;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        return (int) Math.ceil(paintCoverage);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucketsToBuy = area / areaPerBucket;
        return (int) Math.ceil(bucketsToBuy);


    }
}
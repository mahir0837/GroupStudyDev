package codewars;

public class GetVolumeOfCuboid {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length*width*height;
    }

    public static void main(String[] args) {
        System.out.println(getVolumeOfCuboid(1, 2, 2));
    }
}

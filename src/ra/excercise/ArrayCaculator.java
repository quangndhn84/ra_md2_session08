package ra.excercise;

public class ArrayCaculator {
    //Không có thuộc tính
    //Không có constructor
    public int maxOfArray(int[] arrInt) {
        if (arrInt.length == 0) {
            return 0;
        } else {
            int max = arrInt[0];
            for (int i = 1; i < arrInt.length; i++) {
                if (max < arrInt[i]) {
                    max = arrInt[i];
                }
            }
            return max;
        }
    }

    public double maxOfArray(double[] arrDouble) {
        if (arrDouble.length == 0) {
            return 0;
        } else {
            double max = arrDouble[0];
            for (int i = 1; i < arrDouble.length; i++) {
                if (max < arrDouble[i]) {
                    max = arrDouble[i];
                }
            }
            return max;
        }
    }

    public int minOfArray(int[] arrInt) {
        if (arrInt.length == 0) {
            return 0;
        } else {
            int min = arrInt[0];
            for (int i = 1; i < arrInt.length; i++) {
                if (min > arrInt[i]) {
                    min = arrInt[i];
                }
            }
            return min;
        }
    }

    public double minOfArray(double[] arrDouble) {
        if (arrDouble.length == 0) {
            return 0;
        } else {
            double min = arrDouble[0];
            for (int i = 1; i < arrDouble.length; i++) {
                if (min > arrDouble[i]) {
                    min = arrDouble[i];
                }
            }
            return min;
        }
    }

    public static void main(String[] args) {
        int[] arrInt = {3, 7, 1, 9, 2};
        ArrayCaculator arrayCaculator = new ArrayCaculator();
        System.out.println("Giá trị nhỏ nhất: "+arrayCaculator.minOfArray(arrInt));
        System.out.println("Giá trị lớn nhất: "+arrayCaculator.maxOfArray(arrInt));
    }

}

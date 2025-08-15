package ödev;

public class ArrayDuplicate {
    static boolean isFound(int[] arr, int val) {
        for (int i : arr) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 0;
        int[] list = {1, 2, 3, 2, 4, 5, 5, 4, 6, 7};
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    if (!isFound(newList, list[i])) {
                        newList[number++] = list[i];
                    }

                }
            }
        }
        for (int i : newList) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}

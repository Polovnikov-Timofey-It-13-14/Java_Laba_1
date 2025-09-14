public class Task4 {
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--)
            if (arr[i] == x)
                return i;

        return -1;
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] New = new int[arr.length + 1];

        for(int i = 0; i < pos; i++) {
            New[i] = arr[i];
        }

        New[pos] = x;

        for(int i = pos; i < arr.length; i++) {
            New[i + 1] = arr[i];
        }

        return New;
    }

    public void reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            int New = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = New;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] Res = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++)
            Res[i] = arr1[i];

        for (int i = 0; i < arr2.length; i++)
            Res[arr1.length + i] = arr2[i];

        for(int i = 0; i < arr1.length + arr2.length; i++)
            System.out.println(Res[i]);
        return Res;
    }

    public int[] deleteNegative(int[] arr) {
        int Number = 0;

        for (int Num : arr)
            if (Num >= 0)
                Number++;

        int[] result = new int[Number];
        int index = 0;

        for (int Num : arr)
            if (Num >= 0)
                result[index++] = Num;

        for (int j : result) {
            System.out.println(j);
        }
        return result;
    }
}

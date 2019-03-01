package by.htp.zanko;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ArraySorting {

    public int[] getArraySorting(int[] arrayInt){

        for (int i = 0; i < arrayInt.length; i++) {

            int min = arrayInt[i];
            int min_i = i;

            if ((i % 2) == 0) {
                for (int j = i + 2; j < arrayInt.length; j++) {

                    if (arrayInt[j] < min) {
                        min = arrayInt[j];
                        min_i = j;
                    }
                }

                if (i != min_i) {
                    int tmp = arrayInt[i];
                    arrayInt[i] = arrayInt[min_i];
                    arrayInt[min_i] = tmp;
                }
            }
        }
        return arrayInt;
    }
}

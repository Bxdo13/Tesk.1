public class Example4 {

    public class DynamicIntegerArray {
        int size = 6;
        int[] array = new int[size];
        int index = size;

        public int[] add(int value) {
            --index;
            if (index < 0) {
                int[] temp = new int[++size];
                temp[0] = value;
                for (int i = 1; i < size; i++) {
                    temp[i] = array[i];
                }
                array = temp;
            }
            array[index] = value;
            return array;
        }

        public int[] removeAt(int indexOfElement) {
            int[] temp = new int[--size];
            int count = 0;
            for (int i = 0; i < size; i++) {

                if (i == indexOfElement) {
                    temp[i] = array[i + 1];
                    ++count;
                } else
                    temp[i] = array[i + count];
            }
            array = temp;
            return array;
        }

        public void addAt(int index, int value) {
            if (index >= size) {
                System.out.println("index out of array size");
            } else {
                int[] temp = new int[++size];
                for (int i = 0; i < index; i++) {
                    temp[i] = array[i];
                }
                temp[index] = value;
                for (int i = index + 1; i < size; i++) {
                    temp[i] = array[i + 1];
                }
                array = temp;
            }
        }

        public void remove(int value) {
            int count = 0;
            boolean isThere = true;
            for (int i = 0; i < size; i++) {
                if (array[i] == value) {
                    ++count;
                    isThere = false;
                }
            }
            if (!isThere) {
                int[] temp = new int[size - count];
                for (int i = 0; i < size - count; i++) {
                    for (int j = 0; j < size; j++) {
                        if (array[j] == value) {
                            continue;
                        } else {
                            temp[i] = array[j];
                        }
                    }
                    array = temp;
                }
            }
        }
    }
}

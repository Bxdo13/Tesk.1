import java.util.Arrays;

public class DynamicIntegerArray {
        int size = 6;
        int[] array = new int[size];
        int index = -1;

        public void resize(int [] array){
          int [] temp= new int[++size];
            for (int i = 0; i < size-1; i++) {
                temp[i] = array[i];
            }
            this.array = temp;
        }
        public int[] add(int value) {

            if (index ==size-1) {
                resize(array);
            }
            ++index;
            array[index] = value;
            return array;
        }

        public void removeAt(int indexOfElement) {
            int[] temp = new int[--size];
            int count = 0;
            for (int i = 0; i < indexOfElement; i++) {
                    temp[i] = array[i];
            }
            for (int i = indexOfElement; i <size ; i++) {
                temp[i]=array[i+1];
            }
            array = temp;
        }

        public void addAt(int index, int value) {
            if (index >= size) {
                System.out.println("ERROR! Index out of array size");
            } else {
                resize(array);
                for (int i = size-1; i >index; i--) {
                    array[i]=array[i-1];
                }
                array[index]=value;
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
                int index=0;
                for (int i = 0; i < size; i++) {
                    if (array[i] == value) {
                        continue;
                    }
                   temp[index]=array[i];
                    ++index;
                    }
                    array = temp;
                }
            }
    @Override
    public String toString() {
        return Arrays.toString(array) ;
    }
}

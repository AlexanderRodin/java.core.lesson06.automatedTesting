import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Integer[] value = {1, 2, 4, 2, 4, 3, 4, 1, 7};
        Integer num = 4;
        List<Integer> array  = new ArrayList<>(Arrays.asList(value));
        newArr(array, num);

    }

    public static void newArr (List<Integer> arr, Integer number){
        Integer count = 0;
        for (Integer list: arr) {
            if(list == number) count++;
        }
        if(count > 0) System.out.println(newList(arr, number));
            else throw new RuntimeException("RuntimeException");
    }


    public static List<Integer> newList (List<Integer> sourceArray, Integer num){
       List<Integer> newArrayList = new ArrayList<>();
       Integer index = sourceArray.lastIndexOf(num)+1;
       for(int i = index; i < sourceArray.size();i++){
           newArrayList.add(sourceArray.get(i));
       }
       return newArrayList;
    }
}

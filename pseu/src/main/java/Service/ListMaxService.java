package Service;
import java.util.ArrayList;

public class ListMaxService {

    public int getMax(ArrayList<Integer>arr){
        if(arr.isEmpty())
            throw new NullPointerException();
        int max= Integer.MIN_VALUE;
        for (int i = 0; i<arr.size(); i++){
            if(arr.indexOf(i)>max)
                max=arr.indexOf(i);
        }
        return max;
    }

}



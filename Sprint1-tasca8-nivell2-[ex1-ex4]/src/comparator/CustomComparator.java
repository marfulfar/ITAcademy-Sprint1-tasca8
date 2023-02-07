package comparator;

import java.util.Comparator;

public class CustomComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        int returnValue=0;
        o1.toString().replaceAll("a","4");
        if (o1.toString().contains("a")){
            returnValue=-1;
        }else{
            returnValue=1;
        }
        return returnValue;
    }


}

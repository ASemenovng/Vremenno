import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class GameHelper {
    List<Integer> moveAndMergeEqual(List<Integer> list){
       int count = 0;
       for ( int i = 0; i < list.size (); ++i ){
           if(list.get (i) == null){
               ++count;
               list.remove (i);
           }
           try{
               if( list.get (i).equals (list.get (i + 1))){
                   list.set (i, 2 * list.get (i));
                   list.remove (i + 1);
                   continue;
               }
           }catch (NullPointerException e) {}
        }
        Collections.sort (list);
       for ( int i = 0; i < count; ++i ){
           list.add (null);
       }
       return list;
    }
}

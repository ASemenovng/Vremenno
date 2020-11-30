import java.util.*;

public class SquareBoard extends Board{

    private int size;
    private int weigh;
    private int height;
    private Map<Key, Integer> board = new HashMap<> ();

    public SquareBoard(int size){
        this.size = size;
    }

    @Override
    public void fillBoard(List<Integer> list){
        for( int i = 0; i < list.size (); ++i ){
            Key key = new Key (0, i);
            board.put (key, list.get (i));
        }
    }

    @Override
    public List<Key> availableSpace() {
        List<Key> nullList = new ArrayList<> ();
        for(Map.Entry<Key, Integer> pair: board.entrySet ()){
            if (pair.getValue () == null){
                nullList.add (pair.getKey ());
            }
        }
        return nullList;
    }

    @Override
    public void addItem(Key key, Integer value){
        if(board.containsKey (key)){
            System.out.println ("Такой ключ уже существует. Введите новый");
        }
        else {
            board.put (key, value);
        }
    }

    @Override
    public Key getKey(int i, int j){
        Key keyTmp = null;
        for( Key key: board.keySet ()){
            if(key.getI () == i && key.getJ () == j){
                keyTmp = key;
            }
        }
        return keyTmp;
    }

    @Override
    public Integer getValue(Key key){
        Integer integer = null;
        for(Map.Entry<Key, Integer> pair: board.entrySet ()){
            if (pair.getKey ().equals (key)){
                integer = pair.getValue ();
            }
        }
        return integer;
    }

    @Override
    public List<Key> getColumn(int j){
        List<Key> list = new ArrayList<> ();
        for( Key key: board.keySet ()){
            if (key.getJ () == j){
                list.add (key);
            }
        }
        return list;
    }

    @Override
    public List<Key> getRow(int i){
        List<Key> list = new ArrayList<> ();
        for( Key key: board.keySet ()){
            if (key.getJ () == i){
                list.add (key);
            }
        }
        return list;
    }

    @Override
    public boolean hasValue(Integer value){
        if (board.containsValue (value)){
            return true;
        }
        else return true;
    }

    @Override
    public List<Integer> getValues(List<Key> keys) {
        List<Integer> listValue = new ArrayList<> ();
        for(Key key: keys){
            if(board.containsKey (key)){
                listValue.add (board.get (key));
            }
            else System.out.println ("Такого ключа " + key + " нет");
        }
        return listValue;
    }

}

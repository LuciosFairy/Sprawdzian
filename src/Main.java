import java.util.ArrayList;
import java.util.List;

/**
 <Klasa ma za zadanie zapamietywanie wszystkie rownania wprowadzone do programu>
 **/
public class Main {
    public static void main(String[] args) {
        class Lista{
            private List<RownanieKwadratowe> rownania;

            public Lista(){
                rownania = new ArrayList<>();
            }
            public void dodajRownanie(RownanieKwadratowe rownania){
                rownania.add(rownania);
            }
            public RownanieKwadratowe getRownanieKwadratowe(int index){
                return rownania.get(index);
            }
            public int Rozmiar(){
                return rownania.size();
            }
        }

    }
}
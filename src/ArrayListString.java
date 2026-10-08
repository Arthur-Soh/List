public class ArrayListString {
    private String[] tab;
    private int taille;

    public ArrayListString(){
        this(5);
    }

    public ArrayListString (int capacite){
        tab = new  String[capacite];
        taille=0;
    }

    public void add(String s){

        if (taille == tab.length){
            // Nouveau tableau 2 fois plus grand
            String[]tab2 = new String[tab.length*2];

            // on copie les valeurs dans le nouveautableau

            for(int i=0; i<taille; i++){
                tab2[i] = tab[i];
            }

            
        }else {
        tab[taille] = s;
        taille ++;}
    }

    public void printlist(){
        for (int i = 0; i<taille; i++){
            System.out.println(tab[i]);
        }
    }

    public int getTaille() {
        return taille;
    }

    public String remove(int index){

        if(index<0 || index>taille){
            throw new ArrayIndexOutOfBoundsException();
        }
        String recup = tab[index];
        for (int i=index; i<taille-1; i++){
            tab[i] = tab[i+1];
        }

        tab[taille-1] = null;
        taille--;
        return recup;
    }
}



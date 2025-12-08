public class Director {
    private String name;
    private String surname;
    private int numDirectedMovies;
    private Date DOb;

    public Director(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setNumDirectedMovies(int nMovies) {
        this.numDirectedMovies = nMovies;
    }

    public void setDOb(Date DOb) {
        this.DOb = DOb;
    }

    public int getNumDirectedMovies() {
        return numDirectedMovies;
    }

    public Date getDOb() {
        return DOb;
    }

    @Override
    public String toString(){
        return "Director [ name = "+name+", surname = "+surname+", dob = "+DOb+", movies directed = "+numDirectedMovies+"]";
    }


}

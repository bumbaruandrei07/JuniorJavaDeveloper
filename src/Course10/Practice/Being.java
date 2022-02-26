package C10.Practice;

public class Being {
    private String species;

    public Being(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Being other = (Being) obj;
        if (this.species.equals(other.species)) {
            return true;
        }

        return false;
    }
}
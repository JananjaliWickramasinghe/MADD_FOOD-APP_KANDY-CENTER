package Model;

public class Catogery {
    private String Name;
    private String Image;

    public Catogery() {
    }

    public Catogery(String name, String image) {
        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}

package daytenhag;

public class Hewan {
    private String walk;
    private String hermaprodit;
    private String eat;
    private String object;

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getHermaprodit() {
        return hermaprodit;
    }

    public void setHermaprodit(String hermaprodit) {
        this.hermaprodit = hermaprodit;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Hewan(String walk, String hermaprodit, String eat, String object) {
        this.walk = walk;
        this.hermaprodit = hermaprodit;
        this.eat = eat;
        this.object = object;
    }
}

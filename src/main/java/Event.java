public abstract class Event {

    private String name;
    private String type;
    private String location;

    public Event(String name, String type, String location){
        this.name = name;
        this.type = type;
        this.location = location;
    }

    public String getName(){
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getLocation() {
        return this.location;
    }
}

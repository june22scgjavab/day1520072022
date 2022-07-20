package arraytolist;

public class Mobile {
private int id;
private String name;
public Mobile(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Mobile [id=" + id + ", name=" + name + "]";
}

}

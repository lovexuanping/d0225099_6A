package useX;

import java.util.*;

interface Component {
    void quetionset();
}
class frame implements componentx {
    private String quetion;
    frame(String quetion) {
        this.quetion = quetion;
    }
    public void quetionset() {
        System.out.println(quetion);
    }
}
class quetion implements componentx {
    List<componentx> list = new ArrayList<componentx>();
    public void add(componentx component) {
        list.add(component);
    }
    public void quetionset() {
        for(componentx component : list) {
        	component.quetionset();
        }
    }
}
public class q6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame que = new frame("quetion");
        
        quetion quetion1 = new quetion();
        quetion1.add(new frame("1+1=?"));
        quetion1.add(new frame("1+3=?"));
        quetion all = new quetion();
        all.add(que);
        all.add(quetion1);
        
        all.quetionset();
	}

}

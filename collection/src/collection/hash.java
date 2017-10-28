package collection;
import java.util.HashMap;
public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> o=new HashMap<>();
o.put("1","ram");
o.put("2","rohit");
o.get("1");
for(int i=1;i<=o.size();i++)
{
	String k=String.valueOf(i);
	System.out.println(o.get(k).toString());
}
	}

}

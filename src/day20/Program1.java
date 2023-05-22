package day20;
import java.util.HashMap;
import java.util.Map;


public class Program1 {

	public static void main(String[] args) {
HashMap<Integer,String>sd=new HashMap<>();
sd.put(101, "aaa");
sd.put(102, "bbb");
sd.put(103, "ccc");
System.out.println(sd);

System.out.println(sd.keySet());
System.out.println(sd.values());
System.out.println(sd.entrySet());

System.out.println(sd.containsKey(101));

System.out.println(sd.containsKey(104));

System.out.println(sd.containsValue("aaa"));

System.out.println(sd.containsValue("AAA"));

System.out.println(sd.size());
sd.remove(101);
sd.remove(101,"aaa");
System.out.println(sd);

sd.put(102, "BBB");
System.out.println(sd);

sd.replace(104, "ddd");

sd.replace(102, "BBB");

System.out.println(sd);

for(Integer KeysData:sd.keySet())
{
System.out.println(KeysData);
}
for(String valueData:sd.values())
{
	System.out.println(valueData);
	
}
for(Map.Entry<Integer,String>entrydata:sd.entrySet())
	
{
	System.out.println(entrydata.getKey());
}
for(Map.Entry<Integer,String>entrydata:sd.entrySet())
{
	System.out.println(entrydata.getValue());
}
sd.clear();
System.out.println(sd);

System.out.println(sd.isEmpty());

	
}
{
	
}




	}



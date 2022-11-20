import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> aSet = new TreeSet<Integer>();
		Set<Integer> bSet = new TreeSet<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a; i++) {
			aSet.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < b; i++) {
			bSet.add(Integer.parseInt(st.nextToken()));
		}
		
		aSet.removeAll(bSet);
		System.out.println(aSet.size());
		
		Iterator<Integer> it = aSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		People[] arr = new People[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			People people = new People(w, h);
			arr[i] = people;
		}
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			count = 0;
			
			for (int j = 0; j < n; j++) {
				
				if (arr[i].weight < arr[j].weight && arr[i].height < arr[j].height) {
					count++;
				}
			}
			
			System.out.print(count + 1 + " ");
		}
	}
}

class People {
	int weight;
	int height;
	
	public People(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
}
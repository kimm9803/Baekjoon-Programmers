#include <iostream>
#include <vector>
#include <queue>

using namespace std;

bool check[101];
vector<int> a[101];
int sum = 0;

void bfs(int start) {
	queue<int> q;
	q.push(start);
	check[start] = true;
	
	while(!q.empty()) {
		int x = q.front();
		q.pop();
		
		for (int i = 0; i < a[x].size(); i++) {
			int y = a[x][i];
			if(!check[y]) {
				q.push(y);
				check[y] = true;
				sum++;
			}
		}
	}
}

int main()
{
	int node, edge;
	cin >> node;
	cin >> edge;
	
	for (int i = 0; i < edge; i++) {
		int u, v;
		cin >> u >> v;
		a[u].push_back(v);
		a[v].push_back(u);
	}
	bfs(1);
	cout << sum;
}
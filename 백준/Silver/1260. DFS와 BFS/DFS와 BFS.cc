#include <iostream>
#include <vector>
#include <queue>
#include <string.h>
#include <algorithm>
using namespace std;

bool check[1001];
vector<int> a[1001];

void bfs(int v) {
	queue<int> q;
	q.push(v);
	check[v] = true;
	
	while (!q.empty()) {
		int x = q.front();
		q.pop();
		cout << x << " ";
		
		for (int i = 0; i < a[x].size(); i++) {
			int y = a[x][i];
			if (!check[y]) {
				q.push(y);
				check[y] = true;
			}
		}
	}
}

void dfs(int v) {
	if (check[v])	return;
	check[v] = true;
	cout << v << " ";
	
	for (int i = 0; i < a[v].size(); i++) {
		int y = a[v][i];
		dfs(y);
	}
}

int main()
{
	int node, edge, v;
	cin >> node >> edge >> v;
	for (int i = 0; i < edge; i++) {
		int w, h;
		cin >> w >> h;
		a[w].push_back(h);
		a[h].push_back(w);
	}
	for (int i = 1; i <= node; i++) {
		sort(a[i].begin(), a[i].end());
	}
	
	dfs(v);
	memset(check, false, sizeof(check));
	cout << endl;
	bfs(v);
	return 0;
}
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<string, int> a, pair<string, int> b) {
	return a.second > b.second; //내림차순 정렬
}

int main()
{
	int T, n;
	vector < pair<string, int>> v;
	cin >> T;
	
	for (int i = 0; i < T; i++) {
		cin >> n;
		for (int j = 0; j < n; j++)
		{
			string uni;
			int alcohol;
			cin >> uni >> alcohol;
			v.push_back(pair<string, int>(uni, alcohol));
		}
		sort(v.begin(), v.end(), compare);
		cout << v[0].first << endl;
	}
	return 0;
}
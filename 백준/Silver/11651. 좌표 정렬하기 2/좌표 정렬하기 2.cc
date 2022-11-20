#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

bool compare(pair<int, int> a, pair<int, int> b) {
	if (a.second == b.second) {
		return a.first < b.first;
	}
	return a.second < b.second;
}

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(NULL);
	cin.tie(NULL);

	int n;
	cin >> n;
	vector<pair<int, int>> v;

	for (int i = 0; i < n; i++) {
		int x, y;
		cin >> x >> y;
		v.push_back(pair<int, int>(x, y));
	}

	sort(v.begin(), v.end(), compare);

	for (int i = 0; i < v.size(); i++) {
		cout << v[i].first << " " << v[i].second << '\n';
	}

	return 0;
}
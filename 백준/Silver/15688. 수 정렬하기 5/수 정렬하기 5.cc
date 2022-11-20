#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

bool compare(int a, int b) {
	return a < b;
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n, i;
	vector<int> v;
	cin >> n;
	for (i = 0; i < n; i++) {
		int a;
		cin >> a;
		v.push_back(a);
	}
	sort(v.begin(), v.end(), compare);
	
	for (i = 0; i < v.size(); i++) {
		cout << v[i] << '\n';
	}
	return 0;
}
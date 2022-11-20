#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
	int n;
	vector<int> v;
	cin >> n;
	
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		v.push_back(a);
	}
	sort(v.begin(), v.end());
	v.erase(unique(v.begin(), v.end()), v.end());

	for (int i = 0; i < v.size(); i++) {
		cout << v[i] << " ";
	}
	cout << '\n';
	return 0;
}
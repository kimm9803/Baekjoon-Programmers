#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(NULL);
	
	int n;
	cin >> n;
	vector<int> v;
	
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		v.push_back(a);
	}
	sort(v.begin(),v.end());
	
	for (int i = 0; i < n; i++) {
		cout << v[i] << '\n';
	}
	
	return 0;
}
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n; // 수의 개수
	int k; // k번째 수
	cin >> n;
	cin >> k;
	vector<int> v;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		v.push_back(a);
	} 
	sort(v.begin(), v.end());
	
	cout << v[k-1];
	return 0;
}
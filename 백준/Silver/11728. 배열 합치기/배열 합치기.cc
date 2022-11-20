#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int a, b;
	vector<int> v;
	cin >> a >> b;
	
	for (int i = 0; i < a; i++) {
		int na;
		cin >> na;
		v.push_back(na);
	}
	for (int i = 0; i < b; i++) {
		int nb;
		cin >> nb;
		v.push_back(nb);
	}
	sort(v.begin(), v.end());
	
	for (int j = 0; j < v.size(); j++) {
		cout << v[j] << " ";
	}
	return 0;
}
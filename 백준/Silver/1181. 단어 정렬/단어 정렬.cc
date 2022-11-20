#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

bool compare(string a, string b) {
	if (a.length() == b.length()) {
		return a < b;
	}
	return a.length() < b.length();
}

int main()
{
	int n;
	cin >> n;
	vector<string> v;
	
	for (int i = 0; i < n; i++) {
		string word;
		cin >> word;
		v.push_back(word);
	}
	sort(v.begin(), v.end(), compare);
	v.erase(unique(v.begin(), v.end()), v.end());
	
	for (int i = 0; i < v.size(); i++) {
		cout << v[i] << '\n';
	}
	return 0;
}
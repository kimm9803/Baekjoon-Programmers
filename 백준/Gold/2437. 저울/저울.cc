#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
	int n; // 수의 개수
	cin >> n;
	vector<int> v; // 추 저장 벡터 
	int sum = 0;
	for (int i = 0; i < n; i++) {
		int chu;
		cin >> chu;
		v.push_back(chu);
	}
	sort(v.begin(), v.end());
	
	for (int i = 0; i < n; i++) {
		if (v[i] > sum + 1){
			break;
		}
		sum += v[i];
	}
	cout << sum + 1;
	return 0;
}
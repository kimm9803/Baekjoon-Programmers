#include <iostream>
#include <algorithm>
#include <map>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n; //상근 숫자카드 개수
	cin >> n;
	map<int, int> arr1;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		arr1[a]++;
	} 
	
	int m;
	cin >> m;
	for (int i = 0; i < m; i++) {
		int b;
		cin >> b;
		cout << arr1[b] << " ";
	}
	return 0;
}
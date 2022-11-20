#include <iostream>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n, i;
	int min = 1000001;
	int max = -1000000;
	int arr[1000001] = {};
	
	cin >> n;
	
	for (i = 0; i < n; i++) { //배열에 값 입력 
		cin >> arr[i];
	}
	
	for (i = 0; i < n; i++) {
		if (min > arr[i]) {
			min = arr[i];
		}
	}
	
	for (i = 0; i < n; i++) {
		if (max < arr[i]) {
			max = arr[i];
		}
	}
	cout << min << " " << max << "\n";
	return 0;
}
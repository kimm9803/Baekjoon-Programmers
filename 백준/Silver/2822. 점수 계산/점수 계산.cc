#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

bool compare(pair<int, int> a, pair<int, int> b) { // 내림차순 정렬 
	return a.first > b.first;
}

int main()
{
	int sum = 0;
	vector<pair<int, int>> scores;
	int num[5] = { 0 };
	for (int i = 0; i < 8; i++) {
		int score;
		cin >> score;
		scores.push_back(pair<int, int>(score, i + 1));
	}
	sort(scores.begin(), scores.end(), compare);

	for (int j = 0; j < 5; j++) {
		num[j] = scores[j].second;
		sum += scores[j].first;
	}
	cout << sum << endl;

	sort(num, num + 5);
	for (int k = 0; k < 5; k++) {
		cout << num[k] << " ";
	}
	return 0;
}
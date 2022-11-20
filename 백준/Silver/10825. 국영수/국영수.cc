#include <iostream>
#include <algorithm>
using namespace std;

class Student {
public:
	string name;
	int korean, english, math;
};

Student s[100001];

bool compare(Student& a, Student& b) {
	if (a.korean == b.korean && a.english == b.english && a.math == b.math) {
		return a.name < b.name;
	}
	if (a.korean == b.korean && a.english == b.english) {
		return a.math > b.math;
	}
	if (a.korean == b.korean) {
		return a.english < b.english;
	}
	return a.korean > b.korean;
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n; // 학생 수
	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> s[i].name >> s[i].korean >> s[i].english >> s[i].math;
	}
	sort(s, s + n, compare);

	for (int j = 0; j < n; j++) {
		cout << s[j].name << '\n';
	}
	return 0;
}
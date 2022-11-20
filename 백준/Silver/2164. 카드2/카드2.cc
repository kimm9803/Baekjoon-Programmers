#include <iostream>
#include <queue>
using namespace std;
 
int main()
{
    int n;
    queue<int> que;
    
    cin >> n;
    
    for (int i = 1; i <= n; i++) {
    	que.push(i);
	}
	
    while (que.size() > 1) {
    	que.pop();
    	que.push(que.front());
    	que.pop();
	}
	cout << que.front() << endl;
	return 0;
}
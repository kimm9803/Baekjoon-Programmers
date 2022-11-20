#include <iostream>
using namespace std;
 
int main()
{
    int n; // 숫자의 갯수
    char ch;
    cin >> n;
    int total = 0;

    for (int i = 0; i < n; i++)
    {
        cin >> ch;
        total += ch - 48;  // char형으로 받았으므로, 아스키코드 '0'의 값, 48을 빼줌
    }
    cout << total << endl;
    return 0;
}
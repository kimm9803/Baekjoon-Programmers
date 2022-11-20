#include <iostream>
using namespace std;

int main()
{
    int i, j, temp, min, index;
    int arr[3] = {};
    for (i = 0; i < 3; i++) {
        cin >> arr[i];
    }
    for (i = 0; i < 3; i++) {
        min = 1000001;
        for (j = i; j < 3; j++) {
            if (min > arr[j])
            {
                min = arr[j];
                index = j;
            } 
        }
        temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
    for (i = 0; i < 3; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}
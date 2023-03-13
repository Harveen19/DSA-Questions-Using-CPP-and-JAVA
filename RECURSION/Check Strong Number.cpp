#include <iostream>
using namespace std;

int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

bool isStrongNumber(int n) {
    int sum = 0;
    int temp = n;
    while (temp > 0) {
        int digit = temp % 10;
        sum += factorial(digit);
        temp /= 10;
    }
    return sum == n;
}

int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        if (isStrongNumber(n)) {
            cout << "Strong" << endl;
        } else {
            cout << "Not Strong" << endl;
        }
    }
    return 0;
}

#include <iostream>
#include <cmath>

int main() {

    int w;
    int l;
    int s;
    int f;
    int Digits;

    std::cin >> w;
    std::cin >> l;

    s = (w + l) * 2;
    l = w * l;


    f = w * w;


    Digits = f * l + s;


    if (Digits > 0) {
        int numDigits = (int)log10(Digits) + 1;
        std::cout << numDigits << std::endl;
    }

    else {
        std::cout << std::endl;
    }

    return 0;
}
